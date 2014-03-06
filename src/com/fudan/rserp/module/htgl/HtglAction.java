package com.fudan.rserp.module.htgl;


import com.fudan.rserp.config.constant.Constants;
import com.fudan.rserp.module.base.BaseAction;
import com.fudan.rserp.util.PageSet;

//合同管理
public class HtglAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	private HtglService service;
	private PageSet pageSet;
	private ListCondition condition;
	private Integer id;
	//分包单位
	public String fbdwList(){
		pageSet = service.getFbdwList(pageSet, condition);
		page = this.ROOR_PATH + "jsp/htgl/fbdwlist.jsp";
		return Constants.SUCCESS;
	}
	public String fbdwAdd(){
		
		return Constants.SUCCESS;
	}
	public String fbdwAddDo(){
		
		return Constants.SUCCESS;
	}
	public String fbdwShow(){
		
		return Constants.SUCCESS;
	}
	public String fbdwUpdate(){
		
		return Constants.SUCCESS;
	}
	public String fbdwUpdateDo(){
		
		return Constants.SUCCESS;
	}
	//总包单位
	public String zbdwList(){
		pageSet = service.getZbdwList(pageSet, condition);
		page = this.ROOR_PATH + "jsp/htgl/zbdwlist.jsp";
		return Constants.SUCCESS;
	}
	public String zbdwAdd(){
		
		return Constants.SUCCESS;
	}
	public String zbdwAddDo(){
		
		return Constants.SUCCESS;
	}
	public String zbdwShow(){
		
		return Constants.SUCCESS;
	}
	public String zbdwUpdate(){
		
		return Constants.SUCCESS;
	}
	public String zbdwUpdateDo(){
		
		return Constants.SUCCESS;
	}
	//合同
	public String htList(){
		pageSet = service.getHtList(pageSet, condition);
		page = this.ROOR_PATH + "jsp/htgl/htlist.jsp";
		return Constants.SUCCESS;
	}
	public String htAdd(){
		
		return Constants.SUCCESS;
	}
	public String htAddDo(){
		
		return Constants.SUCCESS;
	}
	public String htShow(){
		
		return Constants.SUCCESS;
	}
	public String htUpdate(){
		
		return Constants.SUCCESS;
	}
	public String htUpdateDo(){
		
		return Constants.SUCCESS;
	}
	
	public HtglService getService() {
		return service;
	}
	public void setService(HtglService service) {
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
