package com.lc.controller;

import com.lc.bean.User;
import com.lc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liuchao on 2018/6/7.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping(value = "/regist")
    public String regist(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        int id=1;
        User newUser = new User(id,username,password);
        userService.addUser(newUser);
        return "ok";
    }
}
