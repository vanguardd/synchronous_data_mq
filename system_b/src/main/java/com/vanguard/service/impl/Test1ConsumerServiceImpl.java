package com.vanguard.service.impl;

import com.vanguard.domain.Test1;
import com.vanguard.service.Test1ConsumerService;
import com.vanguard.service.Test1Service;
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

    @Autowired
    private Test1Service test1Service;

    @Override
    @JmsListener(destination = "test1-add-queue")
    public void addQueue(Test1 test1) {
        //接收到消息
        test1Service.add(test1);
    }

    @Override
    @JmsListener(destination = "test1-update-queue")
    public void updateQueue(Message message) {
        if(message instanceof ObjectMessage) {
            ObjectMessage objectMessage = (ObjectMessage) message;
            try {
                Test1 test1 = (Test1) objectMessage.getObject();
                //接收到消息
                test1Service.update(test1);
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    @JmsListener(destination = "test1-delete-queue")
    public void deleteQueue(Test1 test1) {
        test1Service.delete(test1.getId());
    }
}
