package com.oay.entity;

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
public class User implements Serializable {
    private int id;         //  主键
    private String name;    //  姓名
    private String password;     //  密码

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
