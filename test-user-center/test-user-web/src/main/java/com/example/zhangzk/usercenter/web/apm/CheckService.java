/**
 * 
 */
package com.example.zhangzk.usercenter.web.apm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.serviceregistry.EurekaAutoServiceRegistration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 本地服务优雅降级
 * @author zhangzhaokun
 *
 */
@RestController
@RequestMapping("/registry-service")
public class CheckService {
    @Autowired
    private EurekaAutoServiceRegistration eurekaAutoServiceRegistration;

    @GetMapping("/online")
    public String online() {
        this.eurekaAutoServiceRegistration.start();
        return "execute online method, online success.";
    }

    @GetMapping("/offline")
    public String offline() {
        this.eurekaAutoServiceRegistration.stop();
        return "execute offline method, offline success.";
    }

}

