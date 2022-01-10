package com.scm.interceptor;


import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

@Controller
public class RequestValidator extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		try {
			invocation.invoke();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	

}
