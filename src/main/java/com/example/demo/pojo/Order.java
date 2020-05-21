package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单类
 * @author perdant
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private Double amount;
    /**
     * 是否删除：0-否，1-是
     */
    private Integer isDelete;

    private Item item;
}
