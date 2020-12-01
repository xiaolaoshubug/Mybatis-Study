package com.oay.mapper;

import com.oay.entity.User;

import java.util.List;
import java.util.Map;

/*********************************************************
 * @Package: com.oay.mapper
 * @ClassName: UserMapper.java
 * @Description£∫√Ë ˆ
 * -----------------------------------
 * @author£∫ouay
 * @Version£∫v1.0
 * @Date: 2020-11-24
 *********************************************************/
public interface UserMapper {
    User getUserById(int id);

    //  ∑÷“≥≤È—Ø
    List<User> selectLimitUser(Map<String, Object> map);

}
