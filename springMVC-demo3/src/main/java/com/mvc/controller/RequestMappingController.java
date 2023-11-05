package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 该程序的说明如下：
 * 实现获取请求映射的功能
 */
@Controller
//@RequestMapping("/hello")
public class RequestMappingController {
    @RequestMapping(
            value = {"/testRequestMapping","/test"},
            //请求地址可以是value中的任何一个，但是请求方式必须是GET
//            method = {RequestMethod.GET}
            //请求地址可以是value中的任何一个，请求方式可以是GET，也可以是POST
            method = {RequestMethod.GET,RequestMethod.POST}

    )
    public String success(Model model){
        model.addAttribute("msg","123");
        return "success";
    }

    @GetMapping("/testGetMapping")
    public String testGetMapping(){
        return "success";
    }

    @RequestMapping(value = "/testPut",method = RequestMethod.PUT)
    public String testPut(){
        return "success";
    }

    @RequestMapping(
            value = "/testParamsAndHeaders",
            params={"username"}
    )
    public String testParamAndHeaders(){
        return "success";
    }

//    @RequestMapping("/a?a/testAnt")
//    @RequestMapping("/a*a/testAnt")
    //这样子写会被当做单独的*来解析，就变成了有两个匹配单个或多个字符的符号
//    @RequestMapping("/a**a/testAnt")
    @RequestMapping("/**/testAnt")
    public String testAnt(){
        return "success";
    }

    //{}表示占位符
    @RequestMapping("/testPath/{id}/{username}")
    public String testPath(@PathVariable("id")Integer id,@PathVariable("username") String username){
        System.out.println("id:"+id+",username:"+username);
        return "success";
    }

}
