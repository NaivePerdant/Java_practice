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
     * 根据 id 查询订单信息
     * @param id
     * @return
     */
    Order queryById(String id);

    /**
     * 修改订单信息
     * @param order
     * @return
     */
    int updateOrder(Order order);

    /**
     * 删除订单信息
     * @param id
     * @return
     */
    int deleteOrder(String id);

    /**
     * 新增一条订单信息
     * @param order
     * @return
     */
    int addOrder(Order order);
}
