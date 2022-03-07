package com.atguigu.controller;


import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * http控制器
 *
 * @author DELL_
 * @date 2022/03/06
 */
@Controller
public class HttpController {


    /*
        RequestEntity: 这个实体类用在控制器响应方法中的形参位置, 当springMVC框架调用方法时, 发现有形参为RequestEntity,
                        那么会由框架进行创建.
     */
    @PostMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity) {
        // requestEntity就是整个请求报文. 调用具体的方法能够获取请求报文中的相应部分, 如请求头 请求行..
        System.out.println("请求头: " + requestEntity.getHeaders());
        System.out.println("请求体: " + requestEntity.getBody());
        return "success";
    }

    /*
        @RequestBody注解: 加载响应方法中的形参的前面, 专门用来接收请求中的请求体内容. GET请求没有请求体. POST类型请求有请求体.
     */
    @PostMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody, @RequestParam("username") String name,
                                  String password) {
        System.out.println(requestBody);
        System.out.println(name);
        System.out.println(password);
        return "success";
    }



}
