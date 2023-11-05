package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 该程序的说明如下：
 */
@Controller
public class ViewController {
    @RequestMapping("/testThymeleafView")
    public String testThymeleafView(){
        return "success";
    }

    @RequestMapping("/testForward")
    public String testForward(){
        //地址栏上是testForward，页面是success
        return "forward:/testThymeleaf";
    }

    @RequestMapping("/testRedirect")
    public String testRedirect(){
        //地址栏是testThymeleafView，页面是success
        return "redirect:/testThymeleafView";
    }
}
