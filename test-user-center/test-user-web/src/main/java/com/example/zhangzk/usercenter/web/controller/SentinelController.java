/**
 * 
 */
package com.example.zhangzk.usercenter.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author zhangzhaokun
 *
 */
@RestController
@RequestMapping("/sentinel")
public class SentinelController {
	    private Logger log = LoggerFactory.getLogger(SentinelController.class);  

	    /**
	     * blockHandler 对应处理 BlockException,限流的时候触发。
	     * fallback 函数可以针对所有类型的异常（除了 exceptionsToIgnore 里面排除掉的异常类型）进行处理。
	     * 
	     * 本处案例需要按照资源来限流和降级，不能按照URL来控制，否则不能触发blockHandler和fallback
	     * @param userId
	     * @return
	     */

	    @GetMapping("/exception/{userId}")
	    @SentinelResource(value = "byCustomer",blockHandlerClass = SentinelFallback.class,blockHandler = "blockHandlerSentinel",fallbackClass = SentinelFallback.class,fallback = "fallbackSentinel")
	    public String exceptionTest(@PathVariable("userId") Long userId) {
	    	log.info("exceptionTest,userId=" + userId);
	    	
	    	if( userId >1000) {
	    		throw new NullPointerException();
	    	}
	    	return "SUCCESS"+userId;
	    	
	    }
	    
	    public class SentinelFallback {
	    	public static String blockHandlerSentinel(Long userId,BlockException exception){
	            return "blockHandlerSentinel：系统异常，已经限流！" + exception.getMessage();
	        }
	    	
	    	public static String fallbackSentinel(Long userId,Throwable t){
	            return "fallbackSentinel：系统异常，已经熔断！" + t.getMessage() ;
	        }
	    }
}
