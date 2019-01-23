package com.vanguard.service;

import com.vanguard.domain.Test2;

import java.util.List;

/**
 * @Title:
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/01/21
 */
public interface Test2Service {
    /**
     * 添加测试信息
     * @param test2 Test2
     * @author vanguard
     * @date 2019/1/21 15:33
     * @return void
     */
    void add(Test2 test2);

    /**
     * 查询所有的信息
     * @param
     * @author vanguard
     * @date 2019/1/21 15:45
     * @return java.util.List<com.vanguard.domain.Test2>
     */
    List<Test2> findList();

    /**
     * 根据id查询test1信息
     * @param id
     * @author vanguard
     * @date 2019/1/21 15:54
     * @return com.vanguard.domain.Test2
     */
    Test2 findById(Long id);

    /**
     * 修改
     * @param test2
     * @return
     */
    Test2 update(Test2 test2);

    /**
     * 根据id删除信息
     * @param id
     * @author vanguard
     * @date 2019/1/21 16:10
     * @return void
     */
    void delete(Long id);
}
