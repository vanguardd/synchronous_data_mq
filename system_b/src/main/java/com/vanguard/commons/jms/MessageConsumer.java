package com.vanguard.commons.jms;

import com.vanguard.commons.utils.SpringContextUtils;
import com.vanguard.service.impl.Test1ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Title: 消息消费者
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/02/12
 */
@Component
public class MessageConsumer {

    private static Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "synchronous-data")
    public void synchronousData(MessageObject messageObject) {

        logger.info("系统B接收到同步数据的消息:" + messageObject);

        //同步对象的名称
        String objectName = messageObject.getObjectName();
        //同步操作的类型
        String type = messageObject.getType();
        //获得同步的数据对象
        Object data = messageObject.getData();

        /**
         * 通过反射执行对应业务的方法
         */
        //获得对应业务类的对象
        Object service = SpringContextUtils.getBean(objectName + "Service");
        try {
            //获得对应业务类的字节码
            Class serviceClz = service.getClass();
            //获得执行的方法
            Method method = serviceClz.getDeclaredMethod(type, data.getClass());
            //执行方法
            method.invoke(service, data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
