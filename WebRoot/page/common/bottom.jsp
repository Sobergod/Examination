<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
	<div class="layui-footer">
		<!-- 底部固定区域 -->
		<span>用户：</span>
		<span>${realName}</span>
		<span style="float: right" id="spanDate"></span>
	</div>
	<script type="text/javascript">
		function getDate() {
			var date = new Date();
			var days = ["日", "一", "二", "三", "四", "五", "六"];
			var spanDate = document.getElementById("spanDate");
			spanDate.innerHTML = date.getFullYear() + "年" + (date.getMonth() + 1) + "月"
				+ date.getDate() + "日 星期" + days[date.getDay()];
		}
		getDate();
	</script>