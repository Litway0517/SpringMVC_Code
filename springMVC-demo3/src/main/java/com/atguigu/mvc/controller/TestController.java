package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Date:2021/7/7
 * Author:ybc
 * Description:
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    // 在主页访问test_view就会跳转到test_view这个界面. test_view.hmtl
    @GetMapping("/test_view")
    public String testView() {
        System.out.println("testView");
        return "test_view";
    }
}
