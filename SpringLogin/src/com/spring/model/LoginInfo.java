package com.spring.model;

import javax.validation.constraints.NotBlank;

public class LoginInfo {

	@NotBlank(message="should not be blank")
	private String username;
	private String mailid;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginInfo [username=" + username + ", mailid=" + mailid + ", password=" + password + "]";
	}

}
