package com.litway.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class RequestMappingController {

    @RequestMapping(
            // 只要客户端的请求能够满足其中任何一个路径就能够映射到该方法来.
            value = {"/testRequestMapping", "/test"}
    )
    public String success() {
        return "success";
    }


}
