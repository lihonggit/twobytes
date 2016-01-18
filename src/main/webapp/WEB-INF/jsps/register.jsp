<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="common.jsp" %>
<%
	String reqmsg = (String)request.getAttribute("reqmsg");
%>
<html>
<head>
<link href="<%=webroot%>/resources/common/css/common.css" rel="stylesheet" type="text/css" />

</head>
<body>
	<div id="hair">我和不一样的她:我们的故事已经走到了终点，可我还傻傻的站在原点。终于知道为什么那么多人爱唱伤感的歌，不是无聊、不是颓废，而是一种心碎...我还是希望你能再来找我，我会一直等着你。 药不能停2008:没意思了感觉 janebosss:自从7月被封，无数次申请解封不成就果断卸载了 真真真诸葛子牙:同意 我没故事_:自从进了你这帖子感觉全身都是力量，仿佛倒背手都能做俯卧撑了</div>
	<div class="container">
		<div id="login-div">
			<form action="<%=webroot%>/user/register" method="post">
				<div id="tip"><%= reqmsg == null ? "&nbsp;" : reqmsg%></div><br>
				账号：<input id="email" type="text" name="email" placeholder="email"><br><br>
				密码：<input id="password" type="password" name="password" placeholder="password"><br><br>
				密码：<label><input type="radio" class="sex" name="sex" value="男">汉纸</label>
					<label><input type="radio" class="sex" name="sex" value="女">妹纸</label><br><br>
				&emsp;&emsp;&emsp;<input type='submit' value="^o^OK"><br><br>
			</form>
		</div>
	</div>
</body>
</html>
