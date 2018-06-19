<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
	<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

		<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
		<html xmlns="http://www.w3.org/1999/xhtml">

		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
			<title></title>
			<link href="${pageContext.request.contextPath}/libs/layui/css/layui.css" rel="stylesheet" type="text/css" />
		</head>

		<body>
			<div class="layui-card">
				<div class="layui-card-header">基本信息管理</div>
				<div class="layui-card-body">
					<a class="layui-btn" href="${pageContext.request.contextPath }/page/teacher/teacher_baseInfo2.jsp">院校信息</a>
					<a class="layui-btn" href="${pageContext.request.contextPath }/page/teacher/teacher_baseInfo1.jsp">学生信息</a>
					<a class="layui-btn" href="${pageContext.request.contextPath }/page/teacher/teacher_baseInfo3.jsp">志愿信息</a>
					<a class="layui-btn" href="${pageContext.request.contextPath }/page/teacher/teacher_baseInfo4.jsp">审核通过的学生</a>
				</div>
			</div>
		</body>

		</html>