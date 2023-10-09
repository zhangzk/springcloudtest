/**
 * 
 */
package com.example.zhangzk.ordercenter.web.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.zhangzk.common.TestResult;
import com.example.zhangzk.usercenter.client.model.UserBean;

/**
 * @author zhangzhaokun
 *
 */
//name：调⽤的服务名称，和服务提供者yml⽂件中spring.application.name保持⼀致
//path: 定义当前FeignClient的统一前缀
@FeignClient(name = "test-user-web",path = "/user")
public interface UserRemoteService {

	@GetMapping("/get/{userId}")
	public TestResult<UserBean> getUserInfo(@PathVariable("userId") Long userId);
  }




