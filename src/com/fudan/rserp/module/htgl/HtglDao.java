package com.fudan.rserp.module.htgl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.fudan.rserp.config.model.TbErpSubcontractor;
import com.fudan.rserp.config.model.TbErpContractor;
import com.fudan.rserp.config.model.TbErpContract;
import com.fudan.rserp.module.base.BaseHibernateDao;
import com.fudan.rserp.util.PageSet;

public class HtglDao extends BaseHibernateDao{
	
	public PageSet getFbdwList(PageSet ps,ListCondition lc){
		Criteria criteria = this.getSession().createCriteria(TbErpSubcontractor.class);
		if(lc!=null){
			if(!isObjectEmpty(lc.getName())){
				criteria.add(Restrictions.like("name", lc.getName()+"%"));
			}
		}
		ps = getCriteriaPageSet(criteria, ps);
		return ps;
	}
	
	public PageSet getZbdwList(PageSet ps,ListCondition lc){
		Criteria criteria = this.getSession().createCriteria(TbErpContractor.class);
		if(lc!=null){
			if(!isObjectEmpty(lc.getName())){
				criteria.add(Restrictions.like("name", lc.getName()+"%"));
			}
			if(!isObjectEmpty(lc.getContact())){
				criteria.add(Restrictions.like("contact", lc.getContact()+"%"));
			}
		}
		ps = getCriteriaPageSet(criteria, ps);
		return ps;
	}
	
	public PageSet getHtList(PageSet ps,ListCondition lc){
		Criteria criteria = this.getSession().createCriteria(TbErpContract.class);
		if(lc!=null){
			if(!isObjectEmpty(lc.getName())){
				criteria.add(Restrictions.like("contractName", lc.getName()+"%"));
			}
		}
		ps = getCriteriaPageSet(criteria, ps);
		return ps;
	}
}
