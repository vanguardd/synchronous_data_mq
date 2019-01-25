package com.vanguard.service.impl;

import com.vanguard.domain.Test3;

import com.vanguard.mapper.Test3Mapper;
import com.vanguard.service.ProducerService;
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
    private ProducerService producerService;

    @Override
    public void add(Test3 test3) {
        test3Mapper.insert(test3);
        //添加成功后，发送同步消息
        producerService.sendObjectMessage("test3-add-queue", test3);
        logger.info("系统A发送添加数据的同步消息：" + test3);
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
        producerService.sendObjectMessage("test3-update-queue", test3);
        logger.info("系统A发送更新数据的同步消息：" + test3);
        return test3;
    }

    @Override
    public void delete(Long id) {
        test3Mapper.deleteByPrimaryKey(id);
        //删除成功后，发送同步消息
        Test3 test3 = new Test3();
        test3.setId(id);
        producerService.sendObjectMessage("test3-delete-queue", test3);
        logger.info("系统A发送删除数据的同步消息，删除数据的id为：" + test3.getId());
    }
}
