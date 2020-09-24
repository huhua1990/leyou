package com.leyou.shardingsphere.controller;

import com.leyou.shardingsphere.common.ResponseJson;
import com.leyou.shardingsphere.entity.Login;
import com.leyou.shardingsphere.service.UserDemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description UserDemoController
 * @Auther: hh
 * @Date: 2020/9/18 18:20
 * @Version:1.0
 */
@RestController
@RequestMapping("/userDemo")
public class UserDemoController {

    private Logger logger = LoggerFactory.getLogger(UserDemoController.class);

    @Autowired
    private UserDemoService userService;

    @PostMapping("/insertUser")
    public ResponseJson insertUser(@RequestBody Login login){
        ResponseJson responseJson = new ResponseJson();
        try {
            responseJson = userService.insertUser(login);
        }catch (Exception e){
            logger.error("添加新用户：",e);
            responseJson.setSuccess(false);
            responseJson.setCode(500);
            responseJson.setMsg("服务器出错");
            return responseJson;
        }
        return responseJson;
    }

    @PostMapping("/updateUserUserNameByPhone")
    public ResponseJson updateUserUserNameByPhone(@RequestBody Login login){
        ResponseJson responseJson = new ResponseJson();
        try {
            responseJson = userService.updateUserUserNameByPhone(login);
        }catch (Exception e){
            logger.error("更新用户信息：",e);
            responseJson.setSuccess(false);
            responseJson.setCode(500);
            responseJson.setMsg("服务器出错");
            return responseJson;
        }
        return responseJson;
    }

    @PostMapping("/deleteUserByPhone")
    public ResponseJson deleteUserByPhone(@RequestBody Login login){
        ResponseJson responseJson = new ResponseJson();
        try {
            responseJson = userService.deleteUserByPhone(login);
        }catch (Exception e){
            logger.error("删除用户：",e);
            responseJson.setSuccess(false);
            responseJson.setCode(500);
            responseJson.setMsg("服务器出错");
            return responseJson;
        }
        return responseJson;
    }

    @GetMapping("/findUserByPhone")
    public ResponseJson findUserByPhone(@RequestParam String phone){
        ResponseJson responseJson = new ResponseJson();
        try {
            responseJson = userService.findUserByPhone(phone);
        }catch (Exception e){
            logger.error("查询用户：",e);
            responseJson.setSuccess(false);
            responseJson.setCode(500);
            responseJson.setMsg("服务器出错");
            return responseJson;
        }
        return responseJson;
    }

    public static void main(String[] args) {
        int sum = 0*0;
    }
}
