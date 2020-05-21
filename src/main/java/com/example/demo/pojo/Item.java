package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 商品类
 * @author perdant
 */
@Data
@AllArgsConstructor
@Component
public class Item {
    private String itemId;
    private double itemAmount;
}
