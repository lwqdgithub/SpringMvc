package com.lwq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author lwq
 * @date 2020/4/18 -20:43
 */
@Controller
public class RestFulController {

    //   原来的： http://localhost:8080/springmvc_04_controller_war_exploded/add?a=3&b=4
    //    restful:http://localhost:8080/springmvc_04_controller_war_exploded/add/a/b

    //    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    @GetMapping(value = "/add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果为1:" + res);
        return "hello";
    }

    @PostMapping(value = "/add/{a}/{b}")
    public String test2(@PathVariable String a, @PathVariable String b, Model model) {
        String res = a + b;
        model.addAttribute("msg", "结果为2:" + res);
        return "hello";
    }
}
