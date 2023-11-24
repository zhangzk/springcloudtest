/**
 * 
 */
package com.example.zhangzk;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ConfigurationProperties注解的作用，是将这个类的所有属性与配置文件中相关的配置进行绑定，以便于获取或修改配置
 * @ConfigurationProperties 功能是由容器提供的，被它注解的类必须是容器中的一个组件，否则该功能就无法使用。
 */
@ConfigurationProperties(prefix = IdProperties.PREFIX)
public class IdProperties {
    public static final String PREFIX = "test.autoconfig.zhangzk.";
    
    static {
    	System.out.println("IdProperties static code block load.");
    }
    private Long workId;
    public Long getWorkId() {
        return workId;
    }
    public void setWorkId(Long workId) {
        this.workId = workId;
    }
}