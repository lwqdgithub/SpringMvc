package com.lwq.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lwq
 * @date 2020/4/16 -20:16
 */
public class StringToDateConverter implements Converter<String, Date> {
    /**
     *
     * @param s 传入进来的字符串
     * @return
     */
    @Override
    public Date convert(String s) {
        //判断
        if(s==null){
            throw  new RuntimeException("没有值啊");
        }
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        //把字符串转换成日期
        try {
            return df.parse(s);
        } catch (Exception e) {
            throw  new RuntimeException("类型转换出现了失败");
        }
    }
}
