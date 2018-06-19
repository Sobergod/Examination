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
			<script type="text/javascript">
				function checkAddress() {
					var obj = document.getElementById("idAddress");
					var span = document.getElementById("errorAddress");
					if (obj.value == "" || obj.value.trim().length == 0) {
						span.innerHTML = "单位地址不能为空";
						return false;
					} else {
						span.innerHTML = "";
						return true;
					}
				}
				function checkPhone() {
					var obj = document.getElementById("idPhone");
					var span = document.getElementById("errorPhone");
					if (obj.value == "" || obj.value.trim().length == 0) {
						span.innerHTML = "单位电话不能为空";
						return false;
					} else {
						span.innerHTML = "";
						return true;
					}
				}
				function checkRealName() {
					var obj = document.getElementById("idRealName");
					var span = document.getElementById("errorRealName");
					if (obj.value == "" || obj.value.trim().length == 0) {
						span.innerHTML = "管理员姓名不能为空";
						return false;
					} else {
						span.innerHTML = "";
						return true;
					}
				}
				function checkAll() {
					var res = checkAddress() & checkPhone() & checkRealName();
					return (res == 1);
				}
			</script>
		</head>

		<body>
			<div class="layui-card">
				<div class="layui-card-header">市教育局基本信息更新</div>
				<div class="layui-card-body">
					<form class="layui-form" action="${pageContext.request.contextPath}/city/updatecitybaseinfo.do" method="post">
						<input type="hidden" name="department.id" value="14" id="updateCityBaseInfo_department_id" />
						<input type="hidden" name="department.level" value="4" id="updateCityBaseInfo_department_level" />
						<input type="hidden" name="login.id" value="19" id="updateCityBaseInfo_login_id" />
						<input type="hidden" name="department.code" value="60012" id="updateCityBaseInfo_department_code" />
						<input type="hidden" name="department.name" value="&#28155;&#21152;&#30340;" id="updateCityBaseInfo_department_name" />
						<div class="layui-form-item">
							<label class="layui-form-label">单位编码</label>
							<div class="layui-input-inline">
								<input disabled type="text" value="${department.code}" required lay-verify="required" autocomplete="off" class="layui-input">
							</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">单位名称</label>
							<div class="layui-input-inline">
								<input disabled type="text" value="${department.name}" required lay-verify="required" autocomplete="off" class="layui-input">
							</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">单位地址</label>
							<div class="layui-input-inline">
								<input type="text" name="departmentAddress" value="${department.address}" required lay-verify="required" autocomplete="off"
								 class="layui-input">
							</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">单位电话</label>
							<div class="layui-input-inline">
								<input type="text" name="departmentPhone" value="${department.phone}" required lay-verify="required" autocomplete="off" class="layui-input">
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
								<input style="margin-left:35%; width: 200px;" type="submit" value="更新" class="layui-btn">
							</div>
						</div>
					</form>
				</div>
			</div>
		</body>

		</html>