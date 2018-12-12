package com.forezp.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback=SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHelloFromClientOne(@RequestParam(value = "name") String name);
}
