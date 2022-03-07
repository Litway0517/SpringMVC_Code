package com.atguigu.controller;


import com.domain.Student;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


/**
 * http控制器
 *
 * @author DELL_
 * @date 2022/03/06
 */
@Controller
public class HttpController {

    /*
        报错, 因为http协议下, 浏览器不知道服务器返回的是什么对象. 浏览器并不知道List<Student>是什么类型的数据.
        配置了jackson依赖时就能正常返回了
     */
    @GetMapping("/testResponseBody3")
    @ResponseBody
    public List<Student> testResponseBody3() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "test1", "test1"));
        students.add(new Student(2, "test2", "test2"));
        return students;
    }


    @GetMapping("/testResponseBody2")
    @ResponseBody
    public ModelAndView testResponseBody2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("test1", "测试1");
        modelAndView.addObject("test2", "测试2");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    /*
        @ResponseBody注解: 在一个响应方法上标识此注解, 返回字符串时不进行跳转.
                            用于将方法的返回值作为响应报文的响应体回传到浏览器.
     */
    @GetMapping("/testResponseBody")
    @ResponseBody
    public String testResponseBody() {
        return "success";
    }


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
