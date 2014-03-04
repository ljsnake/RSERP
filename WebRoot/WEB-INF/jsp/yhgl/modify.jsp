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
		<title>用户修改</title>
<script type="text/javascript">
$(document).ready(function(){
	$("#userVopassword").blur(function(){
		$('#ispasswordok').val('0');
		var password = $(this).val();
		var password2 = $("#userVopassword2").val();
		if(password==password2){
			$('#passwordspan').html('').css({display:'none'});
			$('#ispasswordok').val('1');
		}else{
			$('#passwordspan').html('两次密码输入不一致，不可用').css({display:'inline',color:'#FF0000'});
			$('#ispasswordok').val('0');
		}
	});
	$("#userVopassword2").blur(function(){
		$('#ispasswordok').val('0');
		var password2 = $(this).val();
		var password = $("#userVopassword").val();
		if(password==password2){
			$('#passwordspan').html('').css({display:'none'});
			$('#ispasswordok').val('1');
		}else{
			$('#passwordspan').html('两次密码输入不一致，不可用').css({display:'inline',color:'#FF0000'});
			$('#ispasswordok').val('0');
		}
	});
	$("#userVoemail").blur(function(){
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
	if($("#userVogh").val()==''){
		ermsg += '【HIS端工号】未填写，请填写；\n';
	}
	if($("#ispasswordok").val()=='0'){
		ermsg += '【密码】不可用，请修改；\n';
	}
	if($("#userVoname").val()==''){
		ermsg += '【姓名】未填写，请填写；\n';
	}
	if($("#userVoemail").val()==''){
		ermsg += '【电子邮件】未填写，请填写；\n';
	}else if($("#isemailok").val()=='0'){
		ermsg += '【电子邮件】不可用，请修改；\n';
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
		<form action="yhgl_modifyDo.action" name="form1" method="post">
			<div class="content-pages-wrap">
				<div class="commonTitle">
					<div class="color2">
						用户修改--基本信息<input type="hidden" name="userid" value="<s:property value="userid"/>"/>
					</div>
				</div>
				<table width="100%" align="center" cellpadding="0" cellspacing="1">
					<tr>
						<td width="30%" align="right">
							<span style="color:red;">*</span>医疗机构：
						</td>
						<td width="70%">
							【<s:property value="yymc"/>】<input type="hidden" name="userVo.yljgdm" value="<s:property value="userVo.yljgdm"/>"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							<span style="color:red;">*</span>HIS端工号：
						</td>
						<td >
							<input type="text" id="userVogh" name="userVo.gh" size="20" value="<s:property value="userVo.gh"/>" onkeyup="checkCardNum(this);" maxlength="25"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							<span style="color:red;">*</span>登录名：
						</td>
						<td >
							【<s:property value="userVo.loginName"/>】<input type="hidden" name="userVo.loginName" value="<s:property value="userVo.loginName"/>"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							密码：
						</td>
						<td >
							<input type="password" id="userVopassword" name="userVo.password" size="20"  onkeyup="checkCardNum(this);" maxlength="20"/>(备注：密码为空，即为不修改该用户密码)
						</td>
					</tr>
					<tr>
						<td align="right">
							确认密码：
						</td>
						<td >
							<input type="password" id="userVopassword2" size="20" onkeyup="checkCardNum(this);"/>
							<span id="passwordspan"></span><input type="hidden" id="ispasswordok" value="1"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							<span style="color:red;">*</span>姓名：
						</td>
						<td >
							<input type="text" id="userVoname" name="userVo.name" size="20" value="<s:property value="userVo.name"/>" onkeyup="checkCharacter(this);" maxlength="50"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							<span style="color:red;">*</span>性别：
						</td>
						<td >
							<input type="radio" name="userVo.sex" value="1" <s:if test="userVo.sex==1">checked="checked"</s:if>/>
							男性
							<input type="radio" name="userVo.sex" value="0" <s:if test="userVo.sex==1">checked="checked"</s:if>/>
							女性
						</td>
					</tr>
				</table>
			</div>
			<div class="content-pages-wrap01">
				<div class="commonTitle">
					<div class="commonTitle">
						<div class="color2">
							--通讯信息
						</div>
					</div>
				</div>
				<table width="100%" align="center" cellpadding="0" cellspacing="1">
					<tr>
						<td width="30%" align="right">
							移动电话1：
						</td>
						<td width="70%">
							<input type="text" id="userVomobile1" name="userVo.mobile1" size="20" value="<s:property value="userVo.mobile1"/>" maxlength="50" onkeyup="checkNum(this);"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							移动电话2：
						</td>
						<td >
							<input type="text" id="userVomobile2" name="userVo.mobile2" size="20" value="<s:property value="userVo.mobile2"/>" maxlength="50" onkeyup="checkNum(this);"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							家庭电话：
						</td>
						<td >
							<input type="text" id="userVohonePhone" name="userVo.honePhone" size="20" value="<s:property value="userVo.honePhone"/>" maxlength="50" onkeyup="checkPhone(this);"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							办公电话：
						</td>
						<td >
							<input type="text" id="userVoofficePhone" name="userVo.officePhone" size="20" value="<s:property value="userVo.officePhone"/>" maxlength="50" onkeyup="checkPhone(this);"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							传真：
						</td>
						<td >
							<input type="text" id="userVo.fax" name="userVo.fax" size="20" value="<s:property value="userVo.fax"/>" maxlength="50" onkeyup="checkPhone(this);"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							<span style="color:red;">*</span>电子邮件：
						</td>
						<td >
							<input type="text" id="userVoemail" name="userVo.email" size="20" value="<s:property value="userVo.email"/>" maxlength="100"/>
							<span id="emailspan"></span><input type="hidden" id="isemailok" value="1"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							通讯地址：
						</td>
						<td >
							<input type="text" id="userVoaddress" name="userVo.address" size="20" value="<s:property value="userVo.address"/>" onkeyup="checkCharacter(this);" maxlength="125"/>
						</td>
					</tr>
				</table>
			</div>
			<table align="center" width="95%" border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td align="center">
						<input class="submit_01" type="button" value="保 存" onclick="commit(this);" />
						&nbsp;
						<input class="submit_01" type="button" value="返 回" onclick="javacript:window.history.go(-1);" />
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>