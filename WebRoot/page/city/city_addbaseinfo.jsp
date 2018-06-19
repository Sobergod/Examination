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
<link href="/TeacherPlatform/images/common.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript">
	function checkCode() {
		var obj = document.getElementById("idCode");
		var span = document.getElementById("errorCode");
		if (obj.value == "" || obj.value.trim().length == 0) {
			span.innerHTML = "县局或学校编码不能为空";
			return false;
		} else {
			span.innerHTML = "";
			return true;
		}
	}
	function checkName() {
		var obj = document.getElementById("idName");
		var span = document.getElementById("errorName");
		if (obj.value == "" || obj.value.trim().length == 0) {
			span.innerHTML = "县局或学校名称不能为空";
			return false;
		} else {
			span.innerHTML = "";
			return true;
		}
	}

	function checkLoginName() {
		var obj = document.getElementById("idLoginName");
		var span = document.getElementById("errorLoginName");
		if (obj.value == "" || obj.value.trim().length == 0) {
			span.innerHTML = "登陆账号不能为空";
			return false;
		} else {
			span.innerHTML = "";
			return true;
		}
	}
	function checkPassword() {
		var obj = document.getElementById("idPassword");
		var span = document.getElementById("errorPassword");
		if (obj.value == "" || obj.value.trim().length == 0) {
			span.innerHTML = "登陆密码不能为空";
			return false;
		} else {
			span.innerHTML = "";
			return true;
		}
	}
	function checkAll() {
		var res = checkCode() & checkName() & checkLoginName()
				& checkPassword();
		return (res == 1);
	}
</script>
</head>

<body>
	<table class="right_top" cellpadding="0" cellspacing="0">
		<tr>
			<td class="right_top_left"></td>
			<td class="right_top_center">当前位置：添加县区局账号</td>
			<td class="right_top_center" style="width:70px;">&nbsp;</td>
			<td class="right_top_right"></td>
		</tr>
	</table>

	<table class="right_middle" cellspacing="0" cellpadding="0">
		<tr>
			<td style="height:27px;"><p></p></td>
		</tr>
		<tr>
			<td style="vertical-align:top; padding:3px;"><table width="500"
					cellpadding="0" cellspacing="1" class="tableList">
					<tr>
						<th colspan="2"><table width="98%" border="0" cellspacing="0"
								cellpadding="0">
								<tr>
									<td height="27" align="left">&nbsp;&nbsp;添加县区局账号</td>
									<td align="right">&nbsp;</td>
								</tr>
							</table></th>
					</tr>
					<tr class="trListOdd">
						<td width="200" align="center" valign="top" bgcolor="#F6FBFB"><p>&nbsp;</p>
						</td>
						<td valign="top"><p>&nbsp;</p>
							<form id="addAreaAccount" name="addAreaAccount"
								onsubmit="return checkAll();" action="${pageContext.request.contextPath}/city/addcountyinfoAndschoolcinfo.do"
								method="post">
								<table cellspacing="0" cellpadding="0"
									style="text-align:left; width:98%; border:none;">
									<tr>
										<td width="50" height="30">&nbsp;</td>
										<td width="150">县区局或学校编码</td>
										<td width="320"><input type="text" name="prefixCode"
											value="600" readonly="readonly" size="2" /> <input
											type="text" name="code" value="" id="idCode"
											onblur="checkCode()" /><span id="errorCode"
											style="color:red;font-size:13px;"></span></td>
										<td></td>
									</tr>
									<tr>
										<td width="50" height="30">&nbsp;</td>
										<td width="150">县区局或学校名称</td>
										<td width="320"><input type="text" name="department.name"
											value="" id="idName" onblur="checkName()" /><span
											id="errorName" style="color:red;font-size:13px;"></span></td>
										<td></td>
									</tr>
									<tr>
										<td width="50" height="30">&nbsp;</td>
										<td width="150">县区局 / 学校</td>
										<td width="320"><input type="radio" name="departmentType"
											id="addAreaAccount_departmentType1" checked="checked"
											value="1" /><label for="addAreaAccount_departmentType1">县区教育局</label>
											<input type="radio" name="departmentType"
											id="addAreaAccount_departmentType2" value="2" /><label
											for="addAreaAccount_departmentType2">学校</label></td>
										<td>&nbsp;</td>
									</tr>
									<tr>
										<td height="30">&nbsp;</td>
										<td>登录账号</td>
										<td><input type="text" name="login.loginName" value=""
											id="idLoginName" onblur="checkLoginName()" /><span
											id="errorLoginName" style="color:red;font-size:13px;"></span></td>
										<td></td>
									</tr>
									<tr>
										<td height="30">&nbsp;</td>
										<td>登陆密码</td>
										<td><input type="text" name="password" value=""
											id="idPassword" onblur="checkPassword()" /><span
											id="errorPassword" style="color:red;font-size:13px;"></span></td>
										<td></td>
									</tr>
									<tr>
										<td height="30">&nbsp;</td>
										<td>&nbsp;</td>
										<td><input type="submit" id="addAreaAccount_0"
											value="&#25552;&#20132;" class="input_btn" /></td>
										<td></td>
									</tr>
									<tr>
										<td height="30">&nbsp;</td>
										<td>&nbsp;</td>
										<td></td>
										<td>&nbsp;</td>
									</tr>
								</table>
							</form></td>
					</tr>
				</table></td>
		</tr>
	</table>
</body>
</html>
