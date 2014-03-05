package com.fudan.rserp.module.ajax;

import java.util.List;

public class AjaxService {
	private AjaxDao dao;
	public String checkLoginName(String loginName){
		String re = "0";
		if(loginName!=null&&!"".equals(loginName)){
			List<?> ls = dao.checkLoginNameExist(loginName);
			if(ls!=null&&ls.size()>0){
				re = "1";
			}
		}
		return re;
	}

	public AjaxDao getDao() {
		return dao;
	}
	public void setDao(AjaxDao dao) {
		this.dao = dao;
	}
}
