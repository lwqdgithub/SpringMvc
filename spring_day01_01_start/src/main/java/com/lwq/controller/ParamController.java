package com.lwq.controller;

import com.lwq.domain.Account;
import com.lwq.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author lwq
 * @date 2020/4/16 -13:24
 */
@Controller   //把容器交给spring管理
@RequestMapping(path = "/param")
public class ParamController {
    /**
     * 请求参数绑定入门
     */
    @RequestMapping(path = "/testParam")
    public String testParam(String username) {
        System.out.println("奥利给...");
        System.out.println("用户名" + username);
        return "success";
    }

    /**
     * 请求参数绑定把数据封装到javabean的类中
     */
    /**
     *如果实体类Account中还有其他的引用类型的数据要封装，并且想得到数据可以使用变量名.属性名的方式得到数据
     * 如：user.age
     * @param account
     * @return
     */
    @RequestMapping(path = "/saveAccount")
    public String saveAccount(Account account) {
        System.out.println("奥利给...");
        System.out.println(account);
        return "success";
    }

    /**
     * 自定义类型转换器
     * @param user
     * @return
     */
    @RequestMapping(path = "/saveUser")
    public String saveUser(User user) {
        System.out.println("奥利给...");
        System.out.println(user);
        return "success";
    }

    @RequestMapping(path = "/testServlet")
    /**
     * 原生的API获取
     */
    public String testServlet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("奥利给...");
        System.out.println(request);
        HttpSession session = request.getSession();
        System.out.println(session);
        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);

        System.out.println(response);
        return "success";
    }
}
