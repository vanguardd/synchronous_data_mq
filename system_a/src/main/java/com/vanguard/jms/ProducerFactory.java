package com.vanguard.jms;

/**
 * @Title: 生产者工厂
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/01/22
 */
public class ProducerFactory {

    /**
     * 创建生产者对象
     * @param type
     * @return
     */
    public static Producer createProducer(String type) {
        Producer producer = null;
        //根据操作类型创建相应的生产者对象
        switch (type) {
            case "add":
                producer = new AddProducer();
                break;
            case "update":
                producer = new UpdateProducer();
                break;
            case "delete":
                producer = new DeleteProducer();
                break;
            default:

        }
        return producer;
    }
}
