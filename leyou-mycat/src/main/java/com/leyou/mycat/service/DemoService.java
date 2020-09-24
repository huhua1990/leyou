package com.leyou.mycat.service;

import com.leyou.mycat.entity.UserDemo;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Description
 * @Auther: hh
 * @Date: 2020/9/23 18:28
 * @Version:1.0
 */
public interface DemoService {
    void save(UserDemo userDemo);
    List<UserDemo> findList();
}
