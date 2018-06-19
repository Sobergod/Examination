<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

	<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
	<html>

	<head>
		<title>My JSP 'school_baseInfo.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link href="${pageContext.request.contextPath}/libs/layui/css/layui.css" rel="stylesheet" type="text/css" />
	</head>

	<body>
		<table class="right_top" cellpadding="0" cellspacing="0">
			<tr>
				<td class="right_top_left"></td>
				<td class="right_top_center">当前位置：学校基本信息管理</td>
				<td class="right_top_center" style="width:70px;">&nbsp;</td>
				<td class="right_top_right"></td>
			</tr>
		</table>

		<table class="right_middle" cellspacing="0" cellpadding="0">
			<tr>
				<td style="height:27px;">
					<p></p>
				</td>
			</tr>
			<tr>
				<td style="vertical-align:top; padding:3px;">
					<table width="500" cellpadding="0" cellspacing="1" class="tableList">
						<tr>
							<th colspan="2">
								<table width="98%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td height="27" align="left">&nbsp;&nbsp;学校基本信息管理</td>
										<td align="right">
											<a href="${pageContext.request.contextPath}/school/updateTeacherBaseInfo.do">[查看]</a>
										</td>
									</tr>
								</table>
							</th>
						</tr>
						<tr class="trListOdd">
							<td width="200" align="center" valign="top" bgcolor="#F6FBFB">
								<p>&nbsp;</p>
							</td>
							<td valign="top">
								<p>&nbsp;</p>
								<table cellspacing="0" cellpadding="0" style="text-align:left; width:98%; border:none;">
									<tr>
										<td width="50" height="30">&nbsp;</td>
										<td width="150">学校名称</td>
										<td>
											<table id="showTable" border="1">
												<tr>
													<select>
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
												</tr>
											</table>
										</td>
									</tr>

									<tr>
										<td height="30">&nbsp;</td>
										<td>学生姓名</td>
										<td>
											${realName}
										</td>
									</tr>
									<tr>
										<td height="30">&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
									</tr>
									<tr>
										<td height="30">&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
									</tr>
									<tr>
										<td height="30">&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
									</tr>
									<tr>
										<td height="30">&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
									</tr>
								</table>
								<p>&nbsp;</p>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>

	</html>