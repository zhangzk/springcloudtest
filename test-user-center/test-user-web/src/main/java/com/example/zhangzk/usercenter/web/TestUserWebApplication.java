package com.example.zhangzk.usercenter.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
/**
 * 启动类只能自动扫描启动类自身所属的包以及子包，第三方的包不会扫描，需要配置包路径才能扫描
 * @author zhangzhaokun
 *
 */
@SpringBootApplication
@ComponentScan(value = {"com.example.zhangzk.ordercenter"})
@EnableDiscoveryClient
public class TestUserWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestUserWebApplication.class, args);
    }

}
