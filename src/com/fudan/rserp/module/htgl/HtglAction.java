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
	
	public String fbdwList(){
//		pageSet = service.getFbdwList(pageSet, condition);
		if(pageSet==null){
			pageSet = new PageSet();
		}
		
		page = this.ROOR_PATH + "jsp/htgl/fbdwlist.jsp";
		return Constants.SUCCESS;
	}
	public String fbdwAdd(){
		
		return Constants.SUCCESS;
	}
	public String fbdwAddDo(){
		
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
}
