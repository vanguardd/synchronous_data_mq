package com.vanguard.service.impl;

import com.vanguard.domain.Test3;
import com.vanguard.mapper.Test3Mapper;
import com.vanguard.service.Test3Service;
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

    @Autowired
    private Test3Mapper test3Mapper;

    @Override
    public void save(Test3 test3) {
        test3Mapper.insert(test3);
        //TODO 添加成功后，发送同步消息
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
        //TODO 修改成功后，发送同步消息

        return test3;
    }

    @Override
    public void delete(Long id) {
        test3Mapper.deleteByPrimaryKey(id);
        //TODO 删除成功后，发送同步消息

    }
}
