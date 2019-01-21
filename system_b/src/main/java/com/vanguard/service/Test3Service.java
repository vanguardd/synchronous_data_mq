package com.vanguard.service;

import com.vanguard.domain.Test3;

import java.util.List;

/**
 * @Title:
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/01/21
 */
public interface Test3Service {
    /**
     * 添加测试信息
     * @param test3 Test3
     * @author vanguard
     * @date 2019/1/21 15:33
     * @return void
     */
    void save(Test3 test3);

    /**
     * 查询所有的信息
     * @param
     * @author vanguard
     * @date 2019/1/21 15:45
     * @return java.util.List<com.vanguard.domain.Test3>
     */
    List<Test3> findList();

    /**
     * 根据id查询test3信息
     * @param id
     * @author vanguard
     * @date 2019/1/21 15:54
     * @return com.vanguard.domain.Test3
     */
    Test3 findById(Long id);

    /**
     * 修改信息
     * @param Test3
     * @return
     */
    Test3 update(Test3 Test3);

    /**
     * 根据id删除信息
     * @param id
     * @author vanguard
     * @date 2019/1/21 16:10
     * @return void
     */
    void delete(Long id);
}
