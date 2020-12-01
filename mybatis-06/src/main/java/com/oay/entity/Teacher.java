package com.oay.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/*********************************************************
 * @Package: com.oay.entity
 * @ClassName: Teacher.java
 * @Description£∫√Ë ˆ
 * -----------------------------------
 * @author£∫ouay
 * @Version£∫v1.0
 * @Date: 2020-11-25
 *********************************************************/
@Data
public class Teacher implements Serializable {

    private int id;
    private String name;
    private List<Student> students;
}
