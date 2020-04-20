package com.lwq.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;

/**
 * @author lwq
 * @date 2020/4/20 -14:50
 */
public class JsonUtils {
    public static String getJson(Object object, String data) {
        ObjectMapper mapper = new ObjectMapper();
        SimpleDateFormat sdf = new SimpleDateFormat(data);
        mapper.setDateFormat(sdf);
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    
    public static String getJson(Object object){
        return getJson(object,"yyyy-MM-dd");
    }
}
