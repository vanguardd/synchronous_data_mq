package com.vanguard.service.impl;

import com.vanguard.domain.Test3;
import com.vanguard.service.Test3ConsumerService;
import com.vanguard.service.Test3Service;
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

    @Autowired
    private Test3Service test3Service;

    @Override
    @JmsListener(destination = "test3-add-queue")
    public void addQueue(Test3 test3) {
        test3Service.add(test3);
    }

    @Override
    @JmsListener(destination = "test3-update-queue")
    public void updateQueue(Test3 test3) {
        test3Service.update(test3);
    }

    @Override
    @JmsListener(destination = "test3-delete-queue")
    public void deleteQueue(Test3 test3) {
        test3Service.delete(test3.getId());
    }
}
