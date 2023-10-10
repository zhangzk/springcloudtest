/**
 * 
 */
package com.example.zhangzk.usercenter.client.service;

import java.util.List;

import com.example.zhangzk.common.TestResult;
import com.example.zhangzk.usercenter.client.model.MemberBean;

/**
 * @author zhangzhaokun
 *
 */
public interface IMemberService {

	public MemberBean findByUserId(Long userId);

	public List<MemberBean> findByUserIds(List<Long> userIdList);

	public TestResult<Void> addMember(MemberBean member);

	public TestResult<Void> updateMember(MemberBean member);

}
