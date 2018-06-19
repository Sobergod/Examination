<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

	<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
	<html>

	<head>
		<title>学校界面的左面</title>

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
						<a href="${pageContext.request.contextPath}/school/addTeacherAccount1.do" target="content">学校基本信息</a>
					</li>
					<li class="layui-nav-item">
						<a href="/tms4/teacher/showBaseInfo2.do" target="content">查看录取结果</a>
					</li>
					<li class="layui-nav-item">
						<a href="${pageContext.request.contextPath}/school/addSchoolAccount.do" target="content">消息列表</a>
					</li>
				</ul>
			</div>
		</div>
		<script src="${pageContext.request.contextPath}/libs/layui/layui.js"></script>
	</body>

	</html>