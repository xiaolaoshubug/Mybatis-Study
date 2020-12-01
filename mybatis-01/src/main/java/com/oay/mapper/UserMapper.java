package com.oay.mapper;

import com.oay.entity.User;

import java.util.List;
import java.util.Map;

/*********************************************************
 * @Package: com.oay.mapper
 * @ClassName: UserMapper.java
 * @Description������
 * -----------------------------------
 * @author��ouay
 * @Version��v1.0
 * @Date: 2020-11-24
 *********************************************************/
public interface UserMapper {

    //  ��ѯ�����û�
    List<User> selectUser();

    //  ����һ���û�
    int addUser(User user);
    int addUser2(Map<String, Object> map);

    //  �޸�һ���û�
    int updateUser(User user);

    //  ɾ��һ���û�
    int deleteUser(int id);
}
