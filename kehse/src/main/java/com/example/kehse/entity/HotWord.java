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
 * @date 2021/7/8 17:13
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@TableName("hot_word")
public class HotWord {

    @TableId(value = "word_id")
    private int id;

    @TableField("words")
    private String words;

    @TableField("num")
    private int num;
}
