package com.example.demo.controller;

import com.example.demo.mapper.ItemMapper;
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
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 查询所有订单信息
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String queryOrderList() {
        return orderService.queryOrderList().toString();
    }

    /**
     * 根据id 查询订单具体信息
     * @param id
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,value = "/{id}")
    public String queryById(@PathVariable String id) {
        return orderService.queryById(id).toString();
    }

    /**
     * 新增一条订单信息
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public String addOrder(){return " ";}

    /**
     * 根据id删除一条订单信息
     * @param id
     * @return
     */
    @RequestMapping(method = RequestMethod.DELETE,value = "/{id}")
    public String deleteOrder(@PathVariable String id){return " ";}

    @RequestMapping(method = RequestMethod.PUT)
    public String updateOrder(){return " ";}

}
