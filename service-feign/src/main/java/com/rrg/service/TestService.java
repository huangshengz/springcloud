package com.rrg.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by huangsz on 2018/6/5 0005
 */
// 通过@ FeignClient（“服务名”），来指定调用哪个服务。
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface TestService {

    @RequestMapping("/hi")
    String sayHi(@RequestParam(value = "name") String name);
}
