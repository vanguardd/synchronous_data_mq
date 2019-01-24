package com.vanguard.service.impl;

import com.vanguard.domain.Test1;
import com.vanguard.mapper.Test1Mapper;
import com.vanguard.service.ProducerService;
import com.vanguard.service.Test1Service;
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
public class Test1ServiceImpl implements Test1Service {

    @Autowired
    private Test1Mapper test1Mapper;

    @Autowired
    private ProducerService producerService;

    @Override
    public void add(Test1 test1) {
        test1Mapper.insert(test1);
        //添加成功后，发送消息同步数据
        producerService.sendObjectMessage("test1-add-queue", test1);
    }

    @Override
    public List<Test1> findList() {
        List<Test1> test1s = test1Mapper.selectAll();
        return test1s;
    }

    @Override
    public Test1 findById(Long id) {
        Test1 test1 = test1Mapper.selectByPrimaryKey(id);
        return test1;
    }

    @Override
    public Test1 update(Test1 test1) {
        test1Mapper.updateByPrimaryKey(test1);
        //修改成功后，发送消息同步
        producerService.sendObjectMessage("test1-add-queue", test1);
        return test1;
    }

    @Override
    public void delete(Long id) {
        test1Mapper.deleteByPrimaryKey(id);
        Test1 test1 = new Test1();
        test1.setId(id);
        //删除成功后，发送消息同步
        producerService.sendObjectMessage("test1-delete-queue", test1);
    }
}
