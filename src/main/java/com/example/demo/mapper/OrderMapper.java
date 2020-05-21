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
}
