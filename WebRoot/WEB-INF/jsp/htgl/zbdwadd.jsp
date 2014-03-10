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
		<title>总包单位新增</title>
<script type="text/javascript">
function commit(obj){
	obj.disabled = true;
	var ermsg = "";
	if($("#contractorname").val()==''){
		ermsg += '【单位名】未填写，请填写；\n';
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
		<form action="htgl_fbdwAddDo.action" name="form1" method="post">
			<div class="content-pages-wrap">
				<div class="commonTitle">
					<div class="color2">
						总包单位新增
					</div>
				</div>
				<table width="100%" align="center" cellpadding="0" cellspacing="1" class="commonTable">
					<tr>
						<td width="35%" align="right">
							<span style="color:red;">*</span>单位名称：
						</td>
						<td width="65%">
							<input type="text" id="contractorname" name="contractor.name" size="20" maxlength="20" onkeyup="checkCharacter(this);"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							单位地址：
						</td>
						<td >
							<input type="text" id="contractoraddress" name="contractor.address" size="30" maxlength="40" onkeyup="checkCharacter(this);"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							联系人：
						</td>
						<td >
							<input type="text" id="contractorcontact" name="contractor.contact" size="20" maxlength="20" onkeyup="checkCharacter(this);"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							联系方式：
						</td>
						<td >
							<input type="text" id="contractorphone" name="contractor.phone" size="30" onkeyup="checkPhone(this);" maxlength="40"/>(备注：可写多个，用分号隔开)
						</td>
					</tr>
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