package com.yjmer.user.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;


    private String username;

    private String password;

    private Date createDate;
}
