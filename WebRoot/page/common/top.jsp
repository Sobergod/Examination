<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
	<div class="layui-header">
		<div class="layui-logo">高考录取信息管理平台</div>
		<!-- 头部区域（可配合layui已有的水平导航） -->
		<ul class="layui-nav layui-layout-right">
			<li class="layui-nav-item">
				<a href="javascript:;">
					${realName}
				</a>
				<dl class="layui-nav-child">
					<dd>
						<a href="/tms4/common/changePassword.do">修改密码</a>
					</dd>
				</dl>
			</li>
			<li class="layui-nav-item">
				<a href="/tms4/common/loginOut.do">退出系统</a>
			</li>
		</ul>
	</div>