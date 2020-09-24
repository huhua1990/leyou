package com.leyou.shardingsphere.service;

import com.leyou.shardingsphere.common.ResponseJson;
import com.leyou.shardingsphere.entity.Login;

/**
 * @Description
 * @Auther: hh
 * @Date: 2020/9/18 19:13
 * @Version:1.0
 */
public interface UserDemoService {

    public ResponseJson insertUser(Login login);

    public ResponseJson updateUserUserNameByPhone(Login login);

    public ResponseJson deleteUserByPhone(Login login);

    public ResponseJson findUserByPhone(String phone);
}
