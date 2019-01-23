package com.vanguard.service.impl;

import com.vanguard.domain.Test1;
import com.vanguard.domain.Test3;
import com.vanguard.service.JmsService;
import com.vanguard.service.Test1Service;
import com.vanguard.service.Test2Service;
import com.vanguard.service.Test3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import java.io.Serializable;

/**
 * @Title: 数据更新队列消费者
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/01/23
 */
@Service
public class JmsServiceImpl implements JmsService {

    @Autowired
    private Test1Service test1Service;

    @Autowired
    private Test2Service test2Service;

    @Autowired
    private Test3Service test3Service;

    @Override
    @JmsListener(destination = "add-queue")
    public void addQueue(Message message) {
        if(message instanceof ObjectMessage) {
            ObjectMessage objectMessage = (ObjectMessage) message;
            try {
                Serializable object = objectMessage.getObject();
                if(object instanceof Test1) {
                    Test1 test1 = (Test1) object;
                    test1Service.add(test1);
                }
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    @JmsListener(destination = "update-queue")
    public void updateQueue(Message message) {

    }

    @Override
    @JmsListener(destination = "delete-queue")
    public void deleteQueue(Message message) {

    }
}
