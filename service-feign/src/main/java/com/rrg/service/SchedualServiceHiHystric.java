package com.rrg.service;

import org.springframework.stereotype.Component;

/**
 * Created by huangsz on 2018/6/5 0005
 */
@Component
public class SchedualServiceHiHystric implements TestService {

    @Override
    public String sayHi(String name) {
        return "sorry," + name + ",client already shutdown.";
    }
}
