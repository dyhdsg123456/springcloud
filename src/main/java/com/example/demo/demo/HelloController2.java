package com.example.demo.demo;

import com.example.demo.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: dyh
 * @Date: 2018/5/11
 * @Description:
 */
@RestController
public class HelloController2 {

    private final Logger logger =Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "hello3",method = RequestMethod.GET)
    public String index(){
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/hello3,host:"+instance.getHost()+", service_id:"+instance.getServiceId());
        return "hello world3";
    }
    @RequestMapping(value = "hello4",method = RequestMethod.GET)
    public User index(@RequestParam String name){
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/hello4,host:"+instance.getHost()+", service_id:"+instance.getServiceId());
        User user = new User();
        user.setName(name);
        return user;
    }
}
