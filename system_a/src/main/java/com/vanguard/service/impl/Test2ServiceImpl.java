package com.vanguard.service.impl;

import com.vanguard.commons.jms.MessageObject;
import com.vanguard.commons.jms.MessageProducer;
import com.vanguard.domain.Test2;
import com.vanguard.mapper.Test2Mapper;
import com.vanguard.service.Test2Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title:
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/01/21
 */
@Service
public class Test2ServiceImpl implements Test2Service {

    private static Logger logger = LoggerFactory.getLogger(Test2ServiceImpl.class);

    @Autowired
    private Test2Mapper test2Mapper;

    @Autowired
    private MessageProducer messageProducer;

    @Override
    public void add(Test2 test2) {
        test2Mapper.insert(test2);
        //添加成功后，发送消息同步数据
        MessageObject messageObject = new MessageObject("test2", "add", test2);
        logger.info("系统A发送添加数据的消息：" + messageObject);
        messageProducer.sendObjectMessage(messageObject);
    }

    @Override
    public List<Test2> findList() {
        List<Test2> test2List = test2Mapper.selectAll();
        return test2List;
    }

    @Override
    public Test2 findById(Long id) {
        Test2 test2 = test2Mapper.selectByPrimaryKey(id);
        return test2;
    }

    @Override
    public Test2 update(Test2 test2) {
        test2Mapper.updateByPrimaryKey(test2);
        //修改成功后，发送同步消息
        MessageObject messageObject = new MessageObject("test2", "update", test2);
        logger.info("系统A发送更新数据的消息：" + messageObject);
        messageProducer.sendObjectMessage(messageObject);
        return test2;
    }

    @Override
    public void delete(Long id) {
        test2Mapper.deleteByPrimaryKey(id);
        //删除成功后，发送同步消息
        MessageObject messageObject = new MessageObject("test2", "delete", id);
        messageProducer.sendObjectMessage(messageObject);
        logger.info("系统A发送删除数据的消息：" + messageObject);
    }
}
