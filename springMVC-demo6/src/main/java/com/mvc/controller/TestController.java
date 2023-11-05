package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 该程序的说明如下：
 */
@Controller
public class TestController {
    @RequestMapping("/testInterceptor")
    public String testInterceptor(){
        return "success";
    }

    @RequestMapping("/testExceptionHandler")
    public String testExceptionHandler(){
        System.out.println(1/0);
        return "success";
    }
}
