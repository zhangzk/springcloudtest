/**
 * 
 */
package com.example.zhangzk.usercenter.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zhangzk.usercenter.client.model.UserBean;
import com.example.zhangzk.usercenter.web.ao.UserAO;

/**
 * @author zhangzhaokun
 *
 */

@RestController
@RequestMapping("/order")
public class UserController {

    @Autowired
    private UserAO userAO;


    @GetMapping("/get")
    public UserBean getUserByName(Long orderId) {
        return userAO.getOrderByOrderId(orderId);
    }
//	@Autowired
//	private UserService userService;
//    
//    @GetMapping("/get")
//    public OrderBean getUserByName(Long orderId) {
//        System.out.println(userService.getOrderByOrderId(1L)); ;
//        return new OrderBean();
//    }

}
