package com.fudan.rserp.security.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.fudan.rserp.security.login.LoginAction;

public class SessionCheckInterceptor extends MethodFilterInterceptor {

	private static final long serialVersionUID = -3132335171569618959L;

	@Override
	protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
		ActionContext atx = actionInvocation.getInvocationContext();
		if(actionInvocation.getAction() instanceof LoginAction){
			return actionInvocation.invoke();
		}
		Object loginName = atx.getSession().get("loginName");
		if (loginName != null && !loginName.equals("")) {
			return actionInvocation.invoke();
		}else {
			return "toLogin";
		}
	}
	
}
