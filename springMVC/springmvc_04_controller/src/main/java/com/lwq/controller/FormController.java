package com.lwq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lwq
 * @date 2020/4/19 -20:33
 */
@Controller
public class FormController {
    @PostMapping("/hello")
    public  String fromTest(Model model ,String name){
        model.addAttribute("msg",name);
        return  "hello";
    }
}
