package com.oay.test;

import com.oay.entity.User;
import com.oay.mapper.UserMapper;
import com.oay.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/*********************************************************
 * @Package: com.oay.test
 * @ClassName: UserTest.java
 * @Description�� ����mybatis ��CURD
 * -----------------------------------
 * @author��ouay
 * @Version��v1.0
 * @Date: 2020-11-24
 *********************************************************/
public class UserTest {

    @Test
    public void selectUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserMapper user = sqlSession.getMapper(UserMapper.class);
            for (User user1 : user.selectUser()) {
                System.out.println(user1);
            }
        } finally {
            //  �ر����ӡ��ٷ��Ƽ�д��finally������
            sqlSession.close();
        }
    }

    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = new User(4, "С��", "138777");
            int result = mapper.addUser(user);
            if (result > 0) {
                sqlSession.commit();
                System.out.println("�û����ݲ���ɹ�������");
            }
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void addUser2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("userid", 6);
            map.put("username", "Сŷ");
            map.put("password", "138999");
            int result = mapper.addUser2(map);
            if (result > 0) {
                sqlSession.commit();
                System.out.println("�û����ݲ���ɹ�������");
            }
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = new User(4, "С��ͬѧ", "138888");
            int result = mapper.updateUser(user);
            if (result > 0) {
                sqlSession.commit();
                System.out.println("�û������޸ĳɹ�������");
            }
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            int result = mapper.deleteUser(4);
            if (result > 0) {
                sqlSession.commit();
                System.out.println("�û�����ɾ���ɹ�������");
            }
        } finally {
            sqlSession.close();
        }
    }
}
