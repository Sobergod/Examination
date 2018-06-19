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
				<div class="layui-card-header">市教育局基本信息查询</div>
				<div class="layui-card-body">
					<form class="layui-form" action="${pageContext.request.contextPath}/city/updatecitybaseinfo.do" method="post">
						<input type="hidden" name="department.id" value="14" id="updateCityBaseInfo_department_id" />
						<input type="hidden" name="department.level" value="4" id="updateCityBaseInfo_department_level" />
						<input type="hidden" name="login.id" value="19" id="updateCityBaseInfo_login_id" />
						<input type="hidden" name="department.code" value="60012" id="updateCityBaseInfo_department_code" />
						<input type="hidden" name="department.name" value="&#28155;&#21152;&#30340;" id="updateCityBaseInfo_department_name" />
						<div class="layui-form-item">
							<label class="layui-form-label">单位名称</label>
							<div class="layui-input-inline">
								<select lay-verify="required">
									<option value="1">师大附中</option>
									<option value="2">兰州一中</option>
									<option value="3">兰州二中</option>
									<option value="4">兰州二十七中</option>
									<option value="5">兰州三十三中</option>
									<option value="6">三开</option>
									<option value="7">一开</option>
									<option value="8">二开</option>
									<option value="9">三开</option>
									<option value="10">一开</option>
									<option value="11">二开</option>
									<option value="12">三开</option>
								</select>
							</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">管理员真实姓名</label>
							<div class="layui-input-inline">
								<input type="text" name="loginRealName" value="${realName}" required lay-verify="required" autocomplete="off" class="layui-input">
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
			<script type="text/javascript" src="${pageContext.request.contextPath}/libs/layui/layui.js"></script>
			<script type="text/javascript">
				layui.use('form', function () {
					var form = layui.form;
				});
			</script>
		</body>

		</html>