package com.vanguard.service;

import com.vanguard.domain.Test2;
import com.vanguard.domain.Test3;

/**
 * @Title:
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/01/24
 */
public interface Test3ConsumerService {

    /**
     * 消费者新增消息队列
     * @param test3
     */
    void addQueue(Test3 test3);

    /**
     * 消费者更新消息队列
     * @param test3
     */
    void updateQueue(Test3 test3);

    /**
     * 消费者删除消息队列
     * @param test3
     */
    void deleteQueue(Test3 test3);
}
