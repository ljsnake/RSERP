package com.fudan.rserp.module.htgl;

import com.fudan.rserp.util.PageSet;

public class HtglService {
	private HtglDao dao;
	
	public PageSet getFbdwList(PageSet ps, ListCondition lc){
		if(ps==null){
			ps = new PageSet();
		}
		ps = dao.getFbdwList(ps, lc);
		return ps;
	}
	
	
	public PageSet getZbdwList(PageSet ps, ListCondition lc){
		if(ps==null){
			ps = new PageSet();
		}
		ps = dao.getZbdwList(ps, lc);
		return ps;
	}
	
	
	public PageSet getHtList(PageSet ps, ListCondition lc){
		if(ps==null){
			ps = new PageSet();
		}
		ps = dao.getHtList(ps, lc);
		return ps;
	}
	
	public HtglDao getDao() {
		return dao;
	}
	public void setDao(HtglDao dao) {
		this.dao = dao;
	}
	
}
