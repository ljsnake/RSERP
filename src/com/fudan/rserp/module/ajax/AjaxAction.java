package com.fudan.rserp.module.ajax;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.fudan.rserp.config.constant.Constants;
import com.fudan.rserp.module.base.BaseAction;

//import net.sf.json.JSONArray;
//异步ajax调用
public class AjaxAction extends BaseAction implements ServletRequestAware,ServletResponseAware{
	private static final long serialVersionUID = 1L;
	
	private AjaxService service;
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	
	//新增用户检查登录名是否存在
	public String checkLoginName(){
		String loginName = request.getParameter("loginName");
		return ajax_data(service.checkLoginName(loginName));
	}
	//新增分包单位检查名称是否存在
	public String checkSubcontractorName() throws UnsupportedEncodingException{
		String name = request.getParameter("name");
		if(name != null){
			name = new String(name.getBytes("ISO-8859-1"),"UTF-8");
		}
		return ajax_data(service.checkSubcontractorName(name));
	}
	
	
	private String ajax_data(String data){
		request.setAttribute("ajax_data",data);
		this.page = "ajax.jsp";
		return Constants.SUCCESS;
	}
	public AjaxService getService() {
		return service;
	}
	public void setService(AjaxService service) {
		this.service = service;
	}
	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	public HttpServletResponse getResponse() {
		return response;
	}
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
}
