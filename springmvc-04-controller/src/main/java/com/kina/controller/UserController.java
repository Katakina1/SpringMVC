package com.kina.controller;

import com.kina.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model) {
        // 1.接收前端参数
        System.out.println("接收到前端的参数为" + name);
        // 2.将返回结果传递给前端
        model.addAttribute("msg", name);
        // 跳转视图
        return "test";
    }

    // 前端接收到的是一个对象
    @GetMapping("/t2")
    public String test2(User user) {
        System.out.println(user.toString());
        return "test";
    }

}
