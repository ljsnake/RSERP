package com.fudan.rserp.module.yhgl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.fudan.rserp.config.model.TbErpUser;
import com.fudan.rserp.module.base.BaseHibernateDao;
import com.fudan.rserp.util.PageSet;

public class YhglDao extends BaseHibernateDao{
	public PageSet getYhList(PageSet ps,ListCondition lc){
		
		Criteria criteria = this.getSession().createCriteria(TbErpUser.class);
		if(lc!=null){
			if(!isObjectEmpty(lc.getLoginName())){
				criteria.add(Restrictions.like("loginName", lc.getLoginName()+"%"));
			}
			if(!isObjectEmpty(lc.getName())){
				criteria.add(Restrictions.like("name", lc.getName()+"%"));
			}
		}
		ps = getCriteriaPageSet(criteria, ps);
		return ps;
	}
}
