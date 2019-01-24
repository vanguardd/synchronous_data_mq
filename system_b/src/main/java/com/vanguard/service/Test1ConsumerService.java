package com.vanguard.service;

import com.vanguard.domain.Test1;

import javax.jms.Message;

/**
 * @Title:
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/01/24
 */
public interface Test1ConsumerService {

    /**
     * 消费者新增消息队列
     * @param test1
     */
    void addQueue(Test1 test1);

    /**
     * 消费者更新消息队列
     * @param message
     */
    void updateQueue(Message message);

    /**
     * 消费者删除消息队列
     * @param test1
     */
    void deleteQueue(Test1 test1);
}
