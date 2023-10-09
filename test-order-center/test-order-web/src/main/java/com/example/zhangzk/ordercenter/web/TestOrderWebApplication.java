package com.example.zhangzk.ordercenter.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
/**
 * 启动类只能自动扫描启动类自身所属的包以及子包，第三方的包不会扫描，需要配置包路径才能扫描
 * @author zhangzhaokun
 *
 */
@SpringBootApplication
@ComponentScan(value = {"com.example.zhangzk.ordercenter"})
@EnableDiscoveryClient
@EnableFeignClients("com.example.zhangzk.ordercenter.web.proxy") //实现远程调用，指定远程包
public class TestOrderWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestOrderWebApplication.class, args);
    }

}
