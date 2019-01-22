package com.vanguard.jms;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;

/**
 * @Title: 更新操作的生产者
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/01/22
 */
@Component
public class UpdateProducer implements Producer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Override
    public void sendMsg(Object message) {
        jmsMessagingTemplate.convertAndSend("update-queue", message);
    }
}
