package com.example.demo.controller;

import com.example.demo.pojo.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller 层
 * @author perdant
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 查询所有订单信息
     * @return
     */
    @GetMapping("/queryOrderList")
    public List<Order> queryOrderList() {
        List<Order> orders = orderService.queryOrderList();
        return orders;
    }
}
