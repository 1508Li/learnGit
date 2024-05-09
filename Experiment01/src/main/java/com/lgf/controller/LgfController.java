package com.lgf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller层
 * @author 李冠锋
 * @date 2024/5/8 下午8:18
 */
@Controller
public class LgfController {
    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "我是软件2115班李冠锋，学号为2021005545";
    }
}
