package com.twobytes.bean;

import java.io.Serializable;

/**
 * 用户实体
 * 
 * @author 成都易科远见有限公司
 * 
 */
public class User implements Serializable {
	private static final long serialVersionUID = -2088477628142208570L;
	/* 账号信息 */
	// id
	private String id;
	// 邮箱
	private String email;
	// 昵称
	private String nickname;
	// 密码
	private String password;

	/* 用户详情 */
	// 年龄
	private String age;
	// 性别
	private String sex;
	// 所在地
	private String city;
	// 你是谁
	private String role;
	// 星座
	private String constellation;

	/* 记录信息 */
	// 加入时间
	private String jointime;
	// 最后登录
	private String lastlogin;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getConstellation() {
		return constellation;
	}

	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}

	public String getJointime() {
		return jointime;
	}

	public void setJointime(String jointime) {
		this.jointime = jointime;
	}

	public String getLastlogin() {
		return lastlogin;
	}

	public void setLastlogin(String lastlogin) {
		this.lastlogin = lastlogin;
	}
}
