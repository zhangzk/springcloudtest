/**
 * 
 */
package com.example.zhangzk.usercenter.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zhangzk.common.TestResult;
import com.example.zhangzk.usercenter.client.model.UserBean;
import com.example.zhangzk.usercenter.service.UserService;
import com.example.zhangzk.usercenter.web.ao.UserAO;

/**
 * @author zhangzhaokun
 *
 */

@RestController
@RequestMapping("/user")
public class UserController {
	private Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserAO userAO;
    
    @Autowired
    private UserService userService;


    @GetMapping("/get/{userId}")
    public TestResult<UserBean> getUserInfo(@PathVariable("userId") Long userId) {
    	log.info("request,userId=" + userId);
    	TestResult<UserBean> result = new TestResult<UserBean>();
        UserBean user = userAO.findByUserId(userId);
        result.setStatus(0);
        result.setMsg("SUCCESS");
        result.setData(user);
        return result;
    }
    
 
    @PostMapping("/add")
    public TestResult<Void> addUser(@RequestBody UserBean user) {
    	log.info("post request," + user);
    	return userService.addUser(user);
    	
    }
    
    @PostMapping("/update")
    public TestResult<Void> updateUser(@RequestBody UserBean user) {
    	log.info("post request," + user);
    	return userService.updateUser(user);
    }
}
