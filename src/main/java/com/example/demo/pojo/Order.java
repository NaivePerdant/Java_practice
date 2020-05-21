package com.example.demo.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 订单类
 * @author perdant
 */
@Data
public class Order extends BaseDO{
    /**
     * 订单号
     */
    private String orderId;
    /**
     * 订单来源
     */
    private String orderSource;
    /**
     * 用户 id
     */
    private String userId;
    /**
     * 订单状态：0-已创建， 1-已提交，2-已支付，4-订单结束
     */
    private String orderStatus;
    /**
     * 订单金额
     */
    private double amount;
    /**
     * 是否删除：0-否，1-是
     */
    private int isDelete;
    /**
     * 具体商品
     */
    private Item item;
}
