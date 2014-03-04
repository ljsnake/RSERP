package com.fudan.rserp.module.tggl;


import com.fudan.rserp.config.constant.Constants;
import com.fudan.rserp.module.base.BaseAction;

//通告管理
public class TgglAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	private TgglService service;
	
	public String show(){
		
		return Constants.SUCCESS;
	}
	public String update(){
		
		return Constants.SUCCESS;
	}
	public String updateDo(){
		
		return Constants.SUCCESS;
	}
	
	public TgglService getService() {
		return service;
	}
	public void setService(TgglService service) {
		this.service = service;
	}
}
