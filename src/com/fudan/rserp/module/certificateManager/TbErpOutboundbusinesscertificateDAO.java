package com.fudan.rserp.module.certificateManager;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.fudan.rserp.config.model.TbErpOutboundbusinesscertificate;
import com.fudan.rserp.module.base.BaseHibernateDao;
import com.fudan.rserp.util.PageSet;

/**
 * This is the DAO class for TbErpOutboundbusinesscertificate.  Any customizations
 * specific to this class belong here.
 */
public class TbErpOutboundbusinesscertificateDAO extends BaseHibernateDao {
	
	public PageSet getCertificateList(PageSet ps,ListCondition lc){
		
		Criteria criteria = this.getSession().createCriteria(TbErpOutboundbusinesscertificate.class);
		ps = getCriteriaPageSet(criteria, ps);
		return ps;
	}
}