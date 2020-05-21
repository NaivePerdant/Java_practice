package com.example.demo;

import com.example.demo.mapper.OrderMapper;
import com.example.demo.pojo.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@SpringBootTest(classes = DemoApplication.class)
public class OrderMapperTest {
    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void testSelect() {
        List<Order> orders = orderMapper.queryOrderList();
        System.out.println(orders);
    }
}
