package com.example.demo.service;

import com.example.demo.mapper.OrderMapper;
import com.example.demo.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务实现类
 * @author perdant
 */
@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderMapper orderMapper;

    /**
     * 查询所有订单信息
     * @return
     */
    @Override
    public List<Order> queryOrderList() {
        return orderMapper.queryOrderList();
    }

    /**
     * 查询当前订单信息
     * @param orderId
     * @return
     */
    @Override
    public Order queryOrderById(String orderId) {
        return orderMapper.queryOrderById(orderId);
    }
}
