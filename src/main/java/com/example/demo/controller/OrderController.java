package com.example.demo.controller;

import com.example.demo.mapper.ItemMapper;
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

    @Autowired
    private ItemMapper itemMapper;

    /**
     * 查询所有订单信息
     * @return
     */
    @GetMapping("/queryOrderList")
    public List<Order> queryOrderList() {
        return orderService.queryOrderList();
    }

    /**
     * 根据id 查询订单具体信息
     * @param id
     * @return
     */
    @GetMapping("/queryById/{id}")
    public Order queryById(@PathVariable String id) {
        return orderService.queryById(id);
    }
}
