package com.lwq.controller;

import com.lwq.domian.User;
import com.sun.media.sound.ModelWavetable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lwq
 * @date 2020/4/17 -20:23
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/testString")
    public String testString(Model model) {
        /**
         * 返回值字符串
         */
        System.out.println("小可爱执行了");
        User user = new User();
        user.setUsername("小可爱");
        user.setAge(18);
        user.setPassword("147258");
        model.addAttribute("user", user);
        return "success";
    }

    @RequestMapping(value = "/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) {
        /**
         * 返回值void
         * 请求转发一次请求，不用编写项目的名称
         */
        try {
            System.out.println("小可爱执行了");
//            编写请求转发的代码
//            request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);

            //重定向
//            response.sendRedirect(request.getContextPath()+"/index.jsp");

//            直接会进行响应
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().print("我叫罗伟强");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/testModelAndView")
    public ModelAndView testModelAndView() {
        /**
         * 创建出ModelAndView对象
         */
        ModelAndView mv = new ModelAndView();
        System.out.println("小可爱执行了");
        User user = new User();
        user.setUsername("小可爱");
        user.setAge(18);
        user.setPassword("1472aaa58");
        //把user对象存储到MV对象中，也会把user对象存入request对象
        mv.addObject("user", user);
        //跳转到那个页面
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping(value = "/testForwardOrRedirect")
    public String testForwardOrRedirect() {
        /**
         * 使用关键字的方式请求转发和重定向
         */
        System.out.println("小可爱执行了");

        //请求的转发
//        return "forward:/WEB-INF/pages/success.jsp";

          //重定向
        return "redirect:/index.jsp";

    }
}

