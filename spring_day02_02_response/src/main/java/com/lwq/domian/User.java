package com.lwq.domian;

import java.io.Serializable;

/**
 * @author lwq
 * @date 2020/4/17 -20:31
 */
public class User implements Serializable {
    private String username;
    private  String  password;
    private  Integer age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
