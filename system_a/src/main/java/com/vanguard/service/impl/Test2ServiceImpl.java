package com.vanguard.service.impl;

import com.vanguard.domain.Test2;
import com.vanguard.jms.Producer;
import com.vanguard.jms.ProducerFactory;
import com.vanguard.mapper.Test2Mapper;
import com.vanguard.service.Test2Service;
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

    @Autowired
    private Test2Mapper test2Mapper;

    @Override
    public void add(Test2 test2) {
        test2Mapper.insert(test2);
        //添加成功后，发送同步消息
        Producer add = ProducerFactory.createProducer("add");
        add.sendMsg(test2);
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
        Producer update = ProducerFactory.createProducer("update");
        update.sendMsg(test2);
        return test2;
    }

    @Override
    public void delete(Long id) {
        test2Mapper.deleteByPrimaryKey(id);
        //删除成功后，发送同步消息
        Producer delete = ProducerFactory.createProducer("delete");
        Test2 test2 = new Test2();
        delete.sendMsg(test2);
    }
}
