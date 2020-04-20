package com.lwq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author lwq
 * @date 2020/4/19 -19:15
 */
@Controller
public class ModelTest01 {
    @RequestMapping("m1/t1")

    public String test1(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        return "hello";
    }

    @RequestMapping("m1/t2")
    public String test2(Model model) {

        model.addAttribute("msg", "你好");
        //转发
//        return "forward:/WEB-INF/jsp/hello.jsp";
        //转发
//        return  "WEB-INF/jsp/hello.jsp";
        //重定向
        return "redirect:/index.jsp";
    }
}
