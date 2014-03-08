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
		<script type="text/javascript" src="resource/js/checkInput.js" /></script>
		<title>修改密码</title>
<script type="text/javascript">

function commit(obj){
	obj.disabled = true;
	var err = '';
	var passwordold = document.getElementById('passwordold').value;
	var passwordnew = document.getElementById('passwordnew').value;
	var passwordnew2 = document.getElementById('passwordnew2').value;
	if(passwordold==''){
		err += '【原密码】不能为空，请填写\n';
	}
	if(passwordnew==''){
		err += '【新密码】不能为空，请填写\n';
	}
	if(passwordnew2==''){
		err += '【确认密码】不能为空，请填写\n';
	}
	if(passwordnew!=passwordnew2){
		err += '【新密码】与【确认密码】不一致，请更改\n';
	}
	if(err!=''){
		alert(err);
		obj.disabled = false;
	}else{
		document.forms[0].submit();
	}
}
</script>
	</head>
	<body class="content-pages-body">
		<form action="yhgl_updatePasswordDo.action" name="form1" method="post">
			<div class="content-pages-wrap">
				<div class="commonTitle">
					<div class="color2">
						修改密码
					</div>
				</div>
				<table width="100%" align="center" cellpadding="0" cellspacing="1">
					<tr>
						<td width="35%" align="right">
							登录名：
						</td>
						<td width="65%">
							【<s:property value="#session['user.loginName']"/>】
						</td>
					</tr>
					<tr>
						<td width="35%" align="right">
							<span style="color:red;">*</span>原密码：
						</td>
						<td width="65%">
							<input type="password" id="passwordold" name="passwordold" size="20" maxlength="20" onkeyup="checkCardNum(this);"/>
						</td>
					</tr>
					<tr>
						<td width="35%" align="right">
							新密码：
						</td>
						<td width="65%">
							<input type="password" id="passwordnew" name="user.password" size="20" maxlength="20" onkeyup="checkCardNum(this);"/>
						</td>
					</tr>
					<tr>
						<td width="35%" align="right">
							确认密码：
						</td>
						<td width="65%">
							<input type="password" id="passwordnew2" size="20" maxlength="20" onkeyup="checkCardNum(this);"/>
						</td>
					</tr>
				</table>
			</div>
			<table align="center" width="95%" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td align="center">
						<input class="submit_01" type="button" value="保 存" onclick="commit(this);" />
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>