package com.lwq.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lwq.user.User;
import com.lwq.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author lwq
 * @date 2020/4/20 -13:45
 */
//@Controller  //会走视图解析器
@RestController //不会走视图解析器
public class UserController {
    @RequestMapping("/j1")
    @ResponseBody   //它就不会走视图解析器，会返回直接一个字符串
    public String json1() throws JsonProcessingException {
        //jackson,ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user = new User();
        user.setAge(15);
        user.setName("罗伟强");
        user.setSex("男");
        String str = mapper.writeValueAsString(user);

        return str;
    }

    @RequestMapping("/j2")
    @ResponseBody
    public String json2() throws JsonProcessingException {
        List<User> user = new ArrayList<User>();
        User user1 = new User("罗伟强1", 15, "男");
        User user2 = new User("罗伟强2", 16, "男");
        User user3 = new User("罗伟强3", 17, "男");
        User user4 = new User("罗伟强4", 18, "男");
        user.add(user1);
        user.add(user2);
        user.add(user3);
        user.add(user4);
        return JsonUtils.getJson(user);
    }

    @RequestMapping("/j3")
    @ResponseBody
    public String json3() throws JsonProcessingException {
        Date date = new Date();
        return JsonUtils.getJson(date, "yyyy-MM-dd");
    }

    @RequestMapping("/j4")
    @ResponseBody
    public String json4() throws JsonProcessingException {
        List<User> user = new ArrayList<User>();
        User user1 = new User("罗伟强1", 15, "男");
        User user2 = new User("罗伟强2", 16, "男");
        User user3 = new User("罗伟强3", 17, "男");
        User user4 = new User("罗伟强4", 18, "男");
        user.add(user1);
        user.add(user2);
        user.add(user3);
        user.add(user4);
        String string = JSON.toJSONString(user);
        return string;
    }
}
