package com.lwq.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lwq
 * @date 2020/4/18 -17:25
 */
public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView view = new ModelAndView();
        //业务代码
        String result="hello小可爱";
        view.addObject("msg",result);

        //视图跳转
        view.setViewName("test");


        return view;

    }
}
