package com.oay.mapper;

import com.oay.entity.User;

import java.util.List;
import java.util.Map;

/*********************************************************
 * @Package: com.oay.mapper
 * @ClassName: UserMapper.java
 * @Description：描述
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-24
 *********************************************************/
public interface UserMapper {

    //  查询所有用户
    List<User> selectUser();

    //  增加一个用户
    int addUser(User user);
    int addUser2(Map<String, Object> map);

    //  修改一个用户
    int updateUser(User user);

    //  删除一个用户
    int deleteUser(int id);
}
