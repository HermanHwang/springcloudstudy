package com.forezp.servicefeign.service;

public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHelloFromClientOne(String name) {
        return "对不起,服务暂时无法访问! " +  name;
    }
}
