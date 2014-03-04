package com.fudan.rserp.module.base;

import java.io.Serializable;

public class BaseAction implements Serializable{
	private static final long serialVersionUID = 1L;
	protected String ROOR_PATH = "/WEB-INF/";
	protected String page;
	protected String reUrl;//操作完成后返回url
	
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getReUrl() {
		return reUrl;
	}
	public void setReUrl(String reUrl) {
		this.reUrl = reUrl;
	}
}
