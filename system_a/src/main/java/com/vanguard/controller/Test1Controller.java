package com.vanguard.controller;

import com.vanguard.commons.base.BaseController;
import com.vanguard.commons.response.CommonReturnCode;
import com.vanguard.commons.response.HttpResult;
import com.vanguard.domain.Test1;
import com.vanguard.service.Test1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Title: test2前端控制器
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/01/18
 */
@RestController
@RequestMapping("/test1")
public class Test1Controller extends BaseController {

    @Autowired
    private Test1Service test1Service;

    @PostMapping("")
    public HttpResult save(@RequestBody Test1 test1) {
        test1Service.save(test1);
        return new HttpResult(CommonReturnCode.OK);
    }

    @PutMapping("")
    public HttpResult update(@RequestBody Test1 test1) {
        Test1 update = test1Service.update(test1);
        return new HttpResult(CommonReturnCode.OK, update);
    }

    @GetMapping("/list")
    public HttpResult list() {
        List<Test1> test1s =  test1Service.findList();
        return new HttpResult(CommonReturnCode.OK, test1s);
    }


    @GetMapping("/{id}")
    public HttpResult findById(@PathVariable("id") Long id) {
        Test1 test1 = test1Service.findById(id);
        return new HttpResult(CommonReturnCode.OK, test1);
    }

    @DeleteMapping("/{id}")
    public HttpResult delete(@PathVariable("id") Long id) {
        test1Service.delete(id);
        return new HttpResult(CommonReturnCode.SUCCESS);
    }




}
