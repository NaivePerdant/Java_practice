package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.pojo.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public String queryOrderList() {
        String code = "200 OK";
        String text = JSON.toJSONString(orderService.queryOrderList());
        return text;
    }

    /**
     * 根据id 查询订单具体信息
     * @param id
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,value = "/{id}")
    public String queryById(@PathVariable String id) {
        String code = "200 OK";
        Order order = orderService.queryById(id);
        String text = JSON.toJSONString(order);
        return text;
    }

    /**
     * 新增一条订单信息
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public String addOrder(){
        String code = "201 Created";
        return code;
    }

    /**
     * 根据id删除一条订单信息
     * @param id
     * @return
     */
    @RequestMapping(method = RequestMethod.DELETE,value = "/{id}")
    public String deleteOrder(@PathVariable String id){
        orderService.deleteOrder(id);
        String code = "204 No Content";
        return code;
    }

    /**
     * 修改一条订单信息
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    public String updateOrder(){
        String code = "200 OK";
        return code;
    }

}
