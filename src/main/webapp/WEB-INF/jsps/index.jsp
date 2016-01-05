<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<%
	String path = request.getParameter("");
	String webroot = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<body>
	<form action="<%=webroot%>test/getuser" method="post">
		<h1>
			<input type='submit' value="f**k">
		</h1>
	</form>
</body>
</html>
