package com.example.kehse.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.kehse.entity.Hotel;
import com.example.kehse.mapper.HotelMapper;
import com.example.kehse.service.HotelService;
import org.springframework.stereotype.Service;

/**
 * @author Suyutong
 * @version 1.0
 * @date 2021/6/30 16:04
 */
@Service
public class HotelServiceImpl extends ServiceImpl<HotelMapper, Hotel> implements HotelService {
}
