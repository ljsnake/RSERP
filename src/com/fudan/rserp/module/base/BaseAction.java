package com.fudan.rserp.module.base;

import java.io.Serializable;

import com.fudan.rserp.config.constant.Constants;
import com.fudan.rserp.util.Message;

public class BaseAction implements Serializable{
	private static final long serialVersionUID = 1L;
	protected String ROOR_PATH = "/WEB-INF/";
	protected String page;
	protected String reUrl;//操作完成后返回url
	protected Message msg;//错误信息及返回路径.
	
	protected String error(Message msg){
		this.page = "message.jsp";
		return Constants.SUCCESS;
	}
	
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
	public Message getMsg() {
		return msg;
	}
	public void setMsg(Message msg) {
		this.msg = msg;
	}
}
