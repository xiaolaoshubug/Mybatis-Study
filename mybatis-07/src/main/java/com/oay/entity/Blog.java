package com.oay.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/*********************************************************
 * @Package: com.oay.entity
 * @ClassName: Blog.java
 * @Description£∫√Ë ˆ
 * -----------------------------------
 * @author£∫ouay
 * @Version£∫v1.0
 * @Date: 2020-11-25
 *********************************************************/
@Data
public class Blog implements Serializable {

    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;
}
