package com.cghsir.actions;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class DemoAction extends ActionSupport {

	private static final long serialVersionUID = -8366522307985527595L;

	public String execute() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(StrutsStatics.HTTP_REQUEST);
		request.setAttribute("user", "张华");
		return SUCCESS;
	}
	
	
}
