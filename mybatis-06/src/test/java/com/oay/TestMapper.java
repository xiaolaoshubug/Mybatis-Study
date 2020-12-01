package com.oay;

import com.oay.entity.Student;
import com.oay.entity.Teacher;
import com.oay.mapper.StudentMapper;
import com.oay.mapper.TeacherMapper;
import com.oay.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

/*********************************************************
 * @Package: com.oay
 * @ClassName: TestMapper.java
 * @Description：描述
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-25
 *********************************************************/
public class TestMapper {

    static Logger log = Logger.getLogger(TestMapper.class);


    /*
    测试多个学生对应一位老师
    @Test
    public void getStudents2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> students = mapper.getStudents2();
            for (Student student : students) {
                log.info("学生名:"+ student.getName()
                        +"\t老师:"+student.getTeacher().getName());
            }
        } finally {
            sqlSession.close();
        }
    }*/

    /*测试一位老师对应多个学生*/
    @Test
    public void getTeacher2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
            Teacher teacher = mapper.getTeacher2(1);
            log.info("老师：" + teacher.getName());
            for (Student student : teacher.getStudents()) {
                log.info("学生：" + student.getName());
            }
        } finally {
            sqlSession.close();
        }
    }
}
