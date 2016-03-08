<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><sitemesh:write property='title' /> - twobytes
</title>
<!-- 引入head -->
<sitemesh:write property='head' />
</head>
<body>
	<!-- 顶部 -->
	<header style="height:200px;background-color:#000;color:#fff;">header</header>
	<!-- 引入body -->
	<sitemesh:write property='body' />
	<!-- 底部 -->
	<footer style="height:200px;background-color:#000;color:#fff;">footer</footer>
</body>
</html>