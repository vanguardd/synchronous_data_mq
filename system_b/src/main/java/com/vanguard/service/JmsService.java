package com.vanguard.service;

import javax.jms.Message;

/**
 * @Title:
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/01/23
 */
public interface JmsService {

    void addQueue(Message message);

    void updateQueue(Message message);

    void deleteQueue(Message message);
}
