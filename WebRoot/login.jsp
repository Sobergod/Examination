<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html> 

<head>   
<title>后台登陆</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/libs/layui/css/layui.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/libs/css/newlogin.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$(function() {
			$.post("${pageContext.request.contextPath}/common/prepareLogin.do", function(data) {
				console.log(data);
				$.each(data, function(i, item) {
					$("#login_userType_id").append(
						'<option value="' + item.id + '">' //用户类型的id
						+ item.name //用户类型的名字
						+ '</option>');
				});
			}, "json");
		});
	})


	// 判断浏览时是否禁用了cookie
	function CookieEnable() {
		var result = false;
		if (navigator.cookiesEnabled) {
			return true;
		}
		document.cookie = "testcookie=yes;";
		var cookieSet = document.cookie;
		if (cookieSet.indexOf("testcookie=yes") > -1) {
			result = true;
		}
		document.cookie = "";
		return result;
	}

	if (!CookieEnable()) {
		alert("对不起，您的浏览器的Cookie功能被禁用，请开启");
	}
</script>

</head>
<body>
	<div class="container">
		<div class="wrap">
			<div class="bg-wrap"></div>
			<div class="login-wrap">
				<div class="title">
					<h2>中考信息管理平台</h2>
					<p>中考信息管理</p>
				</div>
				<form class="layui-form"
					action="${pageContext.request.contextPath}/common/login.do"
					method="post">
					<p style="color: red; text-align: center">${errorTip}</p>
					<div class="layui-form-item">
						<label class="layui-form-label">登录账号：</label>
						<div class="layui-input-block">
							<input type="text" name="loginName" lay-verify="required"
								autocomplete="off" placeholder="请输入账号" class="layui-input">
						</div>
					</div>
					<div class="layui-form-item">
						<label class="layui-form-label">登录密码：</label>
						<div class="layui-input-block">
							<input type="password" id="loginPassword" name="loginPassword"
								lay-verify="title" autocomplete="off" placeholder="请输入密码"
								class="layui-input">
						</div>
					</div>
					<div class="layui-form-item">
						<label class="layui-form-label">选择身份：</label>
						<div class="layui-input-block">
							<select name="userTypeId" lay-verify="required"
								id="login_userType_id">
								<option value=""></option>
							</select>
						</div>
					</div>
					<div class="layui-form-item">
						<div class="layui-input-block"
							style="width: 290px; margin-top: 40px; margin-left: 20%;">
							<input type="submit" class="layui-btn layui-btn-fluid" value="登录"
								lay-submit="" lay-filter="demo1" />
						</div>
					</div>
				</form>
			</div>
		</div>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/libs/layui/layui.js"></script>
		<script type="text/javascript">
			layui.use('form', function() {
				var form = layui.form;
			});
		</script>
</body>

</html>