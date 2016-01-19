package com.twobytes.service;

import java.util.List;

import com.twobytes.bean.Note;

/**
 * '笔记本'服务接口
 * 
 * @author 成都易科远见有限公司
 * 
 */
public interface NoteServices {
	/**
	 * 从数据库获得最后一个note,如果该note不为当天的，则建立一个然后返回
	 * 
	 * @param userId
	 * @return
	 */
	public Note getLastNote(String userId);

	/**
	 * 获得所有日志，不包含今天的
	 * 
	 * @param userId
	 * @return
	 */
	public List<Note> getNodes(String userId);

	/**
	 * 保存note对象
	 * 
	 * @param note
	 * @return
	 */
	public boolean saveNote(Note note);
	
	/**
	 * 通过id得到日记对象
	 * @param id
	 * @return
	 */
	public Note getNoteById(String id);

}
