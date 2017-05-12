<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	文件上传

	<s:form action="upload_doUpload" method="POST" enctype="multipart/form-data">
		<s:file name="upload" label="File" />
		<s:textfield name="caption" label="Caption" />
		<s:submit cssClass="btn btn-primary" />
	</s:form>
</body>
</html>