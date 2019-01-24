package com.vanguard.service;

import com.vanguard.commons.base.BaseDomain;

/**
 * @Title:
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/01/24
 */
public interface ProducerService {

    /**
     * 发送对象消息
     * @param destinationName
     * @param message
     */
    void sendObjectMessage(String destinationName, Object message);

    /**
     * 发送普通消息
     * @param destinationName
     * @param message
     */
    void sendMessage(String destinationName, String message);

}
