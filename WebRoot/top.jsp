<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<link href="resource/css/style.css" rel="stylesheet" type="text/css" />
		<title>TOP</title>
		<script type="text/javascript" language="javascript">
    	function exitTaxi() {
  			if(confirm("确定退出吗?")){
  				top.window.location.href = "login_logout.action";
  			}
		}
		</script>
	</head>
	<body>
		<div style="width:100%; height:115px; background-color:#083683;">
			<div class="topline">
<!-- 				<h1 style="color: #fff;float:center;z-index:2;" align="center"><br/>Welcome to TaxiFee</h1> -->
				<div class="topimg">
					<div id="top_bg">
						<div id="head_icon">
							<div id="head_icon01">
								<span><a href="javascript:void(0);" onclick="exitTaxi();">[退出]</a> </span>
							</div>
							<div id="head_icon02">
								<span>用户名：<s:property value="(#session['user.loginName'])"/></span>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>
