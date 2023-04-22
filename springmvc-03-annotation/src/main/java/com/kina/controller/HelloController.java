package com.kina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloController {
    //Localhost:8080/hello/h1
    @RequestMapping("/h1")
    public String hello(Model model) {
        model.addAttribute("msg", "Hello, springMVCAnnotation!");
        return "hello"; // 会被视图解析器处理
    }
}
