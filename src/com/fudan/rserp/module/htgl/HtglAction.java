package com.fudan.rserp.module.htgl;


import com.fudan.rserp.config.constant.Constants;
import com.fudan.rserp.module.base.BaseAction;
import com.fudan.rserp.util.Message;
import com.fudan.rserp.util.PageSet;
import com.fudan.rserp.config.model.TbErpContract;
import com.fudan.rserp.config.model.TbErpContractor;
import com.fudan.rserp.config.model.TbErpSubcontractor;

//合同管理
public class HtglAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	private HtglService service;
	private PageSet pageSet;
	private ListCondition condition;
	private TbErpSubcontractor subcontractor;
	private TbErpContractor contractor;
	private TbErpContract contract;
	//分包单位
	public String fbdwList(){
		pageSet = service.getFbdwList(pageSet, condition);
		page = this.ROOR_PATH + "jsp/htgl/fbdwlist.jsp";
		return Constants.SUCCESS;
	}
	public String fbdwAdd(){
		page = this.ROOR_PATH + "jsp/htgl/fbdwadd.jsp";
		return Constants.SUCCESS;
	}
	public String fbdwAddDo(){
		switch(service.addSubcontractor(subcontractor)){
		case 1:
			return error(new Message("失败,传入参数不合法.", reUrl));
		case 2:
			return error(new Message("失败,分包单位名已存在", reUrl));
		}
		page = "common/redirectCommit.jsp?reUrl="+reUrl;
		return Constants.REDIRECT;
	}
	public String fbdwShow(){
		subcontractor = service.getSubcontractor(subcontractor);
		page = this.ROOR_PATH + "jsp/htgl/fbdwshow.jsp";
		return Constants.SUCCESS;
	}
	public String fbdwUpdate(){
		subcontractor = service.getSubcontractor(subcontractor);
		page = this.ROOR_PATH + "jsp/htgl/fbdwupdate.jsp";
		return Constants.SUCCESS;
	}
	public String fbdwUpdateDo(){
		switch(service.updateSubcontractor(subcontractor)){
		case 1:
			return error(new Message("失败,传入参数不合法.", reUrl));
		case 2:
			return error(new Message("失败,分包单位名已存在", reUrl));
		}
		page = "common/redirectCommit.jsp?reUrl="+reUrl;
		return Constants.REDIRECT;
	}
	//总包单位
	public String zbdwList(){
		pageSet = service.getZbdwList(pageSet, condition);
		page = this.ROOR_PATH + "jsp/htgl/zbdwlist.jsp";
		return Constants.SUCCESS;
	}
	public String zbdwAdd(){
		page = this.ROOR_PATH + "jsp/htgl/zbdwadd.jsp";
		return Constants.SUCCESS;
	}
	public String zbdwAddDo(){
		switch(service.addContractor(contractor)){
		case 1:
			return error(new Message("失败,传入参数不合法.", reUrl));
		}
		page = "common/redirectCommit.jsp?reUrl="+reUrl;
		return Constants.REDIRECT;
	}
	public String zbdwShow(){
		contractor = service.getContractor(contractor);
		page = this.ROOR_PATH + "jsp/htgl/zbdwshow.jsp";
		return Constants.SUCCESS;
	}
	public String zbdwUpdate(){
		contractor = service.getContractor(contractor);
		page = this.ROOR_PATH + "jsp/htgl/zbdwupdate.jsp";
		return Constants.SUCCESS;
	}
	public String zbdwUpdateDo(){
		switch(service.updateContractor(contractor)){
		case 1:
			return error(new Message("失败,传入参数不合法.", reUrl));
		}
		page = "common/redirectCommit.jsp?reUrl="+reUrl;
		return Constants.REDIRECT;
	}
	//合同
	public String htList(){
		pageSet = service.getHtList(pageSet, condition);
		page = this.ROOR_PATH + "jsp/htgl/htlist.jsp";
		return Constants.SUCCESS;
	}
//	public String htAdd(){
//		
//		return Constants.SUCCESS;
//	}
//	public String htAddDo(){
//		
//		return Constants.SUCCESS;
//	}
//	public String htShow(){
//		
//		return Constants.SUCCESS;
//	}
//	public String htUpdate(){
//		
//		return Constants.SUCCESS;
//	}
//	public String htUpdateDo(){
//		
//		return Constants.SUCCESS;
//	}
	
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
	public TbErpSubcontractor getSubcontractor() {
		return subcontractor;
	}
	public void setSubcontractor(TbErpSubcontractor subcontractor) {
		this.subcontractor = subcontractor;
	}
	public TbErpContractor getContractor() {
		return contractor;
	}
	public void setContractor(TbErpContractor contractor) {
		this.contractor = contractor;
	}
	public TbErpContract getContract() {
		return contract;
	}
	public void setContract(TbErpContract contract) {
		this.contract = contract;
	}
}
