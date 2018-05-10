package com.example.demo;

import com.example.demo.demo.HelloController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @Author: dyh
 * @Date: 2018/5/10
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HelloController.class)
@WebAppConfiguration
public class TestDemo {
    private MockMvc mvc;

    @Before
    public void setUp()throws Exception{
        mvc= MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    @Test
    public void 
}
