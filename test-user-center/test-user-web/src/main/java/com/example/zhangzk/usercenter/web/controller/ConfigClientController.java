/**
 * 
 */
package com.example.zhangzk.usercenter.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangzhaokun
 *
 */
@RestController
public class ConfigClientController {
	@Value("${test.kk.testkey}")
    private String testKKTestkey;

    @GetMapping(value = "/getConfig")
    public String getConfig() {
        return "info：" + this.testKKTestkey;
    }
}
