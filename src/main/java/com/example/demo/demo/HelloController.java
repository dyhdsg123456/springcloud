package com.example.demo.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: dyh
 * @Date: 2018/5/10
 * @Description:
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String index(){
        return "hello12";
    }
}
