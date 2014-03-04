package com.fudan.rserp.config.model;

public class TbErpUser implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String loginName;
	private String password;
	private String role;
	
	public TbErpUser() {
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}