package com.example.demo.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: dyh
 * @Date: 2018/5/10
 * @Description:
 */
@RestController
public class HelloController {
    private final Logger          logger =Logger.getLogger(getClass());
    @Value("${abc}")
    private        int             a;
    @Autowired
    private        DiscoveryClient client;


    @Autowired
    private CounterService counterService;


    @RequestMapping("hello")
    public String index()throws Exception{
//        long start = System.currentTimeMillis();
//
//
        ServiceInstance instance = client.getLocalServiceInstance();
//        int sleeptime = new Random().nextInt(3000);
//        logger.info("sleeptime:"+sleeptime);
//        Thread.sleep(sleeptime);
        logger.info("/hello,host: "+instance.getHost()+",serviceid: "+instance.getPort());
//        long end = System.currentTimeMillis();
//        logger.info("spendtime:"+(end-start));
        return "hello world";
    }
//    @RequestMapping("hello2")
//    public String greet(){
//        counterService.increment("didispace.hello.count");
//        return "";
//    }
}
