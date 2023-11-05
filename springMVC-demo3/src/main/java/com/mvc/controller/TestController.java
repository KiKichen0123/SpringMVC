package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 该程序的说明如下：
 */
@Controller
public class TestController {

    @RequestMapping("/")  //这么写无法引用thyemeleaf，下面那个可以
    public String index(){
        return "index";
    }

    @GetMapping("/t1")
    public String t1(Model model){
        model.addAttribute("msg","123");
        return "index";
    }

    @RequestMapping("/param")
    public String param(){
        return "test_param";
    }
}
