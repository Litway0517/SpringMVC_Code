package com.atguigu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * http控制器
 *
 * @author DELL_
 * @date 2022/03/06
 */
@Controller
public class HttpController {

    /*
        @RequestBody注解: 加载响应方法中的形参的前面, 专门用来接收请求中的请求体内容. GET请求没有请求体. POST类型请求有请求体.
     */
    @PostMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody, String username,
                                  String password) {
        System.out.println(requestBody);
        System.out.println(username);
        System.out.println(password);
        return "success";
    }



}
