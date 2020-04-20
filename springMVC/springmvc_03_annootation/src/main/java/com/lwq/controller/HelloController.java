package com.lwq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lwq
 * @date 2020/4/18 -19:25
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        //封装数据
        model.addAttribute("msg", "Hello,springmvc");
        return "hello";          //会被视图解析器处理
    }

}
