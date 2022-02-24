package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * 用户控制器
 *
 * @author DELL_
 * @date 2022/02/24
 */
@Controller
public class UserController {

    /**
     * 使用RESTFul模拟用户资源的增删改查
     * /user    GET     查询所有用户信息
     * /user/1    GET     根据用户id查询用户信息
     * /user    POST     添加用户信息
     * /user/1    DELETE     删除用户信息
     * /user    PUT     修改用户信息
     */

    @GetMapping("/user")
    public String getAllUser() {
        System.out.println("查询所有用户信息");
        return "success";
    }

    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable("id") Integer id) {
        System.out.println("根据用户id, 查询到了用户信息....");
        return "success";
    }

    // 保存用户  和上面是不一样的, 因为这里是post请求. 所以能够和上面分开
    @PostMapping("/user")
    public String insertUser(String username, String password) {
        System.out.println("用户信息保存到了数据库中...  用户名: " + username + "密码: " + password);
        return "success";
    }

    // 更新用户
    @PutMapping("/user/{id}")
    public String updateUser(@PathVariable("id") Integer id) {
        System.out.println("成功修改用户信息.....");
        return "success";
    }

    // 删除用户
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") Integer id) {
        System.out.println("删除用户id为: " + id + "的用户");
        return "success";
    }
}
