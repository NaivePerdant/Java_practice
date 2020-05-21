package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 商品类
 * @author perdant
 */
@Data
@AllArgsConstructor
public class Item {
    private String itemId;
    private double itemAmount;
}