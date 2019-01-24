package com.vanguard.controller;

import com.vanguard.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title:
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/01/24
 */
@RestController
public class HelloController {

    @Autowired
    private ProducerService producerService;

    @RequestMapping("/hello")
    public String hello(@RequestParam String message) {
        producerService.sendMessage("hello", message);
        return message;
    }
}
