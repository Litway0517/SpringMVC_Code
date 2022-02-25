package com.atguigu.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyViewController {

    @GetMapping("/testThymeleaf")
    public String testThymeleaf() {
        System.out.println("testThymeleaf");
        return "success";
    }

    @GetMapping("/testForward")
    public String testForward() {
        System.out.println("testForward");
        return "forward:/testThymeleaf";
    }

    @GetMapping("/testRedirect")
    public String testRedirect() {
        System.out.println("testRedirect");
        return "success";
    }
}
