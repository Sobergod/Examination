<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	//String path = request.getContextPath();
	//System.out.println("path=="+path);
	//String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>实例9：使用jsp读取TXT格式文件</title>
</head>
<body>
	<%
		//String filePath = request.getSession().getServletContext().getRealPath("/")+"JSP_Ajax"+"\\";
		//System.out.println("filePath=="+filePath);
		String path ="C:\\Users\\q\\Desktop\\tms";   // 这边文件目录需改成相对路径
		File file = new File(path,"12.txt");
		FileReader fr = new FileReader(file);  //字符输入流
		BufferedReader br = new BufferedReader(fr);  //使文件可按行读取并具有缓冲功能
		StringBuffer strB = new StringBuffer();   //strB用来存储jsp.txt文件里的内容
		String str = br.readLine();
		strB.append("<table border='1'>");
		while(str!=null){
			strB.append("<tr>");
			String[] strArray = str.split(",");
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
</body>
</html>