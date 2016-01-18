package com.twobytes.bean;

import java.io.Serializable;

/**
 * 日记实体
 * 
 */
public class Note implements Serializable {
	private static final long serialVersionUID = -1261022547516289155L;
	// id
	private Integer id;
	// 记录人id
	private Integer userid;
	// 内容
	private String content;
	// 创建时间
	private String createtime;
	// 更新时间
	private String updatetime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}

}
