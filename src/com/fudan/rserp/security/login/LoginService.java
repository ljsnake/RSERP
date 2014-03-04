package com.fudan.rserp.security.login;

//import java.util.List;


public class LoginService {
	private LoginDao loginDao;
	
//	public List<TbTUser> getUsers(){
//		return loginDao.getUsers();
//	}
	
	public LoginDao getLoginDao() {
		return loginDao;
	}
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}
	
}
