package com.cghsir.pageModels;

public class User {

	private String username;
	private String sex;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public User(String username, String sex) {
		super();
		this.username = username;
		this.sex = sex;
	}

	public User() {
		super();
	}
}
