package com.example.kehse.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.kehse.entity.User;
import com.example.kehse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author Suyutong
 * @version 1.0
 * @date 2021/6/30 16:08
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/toLogin")
    public String toLogin() {
        return "user/login";
    }


    @PostMapping("/login")
    public String login(User user, Model model, HttpSession httpSession) {
        if (user.getUsername() != null && user.getPassword() != null) {
            QueryWrapper<User> wrapper = new QueryWrapper<User>();
            wrapper.eq("username", user.getUsername());
            User one = userService.getOne(wrapper);
            if (!user.getPassword().equals(one.getPassword())) {
                return "forward:toLogin";
            }
            httpSession.setAttribute("USER_SESSION", one);
            return "forward:toHotel";
        }
        return "forward:toLogin";
    }

    @PostMapping("/toHotel")
    public String toHotel() {
        return "hotel/info";
    }

    @GetMapping("/toHotel2")
    public String toHotel2() {
        return "hotel/info";
    }
}