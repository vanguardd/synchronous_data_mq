package com.vanguard.service.impl;

import com.vanguard.domain.Test2;
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
@Service("test2Service")
public class Test2ServiceImpl implements Test2Service {

    @Autowired
    private Test2Mapper test2Mapper;

    @Override
    public void add(Test2 test2) {
        test2Mapper.insert(test2);
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

        return test2;
    }

    @Override
    public void delete(Long id) {
        test2Mapper.deleteByPrimaryKey(id);

    }
}
