package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 测试类
 * @author perdant
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestPojo implements Serializable {
    private String name;
    private Integer age;
}
