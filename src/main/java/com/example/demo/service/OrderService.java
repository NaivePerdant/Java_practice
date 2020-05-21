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
     * 查询所有订单
     * @return
     */
    List<Order> queryOrderList();

    /**
     * 查询当前订单
     * @param orderId
     * @return
     */
    Order queryOrderById(String orderId);

    /**
     * 增加一条订单
     * @param order
     * @return
     */
    int addOrder(Order order);

    /**
     * 修改一条订单
     * @param order
     * @return
     */
    int updateOrder(Order order);
}
