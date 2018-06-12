package com.rrg.controller;

import com.rrg.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangsz on 2018/6/5 0005
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name){
        return  testService.hiService(name);
    }
}
