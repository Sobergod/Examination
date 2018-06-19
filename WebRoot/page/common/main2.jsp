<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="">
<title>甘肃省高考录取信息管理平台</title>
</head>
<frameset rows="99,*,32" framespacing="0" frameborder="no" border="0"
	bordercolor="#FF0000">
	<frame src="${pageContext.request.contextPath }/page/common/top.jsp"
		name="topFrame" scrolling="no" noresize="noresize" marginwidth="0"
		marginheight="0" id="topFrame" title="topFrame" />
	<frameset cols="207,*" framespacing="0" frameborder="no" border="0"
		bordercolor="#FF0000">
		<frame
			src="${pageContext.request.contextPath}/page/${requestScope.userTypeStr}/${requestScope.userTypeStr}_left.jsp"
			scrolling="no" marginwidth="0" marginheight="0">
		<frame
			src="${pageContext.request.contextPath}/${requestScope.userTypeStr}/${requestScope.userTypeStr}ShowBaseInfo.do"
			name="mainFrame" scrolling="yes" noresize="noresize" marginwidth="0"
			marginheight="0" id="mainFrame" title="mainFrame" />
		<!-- ShowBaseInfo是显示基本信息的页面 -->
	</frameset>
	<frame src="${pageContext.request.contextPath }/page/common/bottom.jsp"
		name="bottomFrame" scrolling="no" noresize="noresize" marginwidth="0"
		marginheight="0" id="bottomFrame" title="bottomFrame" />
</frameset>

</html>