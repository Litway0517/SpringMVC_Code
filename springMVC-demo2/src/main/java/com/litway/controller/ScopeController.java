package com.litway.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class ScopeController {

    // 通过向形参Map中添加数据, 在前端输出request域. 发现输出的就是添加的数据. 因此, 此处的map本质与request域有关.
    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map) {
        // 形参是Map集合. 向map中添加数据就是request域中添加数据.
        map.put("testRequestScope", "hello, Map");
        return "success";
    }

    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap mm) {
        mm.addAttribute("testRequestScope", "hello, ModelMap");
        return "success";
    }


}
