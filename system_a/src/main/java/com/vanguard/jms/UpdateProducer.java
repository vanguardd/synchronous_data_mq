package com.vanguard.jms;

import com.vanguard.commons.base.BaseDomain;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

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
    public void sendMsg(BaseDomain domain) {
        jmsMessagingTemplate.convertAndSend("update-queue",  new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createObjectMessage(domain);
            }
        });
    }
}
