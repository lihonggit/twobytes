<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String webroot = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
<link href="<%=webroot%>resources/common/css/common.css" rel="stylesheet" type="text/css" />

</head>
<body>
	<div class="container">
		<h3>success</h3>
	</div>
</body>
</html>
