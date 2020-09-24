package com.leyou.mycat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Description
 * @Auther: hh
 * @Date: 2020/9/23 15:16
 * @Version:1.0
 */
@SpringBootApplication
@MapperScan("com.leyou.mycat.mapper")
public class LyMycatApplication {
    public static void main(String[] args) {
        SpringApplication.run(LyMycatApplication.class, args);
    }
}
