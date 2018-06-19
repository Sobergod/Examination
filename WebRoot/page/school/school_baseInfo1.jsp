<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.File"%>
<%@ page import="com.mysql.jdbc.Driver" %>   
<%@ page import="java.sql.*" %>   
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
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
			<td class="right_top_center">当前位置：录取基本信息管理</td>
			<td class="right_top_center" style="width: 70px;">&nbsp;</td>
			<td class="right_top_right"></td>
		</tr>
	</table>

	<table class="right_middle" cellspacing="0" cellpadding="0">
		<tr>
			<td style="height: 27px;"><p></p></td>
		</tr>
		<tr>
			<td style="vertical-align: top; padding: 3px;"><table
					width="500" cellpadding="0" cellspacing="1" class="tableList">
					<tr>
						<th colspan="2"><table width="98%" border="0" cellspacing="0"
								cellpadding="0">
								<tr>
									<td height="27" align="left">&nbsp;&nbsp;录取基本信息管理</td>
									<td>
									<input type="button" name="数据录入" value="数据录入" onclick="com\luas\tms\action\teacher\TestAction"></input>
										</td>
								</tr>
							</table></th>
					</tr>
					<tr class="trListOdd">
						<td width="200" align="center" valign="top" bgcolor="#F6FBFB"><p>&nbsp;</p>
						</td>
						<td valign="top"><p>&nbsp;</p>
							<table cellspacing="0" cellpadding="0"
								style="text-align: left; width: 98%; border: none;">
								<%
		//String filePath = request.getSession().getServletContext().getRealPath("/")+"JSP_Ajax"+"\\";
		//System.out.println("filePath=="+filePath);
		String path ="C:\\Users\\q\\Desktop\\tms";   // 这边文件目录需改成相对路径
		File file = new File(path,"16.txt");
		FileReader fr = new FileReader(file);  //字符输入流
		BufferedReader br = new BufferedReader(fr);  //使文件可按行读取并具有缓冲功能
		StringBuffer strB = new StringBuffer();   //strB用来存储jsp.txt文件里的内容
		String str = br.readLine();
		strB.append("<table border='1'>");
		while(str!=null){
			strB.append("<tr>");
			String[] strArray = str.split(" ");
			for(int i = 0; i< strArray.length; i ++){
				strB.append("<td>" + strArray[i].toString() + "</td>");   //将读取的内容放入strB
			}
			strB.append("</tr>");  
			str = br.readLine();
		}
	strB.append("</table>");


		br.close();    //关闭输入流
	%>
	<center>
		<%=strB %>
	</center>
							</table>
							<p>&nbsp;</p></td>
					</tr>
				</table></td>
		</tr>
		
	</table>
</body>
</html>
