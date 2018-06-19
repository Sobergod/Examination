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

		<body>
			<div class="layui-card">
				<div class="layui-card-header">市教育局基本信息查看</div>
				<div class="layui-card-body">
					<a class="layui-btn" href="${pageContext.request.contextPath}/city/findcityBaseInfo.do">修改</a>
					<br>
					<div style="margin-top: 50px;">
						<fieldset class="layui-elem-field">
							<legend>单位编码</legend>
							<div class="layui-field-box">
								${department.code}
							</div>
						</fieldset>
						<fieldset class="layui-elem-field">
							<legend>单位名称</legend>
							<div class="layui-field-box">
								${department.name}
							</div>
						</fieldset>
						<fieldset class="layui-elem-field">
							<legend>单位地址</legend>
							<div class="layui-field-box">
								${department.address}
							</div>
						</fieldset>
						<fieldset class="layui-elem-field">
							<legend>单位电话</legend>
							<div class="layui-field-box">
								${department.phone}
							</div>
						</fieldset>
						<fieldset class="layui-elem-field">
							<legend>管理员真实姓名</legend>
							<div class="layui-field-box">
								${realName}
							</div>
						</fieldset>
					</div>
				</div>
			</div>
		</body>

		</html>