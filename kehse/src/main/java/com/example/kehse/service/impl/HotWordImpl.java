package com.example.kehse.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.kehse.entity.HotWord;
import com.example.kehse.mapper.HotWordMapper;
import com.example.kehse.service.HotWordService;
import org.springframework.stereotype.Service;

/**
 * @author Suyutong
 * @version 1.0
 * @date 2021/7/8 17:23
 */
@Service
public class HotWordImpl extends ServiceImpl<HotWordMapper, HotWord> implements HotWordService {
}
