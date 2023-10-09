package com.example.zhangzk.usercenter.model;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.zhangzk.usercenter.model")
public class TestmodelApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestmodelApplication.class, args);
    }

}

