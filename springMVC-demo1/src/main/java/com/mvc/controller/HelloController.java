package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 该程序的说明如下：
 */
@Controller
public class HelloController {
    //“/”-->/WEB-INF/templates/index.html
    //请求映射
    //当浏览器发送的请求是/，也就是上下文路径的时候，就会执行这个注解标识的方法
    @RequestMapping("/")
    public String index(){
        //返回视图名称index
        //这里返回的视图名称将被视图前缀和后缀解析
        //然后就会调整跳转到index.html
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
}
