<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

	<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
	<html>

	<head>
		<title>添加学校账号</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">

		<link href="${pageContext.request.contextPath}/libs/layui/css/layui.css" rel="stylesheet" type="text/css" />
	</head>

	<body>
		<div class="layui-card">
			<div class="layui-card-header">等待审核的学生</div>
			<div class="layui-card-body">
				<form action="${pageContext.request.contextPath}/teacher/shenhe.do" method="POST" class="layui-form">
					<div class="layui-form-item">
						<label class="layui-form-label">录取人数</label>
						<div class="layui-input-inline">
							<input type="text" name="teacher.identityCard" required lay-verify="required" placeholder="请输入人数" autocomplete="off" class="layui-input">
						</div>
					</div>
					<div class="layui-form-item">
						<label class="layui-form-label">录取分数（最低分）</label>
						<div class="layui-input-inline">
							<input type="text" name="teacher.realName" required lay-verify="required" placeholder="请输入分数" autocomplete="off" class="layui-input">
						</div>
					</div>
					<div class="layui-form-item">
						<div class="layui-input-inline">
							<input style="margin-left:35%; width: 200px;" type="submit" value="提交" class="layui-btn">
						</div>
					</div>
				</form>
			</div>
		</div>
	</body>

	</html>