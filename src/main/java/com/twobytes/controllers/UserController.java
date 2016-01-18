package com.twobytes.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.twobytes.bean.User;
import com.twobytes.service.NoteServices;
import com.twobytes.service.UserServices;

@Controller
public class UserController {
	@Autowired
	private UserServices userServices;
	@Autowired
	private NoteServices noteServices;

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
		User user = userServices.getUser(email, password);
		if (user == null) {
			request.setAttribute("reqmsg", "你的账号并没有登录！");
			return "login";
		}
		return "redirect:/user/main/"+user.getId();
	}
	
	@RequestMapping(value = "/user/main/{id}")
	public String userMain(HttpServletRequest request,@PathVariable String id) {
		request.setAttribute("notes", noteServices.getNodes(id));
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
