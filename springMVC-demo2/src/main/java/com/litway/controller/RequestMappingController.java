package com.litway.controller;


import org.springframework.stereotype.Controller;
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


}
