<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String webroot = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";

	String msg = (String) request.getAttribute("msg");
%>
<html>
<head>
<link href="<%=webroot %>resources/system/css/list.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=webroot %>resources/commons/js/jquery-1.8.3.min.js"></script>
</head>
<body>
	<%=msg%>
</body>
</html>
