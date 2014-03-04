package com.fudan.rserp.module.base;

import java.io.Serializable;

public class BaseAction implements Serializable{
	private static final long serialVersionUID = 1L;
	protected String ROOR_PATH = "/WEB-INF/";
	protected String page;
	
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
}
