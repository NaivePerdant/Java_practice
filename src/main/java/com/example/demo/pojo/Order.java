package com.example.demo.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 订单类
 * @author perdant
 */
@Data
@Component
public class Order {
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
     * 创建人
     */
    private String createBy;
    /**
     * 修改人
     */
    private String updateBy;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 具体商品
     */
    @Autowired
    private Item item;
}
