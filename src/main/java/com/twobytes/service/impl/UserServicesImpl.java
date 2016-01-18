package com.twobytes.service.impl;

import org.springframework.stereotype.Service;

import basic.jdbc.JdbcUtils;

import com.twobytes.bean.User;
import com.twobytes.service.UserServices;

@Service
public class UserServicesImpl implements UserServices {

	@Override
	public User getUser(String email, String pwd) {
		String sql = "select * from user where email = ? and password = ?";
		return JdbcUtils.findSimpleRefResult(sql, User.class, email, pwd);
	}

}
