package com.fudan.rserp.module.yhgl;

import com.fudan.rserp.config.constant.Constants;
import com.fudan.rserp.module.base.BaseAction;
import com.fudan.rserp.util.PageSet;
import com.fudan.rserp.config.model.TbErpUser;

//用户管理
public class YhglAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	private YhglService service;
	private PageSet pageSet;
	private ListCondition condition;
	private TbErpUser user;
	
	public String list(){
		pageSet = service.getYhList(pageSet, condition);
		page = this.ROOR_PATH + "jsp/yhgl/list.jsp";
		return Constants.SUCCESS;
	}
	public String add(){
		page = this.ROOR_PATH + "jsp/yhgl/add.jsp";
		return Constants.SUCCESS;
	}
	public String addDo(){
		service.addUser(user);
		page = "common/redirectCommit.jsp?reUrl="+reUrl;
		return Constants.SUCCESS;
	}
	public String show(){
		
		return Constants.SUCCESS;
	}
	public String update(){
		
		return Constants.SUCCESS;
	}
	public String updateDo(){
		
		return Constants.SUCCESS;
	}
	public String updatePassword(){
		
		return Constants.SUCCESS;
	}
	public String updatePasswordDo(){
		
		return Constants.SUCCESS;
	}
	
	public YhglService getService() {
		return service;
	}
	public void setService(YhglService service) {
		this.service = service;
	}
	public PageSet getPageSet() {
		return pageSet;
	}
	public void setPageSet(PageSet pageSet) {
		this.pageSet = pageSet;
	}
	public ListCondition getCondition() {
		return condition;
	}
	public void setCondition(ListCondition condition) {
		this.condition = condition;
	}
	public TbErpUser getUser() {
		return user;
	}
	public void setUser(TbErpUser user) {
		this.user = user;
	}
}
