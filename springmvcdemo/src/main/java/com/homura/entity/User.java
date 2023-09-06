package com.homura.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    /**
     * 用户ID
     */
    private Integer uid;
    /**
     * 用户姓名
     */
    private String uname;
    /**
     * 密码
     */
    private String password;
    /**
     * 性别
     */
    private String gender;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 邮件
     */
    private String email;
    /**
     * 地址
     */
    private String address;
}
