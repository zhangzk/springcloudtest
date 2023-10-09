/**
 * 
 */
package com.example.zhangzk.usercenter.model.dao;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.example.zhangzk.usercenter.client.model.UserBean;

/**
 * @author zhangzhaokun
 *
 */
@Component
public class UserDao {
	private Logger log = LoggerFactory.getLogger(UserDao.class);

	private final SqlSession sqlSession;

	public UserDao(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public UserBean findByUserId(long userId) {
		log.info("userId=" + userId);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userId", userId);
		return this.sqlSession.selectOne("findByUserId", params);
	}

}
