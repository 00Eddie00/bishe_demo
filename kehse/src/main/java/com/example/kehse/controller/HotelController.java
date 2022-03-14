package com.example.kehse.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.kehse.entity.Hotel;
import com.example.kehse.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Suyutong
 * @version 1.0
 * @date 2021/6/30 21:28
 */
@Controller
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    HotelService hotelService;

    @GetMapping("/commentNum")
    public String commentNumList(Model model) {
        QueryWrapper<Hotel> hotelQueryWrapper = new QueryWrapper<>();
        hotelQueryWrapper.orderByDesc("commentNum");
        List<Hotel> list = hotelService.list(hotelQueryWrapper);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = list.get(i).getCommentNum();
        }
        model.addAttribute("hotelListByCommentNum", arr);
        return "hotel/commentNumInfo";
    }

    @GetMapping("/grade")
    public String gradeList(Model model) {
        QueryWrapper<Hotel> hotelQueryWrapper = new QueryWrapper<>();
        hotelQueryWrapper.orderByAsc("grade");
        List<Hotel> list = hotelService.list(hotelQueryWrapper);
        double[] arr = new double[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = list.get(i).getGrade();
        }
        model.addAttribute("hotelListByGrade", arr);
        return "hotel/gradeInfo";
    }

    @GetMapping("/price")
    public String priceList(Model model) {
        QueryWrapper<Hotel> hotelQueryWrapper1 = new QueryWrapper<>();
        hotelQueryWrapper1.le("price",300);
        int s1= hotelService.list(hotelQueryWrapper1).size();

        QueryWrapper<Hotel> hotelQueryWrapper2 = new QueryWrapper<>();
        hotelQueryWrapper2.between("price",300,400);
        int s2= hotelService.list(hotelQueryWrapper2).size();

        QueryWrapper<Hotel> hotelQueryWrapper3 = new QueryWrapper<>();
        hotelQueryWrapper3.between("price",400,500);
        int s3= hotelService.list(hotelQueryWrapper3).size();

        QueryWrapper<Hotel> hotelQueryWrapper4 = new QueryWrapper<>();
        hotelQueryWrapper4.between("price",500,600);
        int s4= hotelService.list(hotelQueryWrapper4).size();

        QueryWrapper<Hotel> hotelQueryWrapper5 = new QueryWrapper<>();
        hotelQueryWrapper5.gt("price",600);
        int s5= hotelService.list(hotelQueryWrapper5).size();
        int[] arr = {s5,s4,s3,s2,s1};
        model.addAttribute("hotelListByPrice", arr);
        return "hotel/priceInfo";
    }

}
