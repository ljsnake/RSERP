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
	$("#userloginName").blur(function(){
		$('#isloginNameok').val('0');
		var loginName = $(this).val();
		if(loginName==''){
			$('#loginNamespan').html('').css({display:'none'});
			$('#isloginNameok').val('0');
			return;
		}
		$.ajax({
			url:'ajax_checkLoginName.action',
			type:'post',
			data:'loginName='+loginName,
			success:function(data){
				if(data=='0'){
					$('#loginNamespan').html('该登录名可用').css({display:'inline',color:'#00FF00'});
					$('#isloginNameok').val('1');
				}else if(data =='1'){
					$('#loginNamespan').html('该登录名已存在，不可用').css({display:'inline',color:'#FF0000'});
					$('#isloginNameok').val('0');
				}
			}
		});
	});
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
	$("#useremail").blur(function(){
		$('#isemailok').val('0');
		var email = $(this).val();
		if(email==''){
			$('#emailspan').html('').css({display:'none'});
			$('#isemailok').val('0');
			return;
		}
		var reg = /[a-zA-Z0-9_\.\-]+\@[a-zA-Z0-9_\-]+\.[a-zA-Z0-9_\.\-]+/;
		if(reg.test(email)){
			$('#emailspan').html('').css({display:'none'});
			$('#isemailok').val('1');
		}else{
			$('#emailspan').html('email输入格式不正确，不可用').css({display:'inline',color:'#FF0000'});
			$('#isemailok').val('0');
		}
	});
});
function commit(obj){
	obj.disabled = true;
	var ermsg = "";
	if($("#userloginName").val()==''){
		ermsg += '【登录名】未填写，请填写；\n';
	}else if($("#isloginNameok").val()=='0'){
		ermsg += '【登录名】不可用，请修改；\n';
	}
	if($("#userpassword").val()==''){
		ermsg += '【密码】未填写，请填写；\n';
	}else if($("#userpassword2").val()==''){
		ermsg += '【确认密码】未填写，请填写；\n';
	}else if($("#ispasswordok").val()=='0'){
		ermsg += '【密码】不可用，请修改；\n';
	}
	if($("#useremail").val()!='' && $("#isemailok").val()=='0'){
		ermsg += '【电子邮件】不可用，请修改；\n';
	}
	if(ermsg!=''){
		alert(ermsg);
		obj.disabled = false;
	}else{
		if(confirm('确认提交吗？')){
			document.forms[0].submit();
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
				<table width="100%" align="center" cellpadding="0" cellspacing="1" class="commonTable">
					<tr>
						<td width="35%" align="right">
							用户名：
						</td>
						<td width="65%">
							<input type="text" id="username" name="user.name" size="20" maxlength="20" onkeyup="checkCharacter(this);"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							<span style="color:red;">*</span>登录名：
						</td>
						<td >
							<input type="text" id="userloginName" name="user.loginName" size="20" maxlength="20" onkeyup="checkCardNum(this);"/>
							<span id="loginNamespan"></span><input type="hidden" id="isloginNameok" value="0"/>
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
					<tr>
						<td align="right">
							邮箱地址：
						</td>
						<td >
							<input type="text" id="useremail" name="user.email" size="20" maxlength="30"/>
							<span id="emailspan"></span><input type="hidden" id="isemailok" value="0"/>
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
						<s:if test="reUrl != null && !reUrl.equals(\"\")">
							<input class="submit_01" type="button" value="返 回" onclick="javacript:window.history.go(-1);" />
						</s:if>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>