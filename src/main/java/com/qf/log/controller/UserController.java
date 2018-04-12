package com.qf.log.controller;

import com.qf.log.model.User;
import com.qf.log.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/log")
    public void login(User user, HttpServletResponse resp) throws IOException {
        user = userService.UserLogin(user);
        resp.setContentType("text/html;charset=utf-8");
        if (user == null) {
            resp.getWriter().write("登陆失败!");
        } else {
            resp.getWriter().write("登陆成功!");
        }
    }

    @RequestMapping("/index")
    public String test() {
        System.out.println("访问成功!");
        return "index";
    }
}
