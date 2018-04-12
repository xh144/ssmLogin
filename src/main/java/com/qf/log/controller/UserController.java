package com.qf.log.controller;

import com.qf.log.model.User;
import com.qf.log.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public void login(User user, HttpServletResponse resp) throws IOException {
        userService.UserLogin(user);
        if (user == null) {
            resp.getWriter().write("登陆失败!");
        } else {
            resp.getWriter().write("登陆成功!");
        }
    }
}
