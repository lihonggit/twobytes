package com.twobytes.controllers;

import java.util.List;
import java.util.Map;

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;

import basic.jdbc.JdbcUtils;

/**
 * 笔记本控制
 * 
 * @author 成都易科远见有限公司
 * 
 */
//@Controller
public class NoteController {
	/**
	 * 连接数据库
	 */
//	@RequestMapping(value = "/test/getuser")
	public Object connectDB() {
		String msg = "";
		List<Map<String, Object>> values = JdbcUtils.findModeResult("select * from user", null);
		for (Map<String, Object> map : values) {
			for (String key : map.keySet()) {
				msg += "*" + key + " " + map.get(key) + "<br>";
			}
			msg += "<br>";
		}
		return "";
	}
	
	public static void main(String[] args) {
		String msg = "";
		List<Map<String, Object>> values = JdbcUtils.findModeResult("select * from user", null);
		for (Map<String, Object> map : values) {
			for (String key : map.keySet()) {
				msg += "*" + key + " " + map.get(key) + "<br>";
			}
			msg += "<br>";
		}
		System.out.println(msg);
	}
}
