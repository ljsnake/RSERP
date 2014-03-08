package com.fudan.rserp.security.login;

import java.util.Map;

import com.fudan.rserp.config.constant.Constants;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction {
	private LoginService loginService;
	private String page;
	private String loginName;
	private String password;
	private String errorMessage;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String login() {
		//TODO 根据登录名密码及加密校验是否成功登录，并session赋值.
		if(loginName==null||"".equals(loginName)
				||null==password||"".equals(password)){
			errorMessage = "登录名或密码不正确";
			page = "/login.jsp";
			return Constants.INPUT;
		}
		Map session = ActionContext.getContext().getSession();
		session.put("user.loginName", loginName);
<<<<<<< HEAD
=======
		session.put("user.name", loginName);
		session.put("user.id", loginName);
>>>>>>> 2a72f4cf459112f201b957cf2f35a35e0b05f8a9
		page = "/index.jsp";
		return Constants.SUCCESS;
	}
	
	public String logout() {
		ActionContext.getContext().getSession().clear();
		page = "/login.jsp";
		return Constants.REDIRECT;
	}
	
	public LoginService getLoginService() {
		return loginService;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
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
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
