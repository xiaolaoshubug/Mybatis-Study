package com.oay.mapper;

import com.oay.entity.Student;

import java.util.List;

/*********************************************************
 * @Package: com.oay.mapper
 * @ClassName: Student.java
 * @Description������
 * -----------------------------------
 * @author��ouay
 * @Version��v1.0
 * @Date: 2020-11-25
 *********************************************************/
public interface StudentMapper {
    //  ���һ
    List<Student> getStudents();
    List<Student> getStudents2();
}
