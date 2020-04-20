package com.lwq.controller;

import com.lwq.domin.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lwq
 * @date 2020/4/19 -20:03
 */
@Controller
public class UserController {
    @RequestMapping("/user")
    public String testUser(@RequestParam("username") String name, Model model) {
        //1.接受前端参数
        System.out.println("接受的参数为：" + name);
        //2.将返回结果传递给前端
        model.addAttribute("msg", name);
        //3.视图跳转
        return "hello";
    }

    @RequestMapping("/user2")
    public String test2User(User user, Model model) {
        user.setPassword("123");
        user.setName("李四");
        user.setAge(15);
        System.out.println(user);
        model.addAttribute("msg", user);
        //3.视图跳转
        return "hello";
    }
}
