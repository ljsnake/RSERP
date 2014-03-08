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
		<script type="text/javascript" src="resource/js/checkInput.js"></script>

	<title>外经证列表</title>
	</head>
<body>
	<form action="TbErpOutboundbusinesscertificate_list.action" name="form1" method="post">
		
		<div class="content-pages-wrap01">
			<div class="commonTitle">
				<div class="color2">
					外经证列表
				</div>
			</div>
			<table width="100%" border="1" rules="rows" class="tabstyle_01" id="resultTable">
				<s:if test="pageSet.resultList != null && pageSet.resultList.size() != 0">
					<tr>
						<th nowrap="nowrap" align="center">外经证编号</th>
						<th nowrap="nowrap" align="center">关联的合同ID</th>
						<th nowrap="nowrap" align="center">文书号</th>
						<th nowrap="nowrap" align="center">生效日期</th>
						<th nowrap="nowrap" align="center">到期日期</th>
						<th nowrap="nowrap" align="center">核销日期</th>
						<th nowrap="nowrap" align="center">备注信息</th>
						<th nowrap="nowrap" align="center">状态</th>
						<th nowrap="nowrap" align="center">总金额</th>
						<th nowrap="nowrap" align="center">已花费金额</th>
						<th nowrap="nowrap" align="center">留底状态</th>
					</tr>
					<s:iterator id="ls" value="pageSet.resultList">
						<tr onmouseover="this.className='td_over'"
							onMouseOut="this.className=''">
							<td nowrap="nowrap" align="center"><s:property value="#ls.certificateNumber" /></td>
							<td nowrap="nowrap" align="center"><s:property value="#ls.contractID" /></td>
							<td nowrap="nowrap" align="center"><s:property value="#ls.documentNumber" /></td>
							<td nowrap="nowrap" align="center"><s:date name="#ls.effectiveDate" format="yyyy-MM-dd"/></td>
							<td nowrap="nowrap" align="center"><s:date name="#ls.invalidDate" format="yyyy-MM-dd"/></td>
							<td nowrap="nowrap" align="center"><s:date name="#ls.writeoffsDate" format="yyyy-MM-dd"/></td>
							<td nowrap="nowrap" align="center"><s:property value="#ls.remark" /></td>
							<td nowrap="nowrap" align="center"><s:property value="#ls.state" /></td>
							<td nowrap="nowrap" align="center"><s:property value="#ls.certificateMoney" /></td>
							<td nowrap="nowrap" align="center"><s:property value="#ls.certificateCost" /></td>
							<td nowrap="nowrap" align="center"><s:property value="#ls.stateOfCopy" /></td>
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