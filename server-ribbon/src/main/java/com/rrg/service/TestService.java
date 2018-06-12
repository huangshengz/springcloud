package com.rrg.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by huangsz on 2018/6/5 0005
 */
@Service
public class TestService {

    @Autowired
    private RestTemplate restTemplate;

    // hiError是对应的方法名字
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name){
        return  restTemplate.getForObject("http://service-hi/hi?name=" + name,String.class);
    }

    public String hiError(String name){
        return  "hi " + name + ",sorry,eroor!!!";
    }
}
