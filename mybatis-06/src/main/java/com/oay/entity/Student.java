package com.oay.entity;

import lombok.Data;

import java.io.Serializable;

/*********************************************************
 * @Package: com.oay.entity
 * @ClassName: Student.java
 * @Description：描述
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-25
 *********************************************************/
@Data
public class Student implements Serializable {
    /*
        多对一
    private int id;
    private String name;
    private Teacher teacher;
     */
    /**
     * 一对多
     */
    private int id;
    private String name;
    private int tid;
}
