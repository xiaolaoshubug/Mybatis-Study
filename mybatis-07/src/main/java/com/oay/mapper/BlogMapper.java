package com.oay.mapper;

import com.oay.entity.Blog;

import java.util.*;

/*********************************************************
 * @Package: com.oay.mapper
 * @ClassName: Blog.java
 * @Description：描述
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-25
 *********************************************************/
public interface BlogMapper {

    //  新增一个blog
    int addBlog(Blog blog);

    //  根据作者名字和博客名字来查询博客
    List<Blog> queryBlog(Map<String, Object> map);

    //  根据id来修改博客的author或者title
    int updateBlog(Map<String, Object> map);

    List<Blog> queryBlogChoose(Map<String, Object> map);

    List<Blog> queryBlogForeach(Map<String, Object> map);

}
