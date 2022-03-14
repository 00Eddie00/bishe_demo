package com.example.kehse.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.kehse.entity.HotWord;
import com.example.kehse.service.HotWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Suyutong
 * @version 1.0
 * @date 2021/7/8 17:24
 */
@Controller
@RequestMapping("/hotWord")
public class HotWordController {

    @Autowired
    HotWordService hotWordService;

    @GetMapping
    public String wordList(Model model){
        model.addAttribute("hotWordList",hotWordService.list());
        return "hotel/hotWord";
    }
}
