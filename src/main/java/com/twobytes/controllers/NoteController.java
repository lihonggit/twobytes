package com.twobytes.controllers;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import basic.utils.TimeUtils;

import com.twobytes.bean.Note;
import com.twobytes.service.NoteServices;

/**
 * 笔记本控制
 * 
 * @author 成都易科远见有限公司
 * 
 */
@Controller
public class NoteController {
	@Autowired
	private NoteServices noteServices;
	static final Logger logger = Logger.getLogger(NoteController.class);

	@RequestMapping("/note/save")
	public String save(HttpServletRequest request) {
		String id = request.getParameter("id");
		String content = request.getParameter("content");

		Note note = noteServices.getNoteById(id);
		note.setContent(content);
		note.setUpdateTime(TimeUtils.getCurrentTime());

		noteServices.saveNote(note);
		return "redirect:/user/main";
	}
}
