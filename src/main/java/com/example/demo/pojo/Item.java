package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 商品类
 *
 * @author perdant
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item extends BaseDO {
    /**
     * 订单号
     */
    private String orderId;
    /**
     * 商品id
     */
    private String itemId;
    /**
     * 金额
     */
    private Double itemAmount;
}