package com.example.kehse.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Suyutong
 * @version 1.0
 * @date 2021/6/30 15:33
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@TableName("hotel")
public class Hotel {

    @TableId(value = "hotel_id")
    private Integer id;

    @TableField("introduction")
    private String introduction;

    @TableField("grade")
    private double grade;

    @TableField("commentNum")
    private Integer commentNum;

    @TableField("price")
    private Integer price;
}
