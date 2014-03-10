package com.fudan.rserp.module.ajax;

public class AjaxService {
	private AjaxDao dao;
	public String checkLoginName(String loginName){
		if(dao.checkPropertyInEntityHasExist("TbErpUser","loginName",loginName)){
			return "1";
		}
		return "0";
	}
	public String checkSubcontractorName(String name){
		if(dao.checkPropertyInEntityHasExist("TbErpSubcontractor","name",name)){
			return "1";
		}
		return "0";
	}
	

	public AjaxDao getDao() {
		return dao;
	}
	public void setDao(AjaxDao dao) {
		this.dao = dao;
	}
}
