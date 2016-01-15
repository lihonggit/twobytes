package com.twobytes.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import basic.jdbc.JdbcUtils;

import com.twobytes.bean.User;

@Controller
public class UserController {

	/**
	 * 登录
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping("/user/login")
	public String login(HttpServletRequest request) {
		// 得到的数据
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		// 参数
		List<Object> params = new ArrayList<Object>();
		params.add(email);
		params.add(password);

		User user = JdbcUtils.findSimpleRefResult("select * from user where email = ? and password = ?", params, User.class);
		if (user == null) {
			request.setAttribute("reqmsg", "你的账号并没有登录！");
			return "login";
		}
		return "main";
	}

	/**
	 * 注册
	 * 
	 * @return
	 */
	@RequestMapping("/user/register")
	public String register() {
		return "register";
	}

	/**
	 * 保存用户
	 * 
	 * @return
	 */
	@RequestMapping("/user/save")
	public String save(HttpServletRequest request) {

		return "main";
	}

}
