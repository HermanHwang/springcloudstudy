package com.forezp.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHelloFromClientOne(String name) {
        return "对不起,服务暂时无法访问! " +  name;
    }
}
