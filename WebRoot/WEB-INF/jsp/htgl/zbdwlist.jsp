<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=7" />
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="Cache-Control" content="no-cache, must-revalidate" />
		<meta http-equiv="expires" content="0" />
		<link href="resource/css/main.css" rel="stylesheet" type="text/css" media="all" />
		<script type="text/javascript" src="resource/js/checkInput.js"></script>
		<title>分包单位列表</title>
<script type="text/javascript">
	function createzbdw(){
	 	window.location.href="htgl_zbdwAdd.action?reUrl=htgl_zbdwList.action";
	}
</script>
	</head>
	<body class="content-pages-body">
<form action="htgl_fbdwList.action" name="form1" method="post">
	<div class="content-pages-wrap01">
		<table width="100%" border="0" align="center" cellpadding="0"
			cellspacing="0" class="bordercol_01">
			<tr>
				<td class="commonTitle">
				<div class="color2">
					<b>总包单位</b>-查询
				</div>
				</td>
			</tr>
			<tr>
				<td height="40" align="center">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td align="right" width="15%">
								单位名称：
							</td>
							<td align="left" width="35%">
								<input name="condition.name" value="<s:property value="condition.name"/>"  onkeyup="checkCharacter(this)" maxlength="20"/>
							</td>
							<td align="right" width="15%">
								联系人：
							</td>
							<td align="left" width="35%">
								<input name="condition.contact" value="<s:property value="condition.contact"/>"  onkeyup="checkCharacter(this);" maxlength="20"/>
							</td>
						</tr>
						<tr>
							<td colspan="4" align="center">
								<input class="submit_01" type="button"
									onclick="javascript:setCurrPage(1);" value="搜 索" />
								<input class="submit_01" type="button"
									onclick="javascript:createzbdw();"   value="新 建" />
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</div>
	<div class="content-pages-wrap01">
		<div class="commonTitle">
			<div class="color2">
				<b>总包单位</b>-列表
			</div>
		</div>
		<table width="100%" border="1" rules="rows" class="tabstyle_01" id="resultTable">
			<s:if test="pageSet.resultList != null && pageSet.resultList.size() != 0">
				<tr>
					<th nowrap="nowrap" align="center">id</th>
					<th nowrap="nowrap" align="center">单位名称</th>
					<th nowrap="nowrap" align="center">地址</th>
					<th nowrap="nowrap" align="center">联系人</th>
					<th nowrap="nowrap" align="center">联系方式</th>
					<th nowrap="nowrap" align="center">操作</th>
				</tr>
				<s:iterator id="ls" value="pageSet.resultList">
					<tr onmouseover="this.className='td_over'"
						onMouseOut="this.className=''">
						<td nowrap="nowrap" align="center"><s:property value="#ls.id" /></td>
						<td nowrap="nowrap" align="center"><s:property value="#ls.name" /></td>
						<td nowrap="nowrap" align="center"><s:property value="#ls.address" /></td>
						<td nowrap="nowrap" align="center"><s:property value="#ls.contact" /></td>
						<td nowrap="nowrap" align="center" title="<s:property value="#ls.phone" escape="false"/>">
							<s:if test="#ls.phone.length()>20"><s:property value="#ls.phone.substring(0,20)+'...'"escape="false"/></s:if>
							<s:else><s:property value="#ls.phone" /></s:else>
						</td>
						<td nowrap="nowrap" align="center">
							<a href="htgl_zbdwShow.action?id=<s:property value="#ls.id" />" >查看</a>
							&nbsp;
							<a href="htgl_zbdwUpdate.action?id=<s:property value="#ls.id" />" >修改</a>
						</td>
					</tr>
				</s:iterator>
			</s:if>
			<s:else>
				<tr class="ttth">
					<td width="100%" align="center"><font color="red">没有查询到记录！！</font></td>
				</tr>
			</s:else>
		</table>
		<%@include file="/common/pageSet.jsp"%>
	</div>
</form>
	</body>
</html>