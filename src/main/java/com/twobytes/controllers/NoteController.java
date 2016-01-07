package com.twobytes.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 笔记本控制
 * 
 * @author 成都易科远见有限公司
 * 
 */
@Controller
public class NoteController {
	/**
	 * 连接数据库
	 */
	@RequestMapping(value = "/test/getuser")
	@ResponseBody
	public String connectDB(HttpServletRequest request) {
//		String msg = "";
//		List<Map<String, Object>> values = JdbcUtils.findModeResult("select * from system_area limit 10,20", null);
//		for (Map<String, Object> map : values) {
//			for (String key : map.keySet()) {
//				msg += "*" + key + " " + map.get(key) + "<br>";
//			}
//			msg += "<br>";
//		}
//		request.setAttribute("msg", msg);
		return "<h1>fuck u baby!</h1>";
	}

}
