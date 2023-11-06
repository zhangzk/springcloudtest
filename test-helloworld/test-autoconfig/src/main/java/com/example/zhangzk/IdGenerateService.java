/**
 * 
 */
package com.example.zhangzk;

import java.util.Random;

public class IdGenerateService {
    private Long workId;
    public IdGenerateService(Long workId) {
        this.workId = workId;
    }
 
    public Long generate() {
        return new Random().nextInt(100) + this.workId;
    }
}
