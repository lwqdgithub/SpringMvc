package com.lwq.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lwq
 * @date 2020/4/16 -16:25
 */
public class User implements Serializable {
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private  String uname;
    private  Integer age;
    private Date date;

}
