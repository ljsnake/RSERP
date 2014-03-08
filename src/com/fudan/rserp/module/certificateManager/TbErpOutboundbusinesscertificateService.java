package com.fudan.rserp.module.certificateManager;

import com.fudan.rserp.util.PageSet;

public class TbErpOutboundbusinesscertificateService {
	
	private TbErpOutboundbusinesscertificateDAO dao;
	
	public PageSet getCertificateList(PageSet ps,ListCondition lc){
		if(ps==null){
			ps = new PageSet();
		}
		ps = dao.getCertificateList(ps, lc);
		return ps;
	}

	public TbErpOutboundbusinesscertificateDAO getDao() {
		return dao;
	}

	public void setDao(TbErpOutboundbusinesscertificateDAO dao) {
		this.dao = dao;
	}
	
	

}
