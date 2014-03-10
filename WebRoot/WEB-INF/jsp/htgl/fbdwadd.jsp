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
		<title>分包单位新增</title>
<script type="text/javascript">
$(document).ready(function(){
	$("#subcontractorname").blur(function(){
		$('#isnameok').val('0');
		var name = $(this).val();
		if(name==''){
			$('#namespan').html('').css({display:'none'});
			$('#isnameok').val('0');
			return;
		}
		$.ajax({
			url:'ajax_checkSubcontractorName.action',
			type:'post',
			data:'name='+name,
			success:function(data){
				if(data=='0'){
					$('#namespan').html('该单位名可用').css({display:'inline',color:'#00FF00'});
					$('#isnameok').val('1');
				}else if(data =='1'){
					$('#namespan').html('该单位名已存在，不可用').css({display:'inline',color:'#FF0000'});
					$('#isnameok').val('0');
				}
			}
		});
	});
});
function commit(obj){
	obj.disabled = true;
	var ermsg = "";
	if($("#subcontractorname").val()==''){
		ermsg += '【单位名】未填写，请填写；\n';
	}else if($("#isnameok").val()=='0'){
		ermsg += '【单位名】不可用，请修改；\n';
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
						分包单位新增
					</div>
				</div>
				<table width="100%" align="center" cellpadding="0" cellspacing="1" class="commonTable">
					<tr>
						<td align="right" width="35%">
							<span style="color:red;">*</span>单位名称：
						</td>
						<td width="65%">
							<input type="text" id="subcontractorname" name="subcontractor.name" size="20" maxlength="20" onkeyup="checkCharacter(this);"/>
							<span id="namespan"></span><input type="hidden" id="isnameok" value="0"/>
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