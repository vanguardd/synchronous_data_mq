package com.vanguard.service.impl;

import com.vanguard.commons.jms.MessageObject;
import com.vanguard.commons.jms.MessageProducer;
import com.vanguard.domain.Test3;

import com.vanguard.mapper.Test3Mapper;
import com.vanguard.service.Test3Service;
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
public class Test3ServiceImpl implements Test3Service {

    private static Logger logger = LoggerFactory.getLogger(Test3ServiceImpl.class);

    @Autowired
    private Test3Mapper test3Mapper;

    @Autowired
    private MessageProducer messageProducer;

    @Override
    public void add(Test3 test3) {
        test3Mapper.insert(test3);
        //添加成功后，发送同步消息
        MessageObject messageObject = new MessageObject("test3", "add", test3);
        logger.info("系统A发送添加数据的消息：" + messageObject);
        messageProducer.sendObjectMessage(messageObject);
    }

    @Override
    public List<Test3> findList() {
        List<Test3> test3List = test3Mapper.selectAll();
        return test3List;
    }

    @Override
    public Test3 findById(Long id) {
        Test3 test3 = test3Mapper.selectByPrimaryKey(id);
        return test3;
    }

    @Override
    public Test3 update(Test3 test3) {
        test3Mapper.updateByPrimaryKey(test3);
        //修改成功后，发送同步消息
        MessageObject messageObject = new MessageObject("test3", "update", test3);
        logger.info("系统A发送更新数据的消息：" + messageObject);
        messageProducer.sendObjectMessage(messageObject);
        return test3;
    }

    @Override
    public void delete(Long id) {
        test3Mapper.deleteByPrimaryKey(id);
        //删除成功后，发送同步消息
        MessageObject messageObject = new MessageObject("test2", "delete", id);
        messageProducer.sendObjectMessage(messageObject);
        logger.info("系统A发送删除数据的消息：" + messageObject);
    }
}
