<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link href="${pageContext.request.contextPath}/images/common.css"
	rel="stylesheet" type="text/css" />
<script type="text/javascript">
	function checkAddress(){
		var obj=document.getElementById("idAddress");
		var span=document.getElementById("errorAddress");
		if(obj.value == "" || obj.value.trim().length==0){
			span.innerHTML = "单位地址不能为空";
			return false;
		}else{
			span.innerHTML = "";
			return true;
			}
	}
	function checkPhone(){
		var obj=document.getElementById("idPhone");
		var span=document.getElementById("errorPhone");
		if(obj.value == "" || obj.value.trim().length==0){
			span.innerHTML = "单位电话不能为空";
			return false;
		}else{
			span.innerHTML = "";
			return true;
			}
	}
	function checkAll(){
		var res =  checkAddress() & checkPhone();
		return (res == 1);
	}
</script>
</head>

<body>
	<table class="right_top" cellpadding="0" cellspacing="0">
		<tr>
			<td class="right_top_left"></td>
			<td class="right_top_center">当前位置：学院信息修改</td>
			<td class="right_top_center" style="width:70px;">&nbsp;</td>
			<td class="right_top_right"></td>
		</tr>
	</table>

	<table class="right_middle" cellspacing="0" cellpadding="0">
		<tr>
			<td style="height:27px;"><p></p>
			</td>
		</tr>
		<tr>
			<td style="vertical-align:top; padding:3px;"><table width="500"
					cellpadding="0" cellspacing="1" class="tableList">
					<tr>
						<th colspan="2"><table width="98%" border="0" cellspacing="0"
								cellpadding="0">
								<tr>
									<td height="27" align="left">&nbsp;&nbsp;学院信息修改</td>
									<td align="right"></td>
								</tr>
							</table>
						</th>
					</tr>
					<tr class="trListOdd">
						<td width="100" align="center" valign="top" bgcolor="#F6FBFB"><p>&nbsp;</p>
						</td>
						<td valign="top"><p>&nbsp;</p>      
						
						<!-- ------------------------------下面是一个表单---------------------------- -->  
						
						 
<form id="updateCollegeInfo" name="updateCollegeInfo" onsubmit="return checkAll();" action="${pageContext.request.contextPath}/college/updateCollege.do" method="post">
								<!-- 隐藏域保存要更新对象的主键 -->
								<input type="hidden" name="college.collegeId" value="1" id="updateCollegeInfo_college_collegeId"/>
								
								
								
								<input type="hidden" name="college.collegeName" value="&#29976;&#32899;&#30465;&#25945;&#32946;&#21381;" id="updateCollegeInfo_college_collegeName"/>
								<table cellspacing="0" cellpadding="0"
									style="text-align:left; width:98%; border:none;">
									<!--<tr><td><input type="hidden" name="departmentId" value="${loginid}" /></td></tr>  -->
									<tr>
										<td width="50" height="30">&nbsp;</td>
										<td width="150">学院名称:</td>
										<td width="320">${college.collegeName}
										</td>
										<td>&nbsp;</td>
									</tr>
									<tr>
										<td width="50" height="30">&nbsp;</td>
										<td width="150">学院描述</td>
										<td width="320">${college.collegeName}
										</td>
										<td>&nbsp;</td>
									</tr>
									
									<tr>
										<td height="30">&nbsp;</td>
										<td>&nbsp;</td>
										<td><input type="submit" id="updateProvinceBaseInfo_0" value="&#25552;&#20132;" class="input_btn"/>
				<!--------------- 这里是提交按钮---------------- -->
										</td>
										<td></td>
									</tr>
									<tr>
										<td height="30">&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
									</tr>
									
								</table>
							</form>
							<p>&nbsp;</p>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</body>


</html>
