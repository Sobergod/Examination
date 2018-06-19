<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link href="${pageContext.request.contextPath}/libs/layui/css/layui.css"
	rel="stylesheet" type="text/css" />
</head>

<body>
	<div class="layui-card">
		<div class="layui-card-header">录取基本信息管理</div>
		<div class="layui-card-body">
			<a class="layui-btn"
				href="${pageContext.request.contextPath}/city/findcityBaseInfo.do">录取信息修改</a>
			<table class="layui-table">
				<colgroup>
					<col width="150">
						<col width="150">
							<col width="200">
								<col>
				</colgroup>
				<thead>
					<tr>
						<th>报表统计</th>
						<th>消息列表</th>
						<th>录取情况</th>
						<th>生源地信息</th>
						<th>管理员真实姓名</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td><a style="color: skyblue"
							href="${pageContext.request.contextPath }/page/teacher/teacher_addbaseinfo.jsp">报表统计</a>
						</td>
						<td>${department.name}</td>
						<td>${department.address}</td>
						<td>${department.phone}</td>
						<td>${realName}</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>