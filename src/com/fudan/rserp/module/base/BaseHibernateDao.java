package com.fudan.rserp.module.base;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
//import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.fudan.rserp.util.PageSet;


public class BaseHibernateDao extends HibernateDaoSupport {
	/**
	 * 获取一个分页对象 根据criteria查询器	 * @param criteria
	 * @param pageSet
	 */
	public PageSet getCriteriaPageSet(Criteria criteria, PageSet pageSet) {
		criteria.setProjection(Projections.rowCount());
		Integer count = Integer.valueOf(criteria.uniqueResult().toString());
		pageSet.setTotalSize(count);
		criteria.setProjection(null);
		if (pageSet.getTotalSize() > 0) {
			criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// 合并到主对象
			List<?> resultlist = criteria.setFirstResult((pageSet.getCurrPage() - 1) * pageSet.getPageSize()).setMaxResults(pageSet.getPageSize()).list();
			pageSet.setResultList(resultlist);
		} else {
			pageSet.setResultList(null);
		}
		return pageSet;
	}

	/**
	 * 根据一个Class和一个id 查出这个对象
	 */
	@SuppressWarnings({ "rawtypes" })
	public Object getObjectById(Class entityClass, Serializable id) {
		return this.getHibernateTemplate().get(entityClass, id);
	}

	/**
	 * 保存 或者 更新对象
	 * @param entity
	 */
	public void saveOrUpdateObject(Object entity) {
		this.getHibernateTemplate().saveOrUpdate(entity);
	}
	public void updateObject(Object entity){
		this.getHibernateTemplate().update(entity);
	}
	/**
	 * 根据HQL查询符合条件的数据
	 * @param hql hql语句
	 * @return 返回结果
	 */
	public List<?> queryByHQL(String hql){
		return this.getHibernateTemplate().find(hql);
	}
	
	protected Object queryFirstResultBySql(String sql){
		return this.getSession().createSQLQuery(sql).setFirstResult(0).setMaxResults(1).uniqueResult();
	}
	// 待扩展	
	/**
	 * 校验如登录名等是否存在
	 * @param entityName
	 * @param propertyName
	 * @param propertyValue
	 * @return
	 */
	public boolean checkPropertyInEntityHasExist(String entityName, String propertyName, String propertyValue){
		String hql = "select "+propertyName+" from "+entityName+" where loginName = '"+propertyValue+"'";
		List<?> ls = queryByHQL(hql);
		if(ls!=null&&ls.size()>0){
			return true;
		}
		return false;
	}
	
	protected boolean isObjectEmpty(Object o){
		return o==null || "".equals(o);
	}
}
