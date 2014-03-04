package com.fudan.rserp.module.yhgl;

import com.fudan.rserp.config.model.TbErpUser;
import com.fudan.rserp.util.PageSet;

public class YhglService {
	private YhglDao dao;
	public PageSet getYhList(PageSet ps,ListCondition lc){
		if(ps==null){
			ps = new PageSet();
		}
		ps = dao.getYhList(ps, lc);
		return ps;
	}
	public void addUser(TbErpUser user){
		
	}
	
	public YhglDao getDao() {
		return dao;
	}
	public void setDao(YhglDao dao) {
		this.dao = dao;
	}
	
}
