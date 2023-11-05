package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 该程序的说明如下：
 */
@Controller
public class JsController {
    @RequestMapping("/success")
    public String success(){
        return "success";
    }
}
