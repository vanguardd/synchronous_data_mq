package com.vanguard.service.impl;

import com.vanguard.domain.Test3;
import com.vanguard.service.Test2ConsumerService;
import com.vanguard.service.Test3ConsumerService;
import com.vanguard.service.Test3Service;
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
public class Test3ConsumerServiceImpl implements Test3ConsumerService {

    private static Logger logger = LoggerFactory.getLogger(Test3ConsumerService.class);

    @Autowired
    private Test3Service test3Service;

    @Override
    @JmsListener(destination = "test3-add-queue")
    public void addQueue(Test3 test3) {
        logger.info("系统B收到test3添加数据的消息，执行添加操作：" + test3);
        test3Service.add(test3);
    }

    @Override
    @JmsListener(destination = "test3-update-queue")
    public void updateQueue(Test3 test3) {
        logger.info("系统B收到test3添加数据的消息，执行更新操作：" + test3);
        test3Service.update(test3);
    }

    @Override
    @JmsListener(destination = "test3-delete-queue")
    public void deleteQueue(Test3 test3) {
        logger.info("系统B收到test1删除数据的消息，执行删除操作，删除数据的id为：" + test3.getId());
        test3Service.delete(test3.getId());
    }
}
