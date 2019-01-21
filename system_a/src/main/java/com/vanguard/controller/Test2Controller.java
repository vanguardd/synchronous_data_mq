package com.vanguard.controller;

import com.vanguard.commons.base.BaseController;
import com.vanguard.commons.response.CommonReturnCode;
import com.vanguard.commons.response.HttpResult;
import com.vanguard.domain.Test1;
import com.vanguard.domain.Test2;
import com.vanguard.service.Test2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Title: test2前端控制器
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/01/21
 */
@RestController
@RequestMapping("/test2")
public class Test2Controller extends BaseController {

    @Autowired
    private Test2Service test2Service;

    @PostMapping("/add")
    public HttpResult save(@RequestBody Test2 test2) {
        test2Service.save(test2);
        return new HttpResult(CommonReturnCode.OK);
    }

    @PutMapping("/update")
    public HttpResult update(@RequestBody Test2 test2) {
        Test2 update = test2Service.update(test2);
        return new HttpResult(CommonReturnCode.OK, update);
    }

    @GetMapping("/list")
    public HttpResult list() {
        List<Test2> test3List =  test2Service.findList();
        return new HttpResult(CommonReturnCode.OK, test3List);
    }


    @GetMapping("/{id}")
    public HttpResult findById(@PathVariable("id") Long id) {
        Test2 test2 = test2Service.findById(id);
        return new HttpResult(CommonReturnCode.OK, test2);
    }

    @DeleteMapping("/{id}")
    public HttpResult delete(@PathVariable("id") Long id) {
        test2Service.delete(id);
        return new HttpResult(CommonReturnCode.SUCCESS);
    }


}
