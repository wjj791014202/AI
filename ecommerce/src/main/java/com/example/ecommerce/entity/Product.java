package com.example.ecommerce.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_product")
public class Product {
    @TableId
    private Long id;
    private String name;
    private String description;
}
