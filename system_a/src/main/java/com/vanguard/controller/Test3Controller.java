package com.vanguard.controller;

import com.vanguard.commons.base.BaseController;
import com.vanguard.commons.response.CommonReturnCode;
import com.vanguard.commons.response.HttpResult;
import com.vanguard.domain.Test2;
import com.vanguard.domain.Test3;
import com.vanguard.service.Test2Service;
import com.vanguard.service.Test3Service;
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
@RequestMapping("/test3")
public class Test3Controller extends BaseController {

    @Autowired
    private Test3Service test3Service;

    @PostMapping("")
    public HttpResult save(@RequestBody Test3 test3) {
        test3Service.save(test3);
        return new HttpResult(CommonReturnCode.OK);
    }

    @PutMapping("")
    public HttpResult update(@RequestBody Test3 test3) {
        Test3 update = test3Service.update(test3);
        return new HttpResult(CommonReturnCode.OK, update);
    }

    @GetMapping("/list")
    public HttpResult list() {
        List<Test3> test3List =  test3Service.findList();
        return new HttpResult(CommonReturnCode.OK, test3List);
    }


    @GetMapping("/{id}")
    public HttpResult findById(@PathVariable("id") Long id) {
        Test3 test3 = test3Service.findById(id);
        return new HttpResult(CommonReturnCode.OK, test3);
    }

    @DeleteMapping("/{id}")
    public HttpResult delete(@PathVariable("id") Long id) {
        test3Service.delete(id);
        return new HttpResult(CommonReturnCode.SUCCESS);
    }


}
