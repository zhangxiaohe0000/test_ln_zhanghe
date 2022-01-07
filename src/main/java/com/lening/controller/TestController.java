package com.lening.controller;

import com.lening.utils.ResultInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test1")
    public ResultInfo test1(){
        return new ResultInfo(true,"测试成功");
    }

}
