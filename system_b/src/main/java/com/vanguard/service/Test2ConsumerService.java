package com.vanguard.service;

import com.vanguard.domain.Test1;
import com.vanguard.domain.Test2;

/**
 * @Title:
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/01/24
 */
public interface Test2ConsumerService {

    /**
     * 消费者新增消息队列
     * @param test2
     */
    void addQueue(Test2 test2);

    /**
     * 消费者更新消息队列
     * @param test2
     */
    void updateQueue(Test2 test2);

    /**
     * 消费者删除消息队列
     * @param test2
     */
    void deleteQueue(Test2 test2);
}
