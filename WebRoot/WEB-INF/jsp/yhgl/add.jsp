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
		<script src="resource/js/jquery-1.4.2.min.js" type="text/javascript"></script>
		<script type="text/javascript" src="resource/js/checkInput.js"></script>
		<title>用户新增</title>
<script type="text/javascript">
$(document).ready(function(){
	$("#userpassword").blur(function(){
		$('#ispasswordok').val('0');
		var password = $(this).val();
		if(password==''){
			$('#passwordspan').html('').css({display:'none'});
			$('#ispasswordok').val('0');
			return;
		}
		var password2 = $("#userpassword2").val();
		if(password2==''){
			$('#passwordspan').html('').css({display:'none'});
			$('#ispasswordok').val('0');
			return;
		}
		if(password==password2){
			$('#passwordspan').html('').css({display:'none'});
			$('#ispasswordok').val('1');
		}else{
			$('#passwordspan').html('两次密码输入不一致，不可用').css({display:'inline',color:'#FF0000'});
			$('#ispasswordok').val('0');
		}
	});
	$("#userpassword2").blur(function(){
		$('#ispasswordok').val('0');
		var password2 = $(this).val();
		if(password2==''){
			$('#passwordspan').html('').css({display:'none'});
			$('#ispasswordok').val('0');
			return;
		}
		var password = $("#userpassword").val();
		if(password==''){
			$('#passwordspan').html('').css({display:'none'});
			$('#ispasswordok').val('0');
			return;
		}
		if(password==password2){
			$('#passwordspan').html('').css({display:'none'});
			$('#ispasswordok').val('1');
		}else{
			$('#passwordspan').html('两次密码输入不一致，不可用').css({display:'inline',color:'#FF0000'});
			$('#ispasswordok').val('0');
		}
	});
});
function commit(obj){
	obj.disabled = true;
	var ermsg = "";
	if($("#userloginName").val()==''){
		ermsg += '【登录名】未填写，请填写；\n';
	}
	if($("#userpassword").val()==''){
		ermsg += '【密码】未填写，请填写；\n';
	}else if($("#userpassword2").val()==''){
		ermsg += '【确认密码】未填写，请填写；\n';
	}else if($("#ispasswordok").val()=='0'){
		ermsg += '【密码】不可用，请修改；\n';
	}
	if(ermsg!=''){
		alert(ermsg);
		obj.disabled = false;
	}else{
		if(confirm('确认提交吗？')){
			document.forms(0).submit();
		}else{
			obj.disabled = false;
		}
	}
}
</script>
	</head>
	<body class="content-pages-body">
		<form action="yhgl_addDo.action" name="form1" method="post">
			<div class="content-pages-wrap">
				<div class="commonTitle">
					<div class="color2">
						用户新增
					</div>
				</div>
				<table width="100%" align="center" cellpadding="0" cellspacing="1">
					<tr>
						<td width="30%" align="right">
							用户名：
						</td>
						<td width="70%">
							<input type="text" id="username" name="user.name" size="20" maxlength="20" onkeyup="checkCharacter(this);"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							<span style="color:red;">*</span>登录名：
						</td>
						<td >
							<input type="text" id="userloginName" name="user.loginName" size="20" maxlength="20" onkeyup="checkCardNum(this);"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							<span style="color:red;">*</span>密码：
						</td>
						<td >
							<input type="password" id="userpassword" name="user.password" size="20" onkeyup="checkCardNum(this);" maxlength="20"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							<span style="color:red;">*</span>确认密码：
						</td>
						<td >
							<input type="password" id="userpassword2" size="20" onkeyup="checkCardNum(this);" maxlength="20"/>
							<span id="passwordspan"></span><input type="hidden" id="ispasswordok" value="0"/>
						</td>
					</tr>
<!-- 					<tr> -->
<!-- 						<td align="right"> -->
<!-- 							角色： -->
<!-- 						</td> -->
<!-- 						<td > -->
<%-- 							<select id="userrole" name="user.role"> --%>
<!-- 								<option value="1">管理员</option> -->
<%-- 							</select> --%>
<!-- 						</td> -->
<!-- 					</tr> -->
				</table>
			</div>
			<table align="center" width="95%" border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td align="center">
						<input type="hidden" name="reUrl" value="<s:property value="reUrl"/>">
						<input class="submit_01" type="button" value="保 存" onclick="commit(this);" />
						&nbsp;
						<input class="submit_01" type="button" value="返 回" onclick="javacript:window.history.go(-1);" />
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>