package com.oay.entity;

import lombok.Data;

import java.io.Serializable;

/*********************************************************
 * @Package: com.oay.entity
 * @ClassName: User.java
 * @Description： 用户实体类
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-24
 *********************************************************/
@Data
public class User implements Serializable {
    private int id;         //  主键
    private String name;    //  姓名
    private String pwd;     //  密码


    public User(int id) {
        this.id = id;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }
}
