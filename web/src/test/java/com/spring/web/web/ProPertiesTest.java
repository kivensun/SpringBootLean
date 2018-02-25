package com.spring.web.web;

import com.spring.web.util.WebProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.HashMap;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProPertiesTest {

    @Autowired
    private WebProperties neoProperties;


    @Test
    public void getHello() throws Exception {
        System.out.println(neoProperties.getTitle());
        Assert.assertEquals(neoProperties.getTitle(), "纯洁的微笑");
        Assert.assertEquals(neoProperties.getDescription(), "分享生活和技术");
    }


    @Test
    public void testMap() throws Exception {
        Map<String, Long> orderMinTime=new HashMap<String, Long>();
        long xx=orderMinTime.get("123");
    }

}
