/**
 * 
 */
package com.example.zhangzk.usercenter.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.zhangzk.common.TestResult;
import com.example.zhangzk.usercenter.client.model.UserBean;

/**
 * @author zhangzhaokun
 *
 */
@RequestMapping("/user")
public interface UserAPIService {

	@GetMapping("/get/{userId}")
	public TestResult<UserBean> getUserInfo(@PathVariable("userId") Long userId);
		
	@PostMapping("/add")
	public TestResult<Void> addUser(@RequestBody UserBean user);
	
	@PostMapping("/update")
	public TestResult<Void> updateUser(@RequestBody UserBean user);

  }




