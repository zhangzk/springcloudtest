/**
 * 
 */
package com.example.zhangzk.usercenter.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.zhangzk.usercenter.client.common.UserLimit;
import com.example.zhangzk.usercenter.client.common.UserSort;
import com.example.zhangzk.usercenter.client.model.MemberBean;

/**
 * @author zhangzhaokun
 *
 */
@Mapper
public interface MemberMapper {
	MemberBean findByUserId(Long userId);
	
	List<MemberBean> findByMemberType(Integer memberType,UserSort userSort,UserLimit userLimit);

	List<MemberBean> findByUserIds(List<Long> userIdList);

	void save(MemberBean member);

	void update(MemberBean member);

}
