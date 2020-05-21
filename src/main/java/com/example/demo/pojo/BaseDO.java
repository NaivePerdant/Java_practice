package com.example.demo.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 提取出两个表的公共属性
 * @author perdant
 */
@Data
public class BaseDO {
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
}