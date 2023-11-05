package com.mvc.controller;

import com.mvc.bean.User;
import org.junit.runner.RunWith;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 该程序的说明如下：
 * 获取请求参数的功能
 */
public class ParamController{

    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest request){
        //键为cookie,值为set session的随机序列
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:"+username+",password:"+password);
        return "success";
    }

    @RequestMapping("/testParam")
    //若多请求参数中出现多个同名的请求参数，可以再控制器方法的形参位置设置字符串类型或字符串数组接收此请求参数
    //若使用字符串类型的形参，最终结果为请求参数的每一个值之间使用逗号进行拼接
    public String testParam(
            @RequestParam("user_name") String username,
            String password,
            String hobby,
            @RequestHeader("Host") String host,
            //和形参绑定
            @CookieValue("JSESSIONID") String JSESSIONID){
        System.out.println("username:"+username+",password:"+password+",hobby:"+hobby);
        System.out.println("host:"+host);
        return "success";
    }

    @RequestMapping("/testBean")
    public String testBean(User user){
        System.out.println(user);
        return "success";
    }
}
