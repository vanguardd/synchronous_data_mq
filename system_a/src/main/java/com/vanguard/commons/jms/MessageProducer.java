package com.vanguard.commons.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

/**
 * @Title:
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/02/12
 */
@Service
public class MessageProducer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    /**
     * 发送对象消息
     * 自定义主题名称
     * @param destinationName
     * @param message
     */
    public void sendObjectMessage(String destinationName, MessageObject message) {
        jmsMessagingTemplate.convertAndSend(destinationName, message);
    }

    /**
     * 发送对象消息
     * @param destinationName
     * @param message
     */
    public void sendObjectMessage(MessageObject message) {
        jmsMessagingTemplate.convertAndSend("synchronous-data", message);
    }

    /**
     * 发送普通消息
     * @param destinationName
     * @param message
     */
    public void sendMessage(String destinationName, String message) {
        jmsMessagingTemplate.convertAndSend(destinationName, message);
    }
}
