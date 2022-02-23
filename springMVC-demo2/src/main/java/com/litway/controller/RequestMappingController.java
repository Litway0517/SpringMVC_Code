package com.litway.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class RequestMappingController {


    /*
        header参数的使用.
        请求头中的参数 Cache-Control 必须是 no-cache. 不然会报错404.
        火狐的 禁用缓存 按钮, 勾选与不勾选就可以测试.
     */
    @GetMapping(value = "/testParamsHeaders", headers = {"Cache-Control=no-cache"})
    public String testParamsHeaders() {
        System.out.println("testParamsHeaders");
        return "success";
    }


    // 测试method参数
    @RequestMapping(value = "/testParametersAndHeaders",
            /*
                表示: 以下三个条件同时满足
                    1- 请求头必须携带username参数, 而且username的值不能是admin.
                    2- 请求头必须携带password参数, 可以为空
                    3- 请求头必须不能携带id参数
             */
            params = {"username!=admin", "password", "!id"}
    )
    public String testParametersAndHeaders() {

        System.out.println("testParametersAndHeaders");
        return "success";
    }


    // 测试@RequestMapping
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

    // 测试@PostMapping
    @PostMapping("/testPostMapping")
    public String testPostMapping() {
        System.out.println("testPostMapping");
        return "success";
    }


    // 测试put请求方式
    @RequestMapping(value = "/testPut", method = RequestMethod.PUT)
    public String testPut() {
        System.out.println("testPut");
        return "success";
    }




}
