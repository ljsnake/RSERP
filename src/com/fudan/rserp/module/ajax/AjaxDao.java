package com.fudan.rserp.module.ajax;

import java.util.List;

import com.fudan.rserp.module.base.BaseHibernateDao;

public class AjaxDao extends BaseHibernateDao{
	
	public List<?> checkLoginNameExist(String loginName){
		String hql = "select loginName from TbErpUser where loginName = '"+loginName+"'";
		return queryByHQL(hql);
	}
	
}
