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
		<form action="<%=webroot%>test/getuser" method="post">
			<h1>
				<input type='submit' value="按钮">
				<div class="hr-style"></div>
			</h1>
		</form>
	</div>
</body>
</html>
