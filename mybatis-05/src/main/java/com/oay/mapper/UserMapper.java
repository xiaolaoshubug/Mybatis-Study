package com.oay.mapper;

import com.oay.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/*********************************************************
 * @Package: com.oay.mapper
 * @ClassName: UserMapper.java
 * @Description�� ����
 * -----------------------------------
 * @author��ouay
 * @Version��v1.0
 * @Date: 2020-11-24
 *********************************************************/
public interface UserMapper {

    //  �����ݿ��ֶ���ʵ����֮��������ϵ
    @Results(id = "userMap", value = {
            @Result(column = "pwd", property = "password")
    })

    @Select("select * from user")
    List<User> selectUser();

    @ResultMap("userMap")
    @Select(" select * from user where id = #{id} ")
    User getUserById(@Param("id") int id, @Param("name") String name);
}
