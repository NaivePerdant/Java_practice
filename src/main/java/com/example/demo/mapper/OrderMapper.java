package com.example.demo.mapper;

import com.example.demo.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author perdant
 */
@Mapper
@Repository
public interface OrderMapper {
    /**
     * 查询所有订单
     * @return
     */
    List<Order> queryOrderList();

    /**
     * 查询所有订单
     * @return
     */
    List<Order> queryOrderAndDetailList();
//
//    /**
//     * 根据订单号查询订单
//     * @param orderId
//     * @return
//     */
//    Order queryOrderById(int orderId);
//
//    /**
//     * 增
//     * @param order
//     * @return
//     */
//    int addOrder(Order order);
//
//    /**
//     * 改
//     * @param order
//     * @return
//     */
//    int updateOrder(Order order);
//
//    /**
//     * 删
//     * @param orderId
//     * @return
//     */
//    int deleteOrder(int orderId);
}
