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
 * @Description������
 * -----------------------------------
 * @author��ouay
 * @Version��v1.0
 * @Date: 2020-11-25
 *********************************************************/
public class TestMapper {

    static Logger log = Logger.getLogger(TestMapper.class);


    /*
    ���Զ��ѧ����Ӧһλ��ʦ
    @Test
    public void getStudents2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> students = mapper.getStudents2();
            for (Student student : students) {
                log.info("ѧ����:"+ student.getName()
                        +"\t��ʦ:"+student.getTeacher().getName());
            }
        } finally {
            sqlSession.close();
        }
    }*/

    /*����һλ��ʦ��Ӧ���ѧ��*/
    @Test
    public void getTeacher2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
            Teacher teacher = mapper.getTeacher2(1);
            log.info("��ʦ��" + teacher.getName());
            for (Student student : teacher.getStudents()) {
                log.info("ѧ����" + student.getName());
            }
        } finally {
            sqlSession.close();
        }
    }
}
