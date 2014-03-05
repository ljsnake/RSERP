package com.fudan.rserp.module.base;

import com.opensymphony.xwork2.ActionContext;

public class BaseGetSessionValue {
	public static String getUserId(){
		ActionContext ctx = ActionContext.getContext();
		return getObjectStrng(ctx.getSession().get("user.id"));
	}
	public static String getUserLoginName(){
		ActionContext ctx = ActionContext.getContext();
		return getObjectStrng(ctx.getSession().get("user.loginName"));
	}
	public static String getUserName(){
		ActionContext ctx = ActionContext.getContext();
		return getObjectStrng(ctx.getSession().get("user.name"));
	}
	protected static String getObjectStrng(Object obj){
		return null == obj ? "":obj.toString();
	}
}
