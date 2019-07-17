package com.example.demo.Feign;

import com.example.demo.demo.User;
import org.springframework.web.bind.annotation.*;

/**
 * Author: dyh
 * Date:   2019/7/17
 * Description:
 */
@RestController
public class FeginController {
    @RequestMapping("hello1")
    public String hello(@RequestParam String name){
        return "hello"+name;
    }
    @RequestMapping("hello2")
    public User hello(@RequestHeader String name, @RequestHeader Integer age){
        return new User(name,age);
    }
    @RequestMapping(value = "hello3",method = RequestMethod.POST)
    public String hello(@RequestBody User user){
        return "hello"+user.getName()+", "+user.getAge();
    }
}
