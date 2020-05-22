package com.example.demo.service;

import com.example.demo.mapper.ItemMapper;
import com.example.demo.mapper.OrderMapper;
import com.example.demo.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务实现类
 *
 * @author perdant
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private ItemMapper itemMapper;

    /**
     * 查询所有订单信息
     *
     * @return
     */
    @Override
    public List<Order> queryOrderList() {
        return orderMapper.queryOrderList();
    }

    /**
     * 根据 id 查询订单信息
     *
     * @param id
     * @return
     */
    @Override
    public Order queryById(String id) {
        return orderMapper.queryById(id);
    }

    /**
     * 新增订单信息
     * 这里应该开启事务的，但是目前不太会写，先空着
     *
     * @param order
     * @return
     */
    @Override
    public int addOrder(Order order) {
        int m = orderMapper.addOrder(order);
        int n = itemMapper.addItem(order.getItem());
        return n & m;
    }

    /**
     * 根据id 删除订单信息
     *
     * @param id
     * @return
     */
    @Override
    public int deleteOrder(String id) {
        return orderMapper.deleteOrder(id);
    }

    /**
     * 修改订单信息
     * 同样需要开启事务
     * @param order
     * @return
     */
    @Override
    public int updateOrder(Order order) {
        int m = orderMapper.updateOrder(order);
        int n = itemMapper.updateItem(order.getItem());
        return m & n;
    }
}
