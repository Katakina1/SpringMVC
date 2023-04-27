package com.kina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {
    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password, Model model) {
        // 把用户的信息存在session中
        model.addAttribute("username", username);
        session.setAttribute("userLoginInfo", username);
        return "main";
    }

    @RequestMapping("/goOut")
    public String login(HttpSession session) {
        // 把用户的信息存在session中
        session.removeAttribute("userLoginInfo");
        return "main";
    }

    @RequestMapping("/goLogin")
    public String login() {
        return "login";
    }

    @RequestMapping("/main")
    public String main() {
        return "main";
    }
}
