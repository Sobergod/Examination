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
	
	<link href="${pageContext.request.contextPath}/images/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
<script type="text/javascript">
	function checkIdentityCard(){
		var obj=document.getElementById("idIdentityCard");
		var span=document.getElementById("errorIdentityCard");
		if(obj.value == "" || obj.value.trim().length==0){
			span.innerHTML = "身份证号码不能为空";
			return false;
		}else{
			span.innerHTML = "";
			return true;
		}
	}
	function checkRealName(){
		var obj=document.getElementById("idRealName");
		var span=document.getElementById("errorRealName");
		if(obj.value == "" || obj.value.trim().length==0){
			span.innerHTML = "教师姓名不能为空";
			return false;
		}else{
			span.innerHTML = "";
			return true;
		}
	}
	function checkLoginName(){
		var obj=document.getElementById("idLoginName");
		var span=document.getElementById("errorLoginName");
		if(obj.value == "" || obj.value.trim().length==0){
			span.innerHTML = "登陆账号不能为空";
			return false;
		}else{
			span.innerHTML = "";
			return true;
			}
	}
	function checkPassword(){
		var obj=document.getElementById("idPassword");
		var span=document.getElementById("errorPassword");
		if(obj.value == "" || obj.value.trim().length==0){
			span.innerHTML = "登陆密码不能为空";
			return false;
		}else{
			span.innerHTML = "";
			return true;
			}
	}
	function checkAll(){
		var res =  checkIdentityCard() & checkRealName() & checkLoginName()&checkPassword();
		return (res == 1);
	}
</script>
</head>

<body>
	<table class="right_top" cellpadding="0" cellspacing="0">
		<tr>
			<td class="right_top_left"></td>
			<td class="right_top_center">当前位置：添加教师账号</td>
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
									<td height="27" align="left">&nbsp;&nbsp;添加教师账号</td>
									<td align="right">&nbsp;</td>
								</tr>
							</table></th>
					</tr>
					<tr class="trListOdd">
						<td width="200" align="center" valign="top" bgcolor="#F6FBFB"><p>&nbsp;</p>
						</td>
						<td valign="top"><p>&nbsp;</p>         
<form id="addTeacherAccount" name="addTeacherAccount" onsubmit="return checkAll();" action="${pageContext.request.contextPath}/school/addTeacherAccount.do" method="post">
								<table cellspacing="0" cellpadding="0"
									style="text-align:left; width:98%; border:none;">
									<tr>
										<td width="50" height="30">&nbsp;</td>
										<td width="150">身份证号码</td>
										<td width="320"><input type="text" name="teacher.identityCard" value="" id="idIdentityCard" onblur="checkIdentityCard()"/><span
											id="errorIdentityCard" style="color:red;font-size:13px;"></span>
										</td>
										<td></td>
									</tr>
									<tr>
										<td width="50" height="30">&nbsp;</td>
										<td width="150">教师姓名</td>
										<td width="320"><input type="text" name="teacher.realName" value="" id="idRealName" onblur="checkRealName()"/><span
											id="errorRealName" style="color:red;font-size:13px;"></span>
										</td>
										<td></td>
									</tr>
									<tr>
										<td height="30">&nbsp;</td>
										<td>登录账号</td>
										<td><input type="text" name="login.loginName" value="" id="idLoginName" onblur="checkLoginName()"/><span id="errorLoginName"
											style="color:red;font-size:13px;"></span></td>
										<td></td>
									</tr>
									<tr>
										<td height="30">&nbsp;</td>
										<td>登陆密码</td>
										<td><input type="text" name="password" value="" id="idPassword" onblur="checkPassword()"/><span id="errorPassword"
											style="color:red;font-size:13px;"></span></td>
										<td></td>
									</tr>
									<tr>
										<td height="30">&nbsp;</td>
										<td>&nbsp;</td>
										<td><input type="submit" id="addTeacherAccount_0" value="&#25552;&#20132;" class="input_btn"/>
</td>
										<td></td>
									</tr>
									<tr>
										<td height="30">&nbsp;</td>
										<td>&nbsp;</td>
										<td>
										</td>
										<td>&nbsp;</td>
									</tr>
								</table>
							</form>



</td>
					</tr>
				</table></td>
		</tr>
	</table>
</body>
</html>
