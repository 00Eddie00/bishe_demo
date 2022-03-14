package com.example.kehse.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.kehse.entity.User;
import com.example.kehse.mapper.UserMapper;
import com.example.kehse.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Suyutong
 * @version 1.0
 * @date 2021/6/30 16:04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
