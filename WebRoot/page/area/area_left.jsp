<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
	<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

		<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
		<html xmlns="http://www.w3.org/1999/xhtml">

		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
			<title></title>
			<link href="${pageContext.request.contextPath}/libs/layui/css/layui.css" rel="stylesheet" type="text/css" />
		</head>

		<body class="left_body">
			<div class="layui-side layui-bg-black">
				<div class="layui-side-scroll">
					<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
					<ul class="layui-nav layui-nav-tree" lay-filter="test">
						<li class="layui-nav-item layui-nav-itemed">
							<a href="/tms4/teacher/showTeacherBaseInfo.do" target="content">市教育局公告信息</a>
						</li>
						<li class="layui-nav-item">
							<a href="/tms4/teacher/showBaseInfo.do" target="content">区县局公告信息</a>
						</li>
						<li class="layui-nav-item">
							<a href="/tms4/teacher/showBaseInfo1.do" target="content">等待审核的学生</a>
						</li>
						<li class="layui-nav-item">
							<a href="/tms4/teacher/showBaseInfo2.do" target="content">审核通过的学生</a>
						</li>
						<li class="layui-nav-item">
							<a href="/tms4/teacher/addTeacherAccount.do" target="content">报表统计</a>
					</ul>
				</div>
			</div>
			<script src="${pageContext.request.contextPath}/libs/layui/layui.js"></script>
		</body>

		</html>