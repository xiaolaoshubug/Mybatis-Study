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
 * @Description£∫ ≤‚ ‘mybatis £∫CURD
 * -----------------------------------
 * @author£∫ouay
 * @Version£∫v1.0
 * @Date: 2020-11-24
 *********************************************************/
public class UserTest {

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = mapper.getUserById(1);
            System.out.println(user);
        } finally {
            sqlSession.close();
        }
    }
}
