package com.study.demo1.bean;

import lombok.Data;

/**
 * @ClassName: User
 * @Author: 中都
 * @Date: 2021/8/1 16:49
 * @Description: TODO
 */
@Data
public class User {
    private Long userId;
    private String fullname;
    private char userType;
}
