package com.oay.test;

import com.oay.entity.User;
import com.oay.mapper.UserMapper;
import com.oay.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*********************************************************
 * @Package: com.oay.test
 * @ClassName: UserTest.java
 * @Description： 测试mybatis ：CURD
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-24
 *********************************************************/
public class UserTest {

    static Logger log = Logger.getLogger(UserTest.class);

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = mapper.getUserById(1);
            log.info(user);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void selectLimitUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            int startIndex = 1; //  当前页
            int pageSize = 2;   //  每页几条
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("startIndex", (startIndex - 1) * pageSize);
            map.put("pageSize", pageSize);
            List<User> users = mapper.selectLimitUser(map);
            for (User user : users) {
                log.info(user);
            }
        } finally {
            sqlSession.close();
        }
    }
}
