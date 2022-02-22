package com.litway.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class RequestMappingController {

    @RequestMapping(
            // 只要客户端的请求能够满足其中任何一个路径就能够映射到该方法来.
            value = {"/testRequestMapping", "/test"},
            // 现在仅支持GET 和 POST请求方式. 前提是value地址必须匹配一致
            method = {RequestMethod.GET, RequestMethod.POST}
    )
    public String success() {
        return "success";
    }

    // @GetMapping是@RequestMapping注即的派生注解, 表示的是, 仅支持GET请求方法. 这样简化了@RequestMapping注解
    @GetMapping("/testGetMapping")
    public String getMapping() {
        System.out.println("getMapping");
        return "success";
    }


    @PostMapping("/testPostMapping")
    public String testPostMapping() {
        System.out.println("testPostMapping");
        return "success";
    }


    @RequestMapping(value = "/testPut", method = RequestMethod.PUT)
    public String testPut() {
        System.out.println("testPut");
        return "success";
    }

}
