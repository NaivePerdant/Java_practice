package com.example.demo.service;

import com.example.demo.pojo.Order;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务接口
 * @author perdant
 */
@Service
public interface OrderService {
    /**
     * 查询所有订单信息
     * @return
     */
    List<Order> queryOrderList();

    /**
     * 根据 id 查询订单具体信息
     * @param id
     * @return
     */
    Order queryById(String id);

    /**
     * 根据 id 删除订单
     * @param id
     * @return
     */
    int deleteOrder(String id);
}
