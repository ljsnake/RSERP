package com.fudan.rserp.module.htgl;

import com.fudan.rserp.util.PageSet;

public class HtglService {
	private HtglDao dao;
	
	public PageSet getFbdwList(PageSet ps, ListCondition lc){
		if(ps==null){
			ps = new PageSet();
		}
		//TODO
		return ps;
	}
	
	public HtglDao getDao() {
		return dao;
	}
	public void setDao(HtglDao dao) {
		this.dao = dao;
	}
	
}
