<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.twobytes.bean.Note"%>
<%@page import="java.util.List"%>
<%@ page import="com.twobytes.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="common.jsp"%>
<html>
<head>
<link href="<%=webroot%>/resources/common/css/common.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="container">
		<%
			List<Note> notes = (List<Note>)request.getAttribute("notes");
			for(Note note : notes) {
				out.println(note.getContent() + " - " + note.getCreatetime() + "<br>");
			}
		%>
	</div>
</body>
</html>
