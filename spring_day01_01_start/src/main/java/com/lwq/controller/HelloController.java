package com.lwq.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

/**
 * @author lwq
 * @date 2020/4/15 -16:38
 */
//控制器类
    @RequestMapping(path = "/user")
@Controller   //把容器交给spring管理
public class HelloController {
    @RequestMapping(path = "/hello")
    public String sayHello() {
        System.out.println("Hello StringMVC");
        return "success";
    }

    /**
     * RequestMapping注解
     * @return
     */
    //params 里面的参数必须要有的内容
    @RequestMapping(path = "/testRequestMapping",method = {RequestMethod.POST,RequestMethod.GET},
            params = {"username"}
            ,headers ={"Accept"} )
    public String testRequestMapping(){
        System.out.println("测试RequestMapping注解...");
        return  "success";
    }
}
