package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.example.demo.mapper.OrderMapper;
import com.example.demo.pojo.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private OrderMapper orderMapper;

    @Test
    void contextLoads() {
        ValueOperations<String,String> valueOperations = redisTemplate.opsForValue();
        boolean hasKey = redisTemplate.hasKey("123");
        if (hasKey){
            String value = valueOperations.get("123");
            System.out.println("=====从缓存中读取======");
            System.out.println(value);
            System.out.println("=====================");
        }else{
            Order order = orderMapper.queryById("123");
            System.out.println("=====从数据库中读取=====");
            System.out.println(JSON.toJSONString(order));
            System.out.println("======================");
            // 写入缓存
            String s = JSON.toJSONString(order);
            valueOperations.set("123",s);
        }
    }
}
