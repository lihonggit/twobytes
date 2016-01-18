package com.twobytes.service;

import com.twobytes.bean.User;

public interface UserServices {

	/**
	 * 得到用户
	 * 
	 * @param email
	 * @param pwd
	 * @return
	 */
	public User getUser(String email, String pwd);
}
