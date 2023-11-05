package com.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 该程序的说明如下：
 * 使用RESTFyl模拟用户资源的增上改查
 * /user GET 查询所有用户信息
 * /user/1 GET 根据用户id查询用户信息
 * /user POST 添加用户信息
 *  /user/1 DELETE 删除用户信息
 *  /user PUT 修改用户信息
 */
public class UserController {

    @RequestMapping(value="/user",method = RequestMethod.GET)
    public String getAlluser(){
        System.out.println("查询所有用户信息");
        return "success";
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getUserById(){
        System.out.println("根据id查询用户信息");
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String insertUser(String username,String password){
        System.out.println("添加用户信息："+username+","+password);
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String updateUser(String username,String password){
        System.out.println("修改用户信息："+username+","+password);
        return "success";
    }
}
