package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.example.demo.pojo.TestPojo;
import com.example.demo.utils.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    void contextLoads() {
        // 中文序列化错误？
        TestPojo pojo = new TestPojo("perdant", 24);
        String s = JSON.toJSONString(pojo);
        redisUtil.set("myKey",s);
        System.out.println(redisUtil.get("myKey"));
    }
}
