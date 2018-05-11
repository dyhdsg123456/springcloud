package com.example.demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: dyh
 * @Date: 2018/5/10
 * @Description:
 */
@RestController
public class HelloController {
    @Value("${abc}")
    private int a;

    @Autowired
    private CounterService counterService;

    @RequestMapping("hello")
    public String index(){
        System.out.println(a);
        return "hello1 world";
    }
    @RequestMapping("hello2")
    public String greet(){
        counterService.increment("didispace.hello.count");
        return "";
    }
}
