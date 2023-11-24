package com.example.zhangzk.reflect;

import java.util.List;

import org.springframework.lang.Nullable;

public interface TestService {
	public int getMethod1();
	public List<String> getMethod2(@Nullable String  name,@Nullable Integer uid);

}
