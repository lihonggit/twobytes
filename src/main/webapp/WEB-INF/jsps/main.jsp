<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.twobytes.bean.Note"%>
<%@page import="java.util.List"%>
<%@ page import="com.twobytes.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="common.jsp"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
  <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
<![endif]-->
<link href="<%=webroot%>/resources/common/css/common.css" rel="stylesheet" type="text/css" />
<link href="<%=webroot%>/resources/system/css/main.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="container">
		<form action="<%=webroot%>/note/save" method="post">
			<div class="notes">
				<%
					List<Note> notes = (List<Note>) request.getAttribute("notes");
					for (Note note : notes) {
						out.print(note.getContent() + "<span class='time'>"+note.getCreateTime()+"</span>" + "<br>");
					}
					Note yestoday = (Note) request.getAttribute("yestoday");
				%>
			</div>
			<div class="note">
				<input type="hidden" name="id" value="<%=yestoday.getId()%>">
				<textarea class="today-note" name="content"><%=yestoday.getContent() + yestoday.getUpdateTime()%></textarea>
			</div>
			<div class="buttons">
				<input type="submit" value="就这样">
			</div>
		</form>
	</div>
</body>
</html>
