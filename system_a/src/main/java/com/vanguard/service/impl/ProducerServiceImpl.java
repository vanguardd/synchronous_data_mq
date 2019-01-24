package com.vanguard.service.impl;

import com.vanguard.commons.base.BaseDomain;
import com.vanguard.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import java.io.Serializable;

/**
 * @Title:
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/01/24
 */
@Service
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Override
    public void sendObjectMessage(String destinationName, Object message) {
        jmsMessagingTemplate.convertAndSend(destinationName, message);
    }

    @Override
    public void sendMessage(String destinationName, String message) {
        jmsMessagingTemplate.convertAndSend(destinationName, message);
    }

}
