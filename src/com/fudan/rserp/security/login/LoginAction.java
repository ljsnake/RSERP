package com.fudan.rserp.security.login;

//import java.util.List;
//import java.util.Map;

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
		System.out.println("login ~ login");
		System.out.println("loginName:"+loginName+"#password:"+password);
		//com.hp.ipg.security.PasswordManager.encryptAndEncodeString(arg0);
		//PasswordManager.decodeAndDecryptString
		if(loginName==null||"".equals(loginName)
				||null==password||"".equals(password)){
			errorMessage = "登录名或密码不正确";
			page = "/login.jsp";
			return Constants.INPUT;
		}
		Map session = ActionContext.getContext().getSession();
		session.put("user.loginName", loginName);
		page = "/index.jsp";
		return Constants.SUCCESS;
	}
	
	public String logout() {
		System.out.println("login ~ logout");
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
