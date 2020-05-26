package com.example.demo.service;

import com.alibaba.fastjson.JSON;
import com.example.demo.mapper.ItemMapper;
import com.example.demo.mapper.OrderMapper;
import com.example.demo.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.kafka.core.KafkaTemplate;
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
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    OrderProducerService orderProducerService;




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
     * 使用 redis 做缓存
     * @param id
     * @return
     */
    @Override
    public Order queryById(String id) {
        ValueOperations<String,String> valueOperations = redisTemplate.opsForValue();
        boolean hasKey = redisTemplate.hasKey(id);
        if (hasKey){
            String value = valueOperations.get(id);
            System.out.println("=====从缓存中读取======");
            System.out.println(value);
            System.out.println("=====================");
            return JSON.parseObject(value,Order.class);
        }else{
            Order order = orderMapper.queryById(id);
            System.out.println("=====从数据库中读取=====");
            System.out.println(JSON.toJSONString(order));
            System.out.println("======================");
            // 写入缓存
            String s = JSON.toJSONString(order);
            valueOperations.set(id,s);
            return order;
        }
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
        // 写入 MySQL 数据库
        int m = orderMapper.updateOrder(order);
        int n = itemMapper.updateItem(order.getItem());
        // or 写入 Redis 数据库 or 让 Redis 数据库数据失效
        // ...
        // 发送订单状态
        orderProducerService.sendMessage(order);
        return m & n;
    }
}
