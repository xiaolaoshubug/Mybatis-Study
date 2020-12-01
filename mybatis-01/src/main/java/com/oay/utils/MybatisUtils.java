package com.oay.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/*********************************************************
 * @Package: com.oay.utils
 * @ClassName: MybatisUtils.java
 * @Description： mybatis工具类，获取sqlSessionFactory实例，返回sqlSession,SqlSession 的实例不是线程安全的，因此是不能被共享的
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-24
 *********************************************************/
public class MybatisUtils {

    //  创建sqlSessionFactory ：最简单的就是使用单例模式或者静态单例模式
    private static SqlSessionFactory sqlSessionFactory;

    //  静态块初始化加载配置文件及sqlSessionFactory实例
    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}
