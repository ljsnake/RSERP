package com.fudan.rserp.util;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

public class PageQueryForSqlHibernateCallBack implements HibernateCallback {
	private String sql = "";
	private PageSet pageSet;

	public PageQueryForSqlHibernateCallBack(String sql, PageSet pageSet) {
		super();
		this.sql = sql;
		this.pageSet = pageSet;
	}

	public Object doInHibernate(Session session) throws HibernateException,
			SQLException {
		String temsql = sql.substring(sql.indexOf("from"));
		System.out.println(temsql);
		String sqlCount = "select count(1) " + temsql;
		pageSet.setTotalSize(Integer.parseInt(session.createSQLQuery(sqlCount).list().get(0).toString()));
		Query query = session.createSQLQuery(sql);
		query.setFirstResult((pageSet.getCurrPage()-1)*pageSet.getPageSize());
		query.setMaxResults(pageSet.getPageSize());
		List<?> list = query.list();
		String[] column = this.getMetaData(this.sql);
		List<Map<String,Object>> temp = new ArrayList<Map<String,Object>>();
		if(null != list && list.size()>0){
			for(int i=0;i<list.size();i++){
				Map<String,Object> data = new HashMap<String,Object>();
				Object[] obj = (Object[])list.get(i);
				for(int j = 0;j<column.length;j++){
					data.put(column[j],obj[j]);
				}
				temp.add(data);
			}
		}
		pageSet.setResultList(temp);
		return pageSet;
	}
	
	private String[] getMetaData(String sql) {  
       String[] source = sql.toLowerCase().split("from")[0].split("select")[1].split(",");  
       String[] dest = new String[source.length];  
       for (int i = 0; i < source.length; i++ ) {  
           String[] tmp = source[i].trim().split("\\.")[source[i].trim().split("\\.").length-1].split(" ");  
           dest[i] = tmp[tmp.length-1];  
       }   
       return dest;      
    }  

	public void setsql(String sql) {
		this.sql = sql;
	}

	public PageSet getPageSet() {
		return pageSet;
	}

	public void setPageSet(PageSet pageSet) {
		this.pageSet = pageSet;
	}

	public String getsql() {
		return sql;
	}

}
