package com.oay.mapper;

import com.oay.entity.Blog;

import java.util.*;

/*********************************************************
 * @Package: com.oay.mapper
 * @ClassName: Blog.java
 * @Description������
 * -----------------------------------
 * @author��ouay
 * @Version��v1.0
 * @Date: 2020-11-25
 *********************************************************/
public interface BlogMapper {

    //  ����һ��blog
    int addBlog(Blog blog);

    //  �����������ֺͲ�����������ѯ����
    List<Blog> queryBlog(Map<String, Object> map);

    //  ����id���޸Ĳ��͵�author����title
    int updateBlog(Map<String, Object> map);

    List<Blog> queryBlogChoose(Map<String, Object> map);

    List<Blog> queryBlogForeach(Map<String, Object> map);

}
