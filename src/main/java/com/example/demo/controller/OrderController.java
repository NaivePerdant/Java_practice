package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.pojo.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller 层
 * @author perdant
 */
@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 查询所有订单信息
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<Order> queryOrderList() {
        return orderService.queryOrderList();
    }

    /**
     * 根据id 查询订单具体信息
     * @param id
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,value = "/{id}")
    public Order queryById(@PathVariable("id") String id) {
        return orderService.queryById(id);
    }

    /**
     * 新增一条订单信息
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public int addOrder(@RequestBody String jsonStr){
        Order order = JSON.parseObject(jsonStr,Order.class);
        return orderService.addOrder(order);
    }

    /**
     * 根据id删除一条订单信息
     * @param id
     * @return
     */
    @RequestMapping(method = RequestMethod.DELETE,value = "/{id}")
    public int deleteOrder(@PathVariable("id") String id){
        return orderService.deleteOrder(id);
    }

    /**
     * 修改一条订单信息
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    public int updateOrder(@RequestBody String jsonStr){
        Order order = JSON.parseObject(jsonStr,Order.class);
        return orderService.updateOrder(order);
    }
}
