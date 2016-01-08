<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String webroot = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html lang="zh-CN">
<head>
<link href="<%=webroot%>resources/common/css/common.css" rel="stylesheet" type="text/css" />
<style>
</style>
</head>
<body>
	<form action="<%=webroot%>test/getuser" method="post">
		<h1 style="border:1px solid green">
			<input type='submit' value="f**k">
		</h1>
	</form>
	<p style="font-family: Arial, sans-serif;">你是一个小逗比</p>
	<p style="">我是一个小逗比</p>
</body>
</html>
