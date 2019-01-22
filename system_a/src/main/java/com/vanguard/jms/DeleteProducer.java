package com.vanguard.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

/**
 * @Title: 删除操作的生产者
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/01/22
 */
@Component
public class DeleteProducer implements Producer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Override
    public void sendMsg(Object message) {
        jmsMessagingTemplate.convertAndSend("delete-queue", message);
    }
}
