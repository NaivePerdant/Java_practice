package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品类
 * @author perdant
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item extends BaseDO{
    private Long id;
    /**
     * 商品 id
     */
    private String itemId;
    /**
     * 商品金额
     */
    private double itemAmount;
}