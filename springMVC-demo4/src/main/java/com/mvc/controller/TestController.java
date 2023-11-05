package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 该程序的说明如下：
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/test_view")
    public String testView(){
        return "test_view";
    }
}
