<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="Cache-Control" content="no-cache, must-revalidate" />
<meta http-equiv="expires" content="0" />
<title>RS ERP</title>
<link href="resource/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
	if(top.location != this.location){
   		top.location = this.location;
	}
	function keydown(event) {
		var evt = evt || event;
		if (evt.keyCode == 13) {
			if (document.getElementById("loginName").value == "") {
				alert("请输入登录名...");
			}else if (document.getElementById("password").value == "") {
				alert("请输入密码...");
			} else {
				document.forms[0].submit();
			}
		}
	}
	function clearInput() {
		document.getElementById("loginName").value = "";
		document.getElementById("password").value = "";
	}
	function initFocus() {
		document.getElementById("loginName").focus();
	}
</script>
</head>
<body style="background-color: #063881;"
	onload="javascript:initFocus();">
	<div id="container">
		<div id="main">
			<form action="login_login.action" name="loginForm" method="post">
				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="tab_1">
					<tr>
						<td width="15%" height="30">登录名：</td>
						<td width="85%"><label> <input type="text" id="loginName" name="loginName" class="input_1" value="" tabindex="1" /> 
						</label></td>
					</tr>
					<tr>
						<td height="30">密&nbsp;&nbsp;&nbsp;码：</td>
						<td><input type="password" id="password" name="password" class="input_1" value="" tabindex="2" onkeydown="keydown(event)"/>
						</td>
					</tr>
					<tr>
						<td height="40"></td>
						<td valign="bottom"><img src="resource/images/dl.gif" width="63" height="23" border="0" onclick="javascript:document.forms[0].submit();" style="cursor: pointer;" />
							<img src="resource/images/cz.gif" width="63" height="23" border="0" onclick="javascript:clearInput();" style="cursor:pointer;" /> 
							<font color="red"><s:property value="errorMessage" /></font>
						</td>
					</tr>
				</table>
			</form>
		</div>
		<div class="position_1">Copyright 2014 © 上海市蓉申建筑公司版权所有</div>
	</div>
</body>
</html>