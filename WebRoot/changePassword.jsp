<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link href="${pageContext.request.contextPath}/images/common.css"
	rel="stylesheet" type="text/css" /> 
</head>

<body class="right_body">
	<table class="right_top" cellspacing="0" cellpadding="0">
		<tbody>
			<tr>
				<td class="right_top_left"></td>
				<td class="right_top_center">��ǰλ�ã��޸�����</td>
				<td class="right_top_right"></td>
			</tr>
		</tbody>
	</table>
	<table class="right_middle" cellspacing="0" cellpadding="0">
		<tbody>
			<tr>
				<td height="27">
					<p></p>
				</td>
			</tr>
			<tr>
				<td style="vertical-align:top; padding:3px;">
					<form id="changePassword" method="post" target="mainFrame"
						action="${pageContext.request.contextPath}/common/changePassword.do"
						name="changePassword">
						<table width="400px" cellspacing="0" cellpadding="3"
							align="center">
							<tbody>
							
								<tr>
									<td width="100px"></td>
									<td width="60px"><input id="userTypeId"
										type="hidden" name="userTypeId" value="${userTypeId}"/></td>
									<td></td>
								</tr>
							
							
								<tr>
									<td width="100px">����ԭ����</td>
									<td width="60px"><input id="changePassword_oldPassword"
										type="password" name="oldPassword" value=""/></td>
									<td></td>
								</tr>
								<tr>
									<td>����������</td>
									<td><input id="changePassword_newPassword" type="password"
										name="newPassword"/></td>
									<td>${errorNewPassword}</td>
								</tr>
								<tr>
									<td>ȷ��������</td>
									<td><input id="changePassword_confirmPassword"
										type="password" name="confirmPassword"/></td>
									<td>${errorConfirmPassword}</td>
								</tr>
								<tr>
									<td align="center" colspan="3"><input
										id="changePassword_0" type="submit" value="�޸�"/></td>
								</tr>
								<tr>
									<td align="left" colspan="3"></td>
								</tr>
							</tbody>
						</table>
					</form>
				</td>
			</tr>
		</tbody>
	</table>
</body>
</html>
</html>
