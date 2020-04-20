package com.lwq.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lwq
 * @date 2020/4/20 -13:41
 */
//需要导入lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private  String name;
    private  Integer age;
    private  String  sex;
}
