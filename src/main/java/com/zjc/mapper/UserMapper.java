package com.zjc.mapper;

import com.zjc.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    // 把复杂的 JDBC 代码全部封装在这个方法里


        @Select("select *from users where username=#{username} and password =#{password}")
        User select(@Param("username")String username,@Param("password") String password);

        @Select("select *from users where username=#{username}")
        User selectByUsername(String username);
        // ✅ 标准写法：把要插入的列名用括号括起来写在表名后面
        @Insert("insert into users (username, password) values (#{username}, #{password})")
        void add(User user);
}