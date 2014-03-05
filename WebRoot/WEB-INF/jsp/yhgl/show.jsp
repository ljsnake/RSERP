<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=7" />
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="Cache-Control" content="no-cache, must-revalidate" />
		<meta http-equiv="expires" content="0" />
		<link rel="stylesheet" href="resource/css/main.css" media="all" />
		<title>用户查看</title>
	</head>
	<body class="content-pages-body">
			<div class="content-pages-wrap">
				<div class="commonTitle">
					<div class="color2">
						用户查看
					</div>
				</div>
				<table width="100%" align="center" cellpadding="0" cellspacing="1" class="commonTable">
					<tr>
						<td width="35%" align="right">
							用户名：
						</td>
						<td width="65%">
							<s:property value="user.name"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							登录名：
						</td>
						<td >
							<s:property value="user.loginName"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							邮箱地址：
						</td>
						<td >
							<s:property value="user.email"/>
						</td>
					</tr>
				</table>
			</div>
			<table align="center" width="95%" border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td align="center">
						<input class="submit_01" type="button" value="返 回" onclick="javacript:window.history.go(-1);" />
					</td>
				</tr>
			</table>
	</body>
</html>