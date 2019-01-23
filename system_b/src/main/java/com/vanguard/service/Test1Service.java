package com.vanguard.service;

import com.vanguard.domain.Test1;

import java.util.List;

/**
 * @Title:
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/01/21
 */
public interface Test1Service {

    /**
     * 添加测试信息
     * @param test1 Test1
     * @author vanguard
     * @date 2019/1/21 15:33
     * @return void
     */
    void add(Test1 test1);

    /**
     * 查询所有的信息
     * @author vanguard
     * @date 2019/1/21 15:45
     * @return java.util.List<com.vanguard.domain.Test1>
     */
    List<Test1> findList();

    /**
     * 根据id查询test1信息
     * @param id
     * @author vanguard
     * @date 2019/1/21 15:54
     * @return com.vanguard.domain.Test1
     */
    Test1 findById(Long id);

    /**
     * 修改
     * @param test1
     * @return
     */
    Test1 update(Test1 test1);

    /**
     * 根据id删除信息
     * @param id
     * @author vanguard
     * @date 2019/1/21 16:10
     * @return void
     */
    void delete(Long id);
}
