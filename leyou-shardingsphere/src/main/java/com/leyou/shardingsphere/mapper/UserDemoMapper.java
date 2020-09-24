package com.leyou.shardingsphere.mapper;

import com.leyou.shardingsphere.entity.UserDemo;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;


/**
 * @Description
 * @Auther: hh
 * @Date: 2020/9/18 19:20
 * @Version:1.0
 */
@Mapper
public interface UserDemoMapper extends BaseMapper<UserDemo> {

    @Select("select * from user_demo where phone = #{phone}")
    List<UserDemo> findUserByPhone(@Param("phone") String phone);

    @Select("select * from user_demo where phone = #{phone} order by create_time")
    List<UserDemo> findUserByPhoneOderByTime(@Param("phone") String phone);

    @Update("update user_demo set user_name = #{userName} where id = #{id}")
    public Integer updateUserNameById(@Param("userName") String userName, @Param("id") String id);

    @Update("update user_demo set user_name = #{userName} where phone = #{phone}")
    public Integer updateUserNameByPhone(@Param("userName") String userName, @Param("phone") String phone);

    @Delete("delete from user_demo where phone = #{phone}")
    public Integer deleteUserByPhone(@Param("phone") String phone);
}
