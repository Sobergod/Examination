<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title></title>
		<link href="${pageContext.request.contextPath}/images/common.css"
			rel="stylesheet" type="text/css" />
	</head>

	<body>
		<table class="right_top" cellpadding="0" cellspacing="0">
			<tr>
				<td class="right_top_left"></td>
				<td class="right_top_center">
					当前位置：甘肃省教育厅基本信息管理
				</td>
				<td class="right_top_center" style="width: 70px;">
					&nbsp;
				</td>
				<td class="right_top_right"></td>
			</tr>
		</table>

		<table class="right_middle" cellspacing="0" cellpadding="0">
			<tr>
				<td style="height: 27px;">
					<p></p>
				</td>
			</tr>
			<tr>
				<td style="vertical-align: top; padding: 3px;">
					<table width="500" cellpadding="0" cellspacing="1"
						class="tableList">
						<tr>
							<th colspan="2">
								<table width="98%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td height="27" align="left">
											&nbsp;&nbsp;甘肃省教育厅基本信息管理
										</td>
										<td align="right">
											<a
												href="${pageContext.request.contextPath}/province/findProvinceBaseInfo.do">[修改]</a>
										</td>
									</tr>
								</table>
							</th>
						</tr>
						<tr class="trListOdd">
							<td width="200" align="center" valign="top" bgcolor="#F6FBFB">
								<p>
									&nbsp;
								</p>
							</td>
							<td valign="top">
								<p>
									&nbsp;
								</p>
								<table cellspacing="0" cellpadding="0"
									style="text-align: left; width: 98%; border: none;">
									<tr>
										<td width="50" height="30">
											&nbsp;
										</td>
										<td width="150">
											单位编码
										</td>
										<td>
											${department.code}
										</td>
									</tr>
									<tr>
										<td width="50" height="30">
											&nbsp;
										</td>
										<td width="150">
											单位名称
										</td>
										<td>
											${department.name}
										</td>
									</tr>
									<tr>
										<td height="30">
											&nbsp;
										</td>
										<td>
											单位地址
										</td>
										<td>
											${department.address}
										</td>
									</tr>
									<tr>
										<td height="30">
											&nbsp;
										</td>
										<td>
											单位电话
										</td>
										<td>
											${department.phone}
										</td>
									</tr>

									<tr>
										<td height="30">
											&nbsp;
										</td>
										<td>
											管理员真实姓名
										</td>
										<td>
											${realName}
										</td>
									</tr>
									<tr>
										<td height="30">
											&nbsp;
										</td>
										<td>
											&nbsp;
										</td>
										<td>
											&nbsp;
										</td>
									</tr>
									<tr>
										<td height="30">
											&nbsp;
										</td>
										<td>
											&nbsp;
										</td>
										<td>
											&nbsp;
										</td>
									</tr>
									<tr>
										<td height="30">
											&nbsp;
										</td>
										<td>
											&nbsp;
										</td>
										<td>
											&nbsp;
										</td>
									</tr>
									<tr>
										<td height="30">
											&nbsp;
										</td>
										<td>
											&nbsp;
										</td>
										<td>
											&nbsp;
										</td>
									</tr>
								</table>
								<p>
									&nbsp;
								</p>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>
