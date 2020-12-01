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
 * @Description�� mybatis�����࣬��ȡsqlSessionFactoryʵ��������sqlSession,SqlSession ��ʵ�������̰߳�ȫ�ģ�����ǲ��ܱ������
 * -----------------------------------
 * @author��ouay
 * @Version��v1.0
 * @Date: 2020-11-24
 *********************************************************/
public class MybatisUtils {

    //  ����sqlSessionFactory ����򵥵ľ���ʹ�õ���ģʽ���߾�̬����ģʽ
    private static SqlSessionFactory sqlSessionFactory;

    //  ��̬���ʼ�����������ļ���sqlSessionFactoryʵ��
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
