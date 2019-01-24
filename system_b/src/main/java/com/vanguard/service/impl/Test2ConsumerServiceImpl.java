package com.vanguard.service.impl;

import com.vanguard.domain.Test2;
import com.vanguard.service.Test2ConsumerService;
import com.vanguard.service.Test2Service;
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

    @Autowired
    private Test2Service test2Service;

    @Override
    @JmsListener(destination = "test2-add-queue")
    public void addQueue(Test2 test2) {
        test2Service.add(test2);
    }

    @Override
    @JmsListener(destination = "test2-update-queue")
    public void updateQueue(Test2 test2) {
        test2Service.update(test2);
    }

    @Override
    @JmsListener(destination = "test2-delete-queue")
    public void deleteQueue(Test2 test2) {
        test2Service.delete(test2.getId());
    }
}
