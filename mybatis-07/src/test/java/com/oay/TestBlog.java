package com.oay;

import com.oay.entity.Blog;
import com.oay.mapper.BlogMapper;
import com.oay.utils.IDUtil;
import com.oay.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.*;

/*********************************************************
 * @Package: com.oay
 * @ClassName: TestBlog.java
 * @Description：描述
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-25
 *********************************************************/
public class TestBlog {
    static Logger log = Logger.getLogger(TestBlog.class);

    @Test
    public void addBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            Blog blog = new Blog();
            blog.setId(IDUtil.genId());
            blog.setTitle("Mybatis如此简单");
            blog.setAuthor("狂神说");
            blog.setCreateTime(new Date());
            blog.setViews(9999);

            mapper.addBlog(blog);

            blog.setId(IDUtil.genId());
            blog.setTitle("Java如此简单");
            mapper.addBlog(blog);

            blog.setId(IDUtil.genId());
            blog.setTitle("Spring如此简单");
            mapper.addBlog(blog);

            blog.setId(IDUtil.genId());
            blog.setTitle("微服务如此简单");
            mapper.addBlog(blog);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void queryBlogIf() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("title", "Mybatis如此简单");
            List<Blog> blogs = mapper.queryBlog(map);
            log.info(blogs);
            map.put("author", "狂神说");
            List<Blog> blogs1 = mapper.queryBlog(map);
            log.info(blogs1);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void updateBlogSet() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("title", "动态SQL666");
            map.put("author", "秦疆老师66");
            map.put("id", "45228c01d4354c94990733913398b237");
            mapper.updateBlog(map);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void queryBlogChoose() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("title", "动态SQL666");
            map.put("author", "秦疆老师66");
            map.put("views", "9999");
            List<Blog> blogs = mapper.queryBlogChoose(map);
            log.info(blogs);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void queryBlogForeach() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            Map<String, Object> map = new HashMap<String, Object>();
            List<Integer> list = new ArrayList<Integer>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            map.put("ids", list);
            List<Blog> blogs = mapper.queryBlogForeach(map);
            log.info(blogs);
        } finally {
            sqlSession.close();
        }
    }
}
