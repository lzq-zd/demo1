package com.study.demo1.mapper;

import com.study.demo1.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    //添加
    @Insert("insert into t_user(user_id,fullname) value(#{userId},#{fullname})")
    int insertUser(@Param("userId")Long userId,@Param("fullname")String fullname);

    //查询
    List<User> selectByIds(List<Long> ids);
}
