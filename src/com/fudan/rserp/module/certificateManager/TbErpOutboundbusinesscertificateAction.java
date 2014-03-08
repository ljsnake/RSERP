package com.fudan.rserp.module.certificateManager;

import com.fudan.rserp.config.constant.Constants;
import com.fudan.rserp.module.base.BaseAction;
import com.fudan.rserp.util.PageSet;

public class TbErpOutboundbusinesscertificateAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private TbErpOutboundbusinesscertificateService service;
	private PageSet pageSet;
	private ListCondition condition;
	
	public String list(){
		pageSet = service.getCertificateList(pageSet, condition);
		page = this.ROOR_PATH + "jsp/certificateManager/certificateList.jsp";
		return Constants.SUCCESS;
	}

	public TbErpOutboundbusinesscertificateService getService() {
		return service;
	}

	public void setService(TbErpOutboundbusinesscertificateService service) {
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
