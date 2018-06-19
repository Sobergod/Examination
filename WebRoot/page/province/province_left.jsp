<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
	<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

		<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
		<html>

		<head>
			<base href="<%=basePath%>">

			<title>My JSP 'left.jsp' starting page</title>

			<meta http-equiv="pragma" content="no-cache">
			<meta http-equiv="cache-control" content="no-cache">
			<meta http-equiv="expires" content="0">
			<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
			<meta http-equiv="description" content="This is my page">
			<link href="${pageContext.request.contextPath}/libs/layui/css/layui.css" rel="stylesheet" type="text/css" />
		</head>

		<body class="left_body">
			<div class="layui-side layui-bg-black">
				<div class="layui-side-scroll">
					<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
					<ul class="layui-nav layui-nav-tree" lay-filter="test">
						<li class="layui-nav-item layui-nav-itemed">
							<a href="${pageContext.request.contextPath}/province/provinceShowBaseInfo.do" target="content">省厅基本信息管理</a>
						</li>
						<li class="layui-nav-item">
							<a href="${pageContext.request.contextPath}/page/province/addcityinfo.jsp" target="content">添加市局账号</a>
						</li>
						<li class="layui-nav-item">
							<a href="/TeacherPlatform/province/showCityAccount.action" target="content">查看市局账号</a>
						</li>
						<li class="layui-nav-item">
							<a href="/TeacherPlatform/province/showWaiting.action" target="content">等待我审核的教师</a>
						</li>
						<li class="layui-nav-item">
							<a href="/TeacherPlatform/province/showPassed.action" target="content">我审核过的教师</a>
						</li>
						<li class="layui-nav-item">
							<a href="/TeacherPlatform/report.jsp" target="content">报表统计</a>
						</li>
						<li class="layui-nav-item">
							<a href="/TeacherPlatform/security/listReviceMessages.action" target="content">消息列表</a>
						</li>
					</ul>
				</div>
			</div>
		</body>


		</html>