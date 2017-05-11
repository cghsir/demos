package com.cghsir.actions;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;

import com.cghsir.pageModels.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class DemoAction extends ActionSupport  implements ModelDriven<User>{
	
	private User user = new User();

	private static final long serialVersionUID = -8366522307985527595L;

	public String execute() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(StrutsStatics.HTTP_REQUEST);
		request.setAttribute("user", "张华");
		return SUCCESS;
	}
	
	public String getUser(){
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(StrutsStatics.HTTP_REQUEST);
		String sex = request.getParameter("sex");
		String username = request.getParameter("username");
		user.setSex("男");
		user.setUsername("张华");
		user.setSex(username);
		user.setUsername(sex);
		//将页面两个属性对消
		return "modelDriven";
	}

	public User getModel() {
		return user;
	}
	
}
