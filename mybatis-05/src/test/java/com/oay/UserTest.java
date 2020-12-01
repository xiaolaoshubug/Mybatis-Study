package com.oay;

import com.oay.entity.User;
import com.oay.mapper.UserMapper;
import com.oay.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

/*********************************************************
 * @Package: com.oay
 * @ClassName: UserTest.java
 * @Description£∫√Ë ˆ
 * -----------------------------------
 * @author£∫ouay
 * @Version£∫v1.0
 * @Date: 2020-11-24
 *********************************************************/
public class UserTest {

    static Logger log = Logger.getLogger(UserTest.class);

    @Test
    public void selectUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> users = mapper.selectUser();
            for (User user : users) {
                log.info(user);
            }
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = mapper.getUserById(1, "");
            log.info(user);
        } finally {
            sqlSession.close();
        }
    }
}
