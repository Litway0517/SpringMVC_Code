package com.litway.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class ScopeController {

    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map) {
        // 形参是Map集合. 向map中添加数据就是request域中添加数据.
        map.put("testRequestScope", "hello, Map");
        return "success";
    }
}
