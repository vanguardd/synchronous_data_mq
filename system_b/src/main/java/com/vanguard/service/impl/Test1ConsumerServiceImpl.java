package com.vanguard.service.impl;

import com.vanguard.domain.Test1;
import com.vanguard.service.Test1ConsumerService;
import com.vanguard.service.Test1Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;

/**
 * @Title:
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/01/24
 */
@Service
public class Test1ConsumerServiceImpl implements Test1ConsumerService {

    private static Logger logger = LoggerFactory.getLogger(Test1ConsumerService.class);

    @Autowired
    private Test1Service test1Service;

    @Override
    @JmsListener(destination = "test1-add-queue")
    public void addQueue(Test1 test1) {
        logger.info("系统B收到test1添加数据的消息，执行添加操作：" + test1);
        //接收到消息
        test1Service.add(test1);

    }

    @Override
    @JmsListener(destination = "test1-update-queue")
    public void updateQueue(Test1 test1) {
        logger.info("系统B收到test1更新数据的消息，执行更新操作：" + test1);
        //接收到消息
        test1Service.update(test1);

    }

    @Override
    @JmsListener(destination = "test1-delete-queue")
    public void deleteQueue(Test1 test1) {
        logger.info("系统B收到test1删除数据的消息，执行删除操作，删除数据的id为：" + test1.getId());
        test1Service.delete(test1.getId());
    }
}
