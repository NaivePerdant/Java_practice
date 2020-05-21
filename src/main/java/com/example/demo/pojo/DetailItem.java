package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 商品类
 *
 * @author perdant
 */
@Data
@AllArgsConstructor
public class DetailItem {
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