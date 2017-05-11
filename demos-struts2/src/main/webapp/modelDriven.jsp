<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- uri 在struts-core/META-INF/struts-tags.tld/uri -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	${user}
	<s:form action="demoAction_getUser.action">
		<input type="text" value="${username }" name="username" />
		<input type="text" value="${sex }" name="sex" />
		<s:submit></s:submit>
	</s:form>
</body>
</html>