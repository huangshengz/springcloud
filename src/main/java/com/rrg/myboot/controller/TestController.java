package com.rrg.myboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangsz on 2018/6/4 0004
 */
@RestController
public class TestController {

    // 获取的是properties.yml的自定义属性值
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;

    @RequestMapping("/")
    public String helloSpringBoot(){
        return "name:" + name + ",age:" + age;
    }
}
