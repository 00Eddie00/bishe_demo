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
 * @date 2021/6/30 15:21
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@TableName("user")
public class User {

    @TableId(value = "user_id")
    private Integer id;

    @TableField("username")
    private String username;

    @TableField("password")
    private String password;
}
