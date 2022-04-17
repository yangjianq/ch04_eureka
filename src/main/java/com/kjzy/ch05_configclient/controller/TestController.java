package com.kjzy.ch05_configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${clientParam}")
    private String clientParam;


    @GetMapping("/test")
    public String getClientParam(){
        return  "配置的文件clientParam的内容："+clientParam;
    }
}
