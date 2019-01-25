package com.vanguard.service.impl;

import com.vanguard.domain.Test2;
import com.vanguard.service.Test1ConsumerService;
import com.vanguard.service.Test2ConsumerService;
import com.vanguard.service.Test2Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * @Title:
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/01/24
 */
@Service
public class Test2ConsumerServiceImpl implements Test2ConsumerService {

    private static Logger logger = LoggerFactory.getLogger(Test2ConsumerService.class);

    @Autowired
    private Test2Service test2Service;

    @Override
    @JmsListener(destination = "test2-add-queue")
    public void addQueue(Test2 test2) {
        logger.info("系统B收到test2添加数据的消息，执行添加操作：" + test2);
        test2Service.add(test2);
    }

    @Override
    @JmsListener(destination = "test2-update-queue")
    public void updateQueue(Test2 test2) {
        logger.info("系统B收到test2更新数据的消息，执行更新操作：" + test2);
        test2Service.update(test2);
    }

    @Override
    @JmsListener(destination = "test2-delete-queue")
    public void deleteQueue(Test2 test2) {
        logger.info("系统B收到test1删除数据的消息，执行删除操作，删除数据的id为：" + test2.getId());
        test2Service.delete(test2.getId());
    }
}
