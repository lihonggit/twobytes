package com.twobytes.bean;

import java.io.Serializable;

/**
 * 日记实体
 * 
 */
public class Note implements Serializable {
	private static final long serialVersionUID = -1261022547516289155L;
	// id
	private String id;
	// 记录人id
	private String userId;
	// 内容
	private String content;
	// 创建时间
	private String createTime;
	// 更新时间
	private String updateTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
