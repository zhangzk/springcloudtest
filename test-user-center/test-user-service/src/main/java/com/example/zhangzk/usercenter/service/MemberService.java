package com.example.zhangzk.usercenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zhangzk.common.TestResult;
import com.example.zhangzk.usercenter.client.model.MemberBean;
import com.example.zhangzk.usercenter.client.service.IMemberService;
import com.example.zhangzk.usercenter.model.mapper.MemberMapper;

/**
 * @author zhangzhaokun
 *
 */
@Service
public class MemberService implements IMemberService {
	@Autowired
	private MemberMapper memberMapper;

	@Override
	public MemberBean findByUserId(Long userId) {
		return this.memberMapper.findByUserId(userId);
	}

	@Override
	public List<MemberBean> findByUserIds(List<Long> userIdList) {
		return this.memberMapper.findByUserIds(userIdList);
	}

	@Override
	public TestResult<Void> addMember(MemberBean member) {
		TestResult<Void> result = new TestResult<Void>();
		if (member == null || member.getUserId() == null) {
			// 参数不正确
			result.setStatus(1);
			result.setMsg("IllAugment.");
			return result;
		}

		MemberBean dbMember = this.memberMapper.findByUserId(member.getUserId());
		if (dbMember != null) {
			// 已经存在会员
			result.setStatus(1);
			result.setMsg("Member existed.");
			return result;
		}
		this.memberMapper.save(member);
		return result;
	}

	@Override
	public TestResult<Void> updateMember(MemberBean member) {
		TestResult<Void> result = new TestResult<Void>();
		if (member == null || member.getUserId() == null) {
			// 参数不正确
			result.setStatus(1);
			result.setMsg("IllAugment.");
			return result;
		}

		MemberBean dbMember = this.memberMapper.findByUserId(member.getUserId());
		if (dbMember == null) {
			// 已经存在会员
			result.setStatus(1);
			result.setMsg("Member not existed.");
			return result;
		}
		this.memberMapper.update(member);
		return result;

	}

}
