package com.fudan.rserp.module.yhgl;

import com.fudan.rserp.config.constant.Constants;
import com.fudan.rserp.module.base.BaseAction;
import com.fudan.rserp.util.Message;
import com.fudan.rserp.util.PageSet;
import com.fudan.rserp.config.model.TbErpUser;

//用户管理
public class YhglAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	private YhglService service;
	private PageSet pageSet;
	private ListCondition condition;
	private TbErpUser user;
	private String passwordold;
	//用户列表
	public String list(){
		pageSet = service.getYhList(pageSet, condition);
		page = this.ROOR_PATH + "jsp/yhgl/list.jsp";
		return Constants.SUCCESS;
	}
	//点击添加用户链接
	public String add(){
		page = this.ROOR_PATH + "jsp/yhgl/add.jsp";
		return Constants.SUCCESS;
	}
	//执行添加用户
	public String addDo(){
		switch(service.addUser(user)){
		case 1:
			return error(new Message("失败,传入参数不合法.", reUrl));
		case 2:
			return error(new Message("失败,登录名已存在", reUrl));
		case 10:
			return error(new Message("失败,操作异常", reUrl));
		}
		page = "common/redirectCommit.jsp?reUrl="+reUrl;
		return Constants.REDIRECT;
	}
	//查看用户
	public String show(){
		user = service.getUser(user);
		page = this.ROOR_PATH + "jsp/yhgl/show.jsp";
		return Constants.SUCCESS;
	}
	//点击修改用户链接
	public String update(){
		user = service.getUser(user);
		page = this.ROOR_PATH + "jsp/yhgl/update.jsp";
		return Constants.SUCCESS;
	}
	//执行修改用户
	public String updateDo(){
		service.updateUser(user);
		page = "common/redirectCommit.jsp?reUrl="+reUrl;
		return Constants.REDIRECT;
	}
	//点击修改密码链接
	public String updatePassword(){
		page = this.ROOR_PATH + "jsp/yhgl/passwordUpdate.jsp";
		return Constants.SUCCESS;
	}
	//执行修改密码
	public String updatePasswordDo(){
		switch(service.updatePassword(user,passwordold)){
		case 1://传入值不合法或旧密码为空.
			return error(new Message("失败,传入值不合法或旧密码为空", null));
		case 2://原密码错误.
			return error(new Message("失败,原密码错误", null));
		case 10://异常.
			return error(new Message("失败,操作异常", null));
		}
		page = "common/redirectCommit.jsp";
		return Constants.REDIRECT;
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
	public String getPasswordold() {
		return passwordold;
	}
	public void setPasswordold(String passwordold) {
		this.passwordold = passwordold;
	}
}
