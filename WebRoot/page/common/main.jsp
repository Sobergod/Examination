<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
        <!DOCTYPE>
        <html>

        <head>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
            <title>甘肃省高考录取信息管理平台</title>
            <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/libs/layui/css/layui.css" />
        </head>

        <body class="layui-layout-body">
            <div class="layui-layout layui-layout-admin">
                <!-- 公共顶部 -->
                <%@ include file="top.jsp"%>
                    <div class="layui-side layui-bg-black">
                        <div class="layui-side-scroll">
                            <iframe style="height: 100%;" src="${pageContext.request.contextPath}/page/${requestScope.userTypeStr}/${requestScope.userTypeStr}_left.jsp"
                                frameborder="0"></iframe>
                        </div>
                    </div>
                    <div class="layui-body" style="background: #eeeeee">
                        <!-- 内容主体区域 -->
                        <div style="padding: 15px;">
                            <iframe style="width: 100%; height: 95%;" src="${pageContext.request.contextPath}/${requestScope.userTypeStr}/${requestScope.userTypeStr}ShowBaseInfo.do"
                                name="content" frameborder="0"></iframe>
                        </div>
                    </div>

                    <!-- 公共底部 -->
                    <%@ include file="bottom.jsp"%>
            </div>
            <script src="${pageContext.request.contextPath}/libs/layui/layui.js"></script>
            <script>
                //JavaScript代码区域
                layui.use('element', function () {
                    var element = layui.element;

                });
            </script>
        </body>

        </html>