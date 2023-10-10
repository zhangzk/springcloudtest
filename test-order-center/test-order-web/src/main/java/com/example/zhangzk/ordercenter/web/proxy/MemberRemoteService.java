/**
 * 
 */
package com.example.zhangzk.ordercenter.web.proxy;

import org.springframework.cloud.openfeign.FeignClient;

import com.example.zhangzk.usercenter.api.IMemberAPIService;

/**
 * @author zhangzhaokun
 *
 */
//name：调⽤的服务名称，和服务提供者yml⽂件中spring.application.name保持⼀致
//path: 定义当前FeignClient的统一前缀
//@FeignClient(name = "test-user-web",path = "/member")
public interface MemberRemoteService extends IMemberAPIService {

}
