package com.vanguard.jms;

/**
 * @Title: 消息生产者接口
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/01/22
 */
public interface Producer {

    /**
     * 发送消息
     * @param message 消息对象
     */
    void sendMsg(Object message);
}
