package com.lwq.controller;

import com.lwq.domain.User;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

/**
 * @author lwq
 * @date 2020/4/16 -20:54
 */
@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"哈哈"})  //把哈哈=小包存入到session域中
public class AnnoController {
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username) {
        System.out.println("啊啊两个执行了");
        System.out.println(username);
        return "success";
    }

    @RequestMapping("/testRequestBody")
    /**
     *  获取请求体的内容
     */
    public String testRequestBody(@RequestBody String body) {
        System.out.println("啊啊两个执行了");
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/testPathVariable/{id}")
    /**
     * PathVariable注解
     */
    public String testPathVariable(@PathVariable(name = "id") String id) {
        System.out.println("啊啊两个执行了");
        System.out.println(id);
        return "success";
    }

    @RequestMapping("/testRequestHeader")
    /**
     * 获取请求头的值
     */
    public String testRequestHeader(@RequestHeader(value = "Accept") String header) {
        System.out.println("啊啊两个执行了");
        System.out.println(header);
        return "success";
    }

    @RequestMapping("/testCookieValue")
    /**
     * 获取Cookie的值
     */
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String value) {
        System.out.println("啊啊两个执行了");
        System.out.println(value);
        return "success";
    }

    @RequestMapping(value = "/testModelAttribute")
    /**
     * ModelAttribute
     */
    public String testModelAttribute(@ModelAttribute("abc") User user) {
        System.out.println("啊啊两个执行了");
        System.out.println(user);
        return "success";
    }

    @RequestMapping(value = "/testSessionAttributes")
    /**
     * SessionAttributes注解
     */
    public String testSessionAttributes(Model model) {
        System.out.println("啊啊两个执行了");
//        底层会存储对象到request域对象中
        model.addAttribute("哈哈", "小包");
        return "success";
    }

    @RequestMapping(value = "/getSessionAttributes")
    /**
     *  从session域中获取值
     */
    public String getSessionAttributes(ModelMap modelMap) {
        System.out.println("getSessionAttributes");
//        底层会存储对象到request域对象中
        Object ha = modelMap.get("哈哈");
        System.out.println(ha);
        return "success";
    }


    @RequestMapping(value = "/delSessionAttributes")
    /**
     *  从session域中清除数据
     */
    public String delSessionAttributes(SessionStatus status) {
        System.out.println("getSessionAttributes");
        status.setComplete();
        return "success";
    }



    /**第一种方式 有返回值
     * 该方法会先执行
     @ModelAttribute public  User showUser(String uname){
     System.out.println("showUser我执行了");
     //通过用户查询数据库（模拟）
     User user=new User();
     user.setUname(uname);
     user.setAge(20);
     user.setDate(new Date());
     return user;
     }
     */

    /**
     * 第二种方式 没有返回值
     * 该方法会先执行

    @ModelAttribute
    public void showUser(String uname, Map<String, User> map) {
        System.out.println("showUser我执行了");
        //通过用户查询数据库（模拟）
        User user = new User();
        user.setUname(uname);
        user.setAge(20);
        user.setDate(new Date());
        map.put("abc", user);
    }
     */
}
