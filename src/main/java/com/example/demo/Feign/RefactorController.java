package com.example.demo.Feign;

import com.springcloud.helloserviceapi.HelloService;
import com.springcloud.helloserviceapi.dto.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: dyh
 * Date:   2019/7/17
 * Description:
 */
@RestController
public class RefactorController implements HelloService {
    @Override
    public String hello(@RequestParam("name") String name) {
        return "hello"+name;
    }

    @Override
    public User hello(@RequestHeader String name, @RequestHeader Integer age){
        return new User(name,age);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "hello"+user.getName()+", "+user.getAge();
    }
}
