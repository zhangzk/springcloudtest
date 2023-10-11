/**
 * 
 */
package com.example.zhangzk.ordercenter.web.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.zhangzk.common.TestResult;
import com.example.zhangzk.ordercenter.web.fallback.UserServiceFallback;
import com.example.zhangzk.usercenter.client.dto.UserMemberDTO;
import com.example.zhangzk.usercenter.client.model.UserBean;

import feign.Request;

/**
 * @author zhangzhaokun
 *
 */
//name：调⽤的服务名称，和服务提供者yml⽂件中spring.application.name保持⼀致
//path: 定义当前FeignClient的统一前缀
@FeignClient(name = "test-user-web",path = "/user",fallback=UserServiceFallback.class)
public interface UserServiceProxy extends MemberServiceProxy  {

	@GetMapping("/get/{userId}")
	public TestResult<UserBean> getUserInfo(@PathVariable("userId") Long userId);
	
	/**
	 * 为接口级别使用专门的配置信息
	 * @param options
	 * @param userId
	 * @return
	 */
	@GetMapping("/get/{userId}")
	public TestResult<UserBean> getUserInfo(Request.Options options,@PathVariable("userId") Long userId);
	
	@PostMapping("/add")
	public TestResult<Void> addUser(@RequestBody UserBean user);
	
	@PostMapping("/update")
	public TestResult<Void> updateUser(@RequestBody UserBean user);
	
    @PostMapping("/addUserMember")
    public TestResult<Void> addUserMember(@RequestBody UserMemberDTO utDTO);

  }




