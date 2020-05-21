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
}
