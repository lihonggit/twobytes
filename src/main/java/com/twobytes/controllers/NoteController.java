package main.java.com.twobytes.controllers;

import java.util.List;
import java.util.Map;

import main.java.basic.jdbc.JdbcUtils;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	@RequestMapping("/test/getuser")
	@ResponseBody
	public Object connectDB() {
		
//		String msg = "";
//		List<Map<String, Object>> values = JdbcUtils.findModeResult("select * from user", null);
//		for (Map<String, Object> map : values) {
//			for (String key : map.keySet()) {
//				msg += "key= " + key + " and value= " + map.get(key);
//			}
//		}
		System.out.println("success1");
		return null;
	}
	
	public static void main(String[] args) {
		String msg = "";
		List<Map<String, Object>> values = JdbcUtils.findModeResult("select * from user", null);
		for (Map<String, Object> map : values) {
			for (String key : map.keySet()) {
				msg += "key= " + key + " and value= " + map.get(key);
			}
		}
		System.out.println(msg);
	}
}
