<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript">
function setCurrPage(num){
	if(parseInt(num) == 1){
		document.getElementById("pageSetcurrPage").value = 1;
	}else if(parseInt(num) == 2){
		if(parseInt(document.getElementById("pageSetcurrPage").value) == 1)
			document.getElementById("pageSetcurrPage").value = 1;
		else
			document.getElementById("pageSetcurrPage").value = parseInt(document.getElementById("pageSetcurrPage").value) - 1;
	}else if(parseInt(num) == 3){
		if((parseInt(document.getElementById("pageSetcurrPage").value) + 1) > document.getElementById("pageSettotalPage").value){
			document.getElementById("pageSetcurrPage").value = document.getElementById("pageSettotalPage").value;
		}
		else{
			document.getElementById("pageSetcurrPage").value = parseInt(document.getElementById("pageSetcurrPage").value) + 1;
		}
	}else if(parseInt(num) == 4){		
		document.getElementById("pageSetcurrPage").value = document.getElementById("pageSettotalPage").value;		
	}else if(parseInt(num) == 5){
		var _v = document.getElementById("pageSetturnPage").value;
		if(isNaN(_v)){
			alert("请输入合法的页数字!");
			return;
		}
		var allcount = <s:property value="pageSet.totalPage" />;
		if(_v<0){
			alert("跳转页面必须大于0!");
			return;
		}
		if(_v>allcount){
			alert("跳转页数不允许比总页数大!");
			return;
		}
		if(parseInt(document.getElementById("pageSetturnPage").value) > parseInt(document.getElementById("pageSettotalPage").value))
			document.getElementById("pageSetcurrPage").value = document.getElementById("pageSettotalPage").value;
		else if(parseInt(document.getElementById("pageSetturnPage").value) < 1){
			document.getElementById("pageSetcurrPage").value = 1;
		}else{
			document.getElementById("pageSetcurrPage").value = document.getElementById("pageSetturnPage").value;
		}
	}
	document.forms[0].submit();
}
</script>
<table align="center" width="100%" cellpadding="0" cellspacing="0" border="0" style="font-size:13px;background-color:#f0f0f0;">
	<input id="pageSetcurrPage" type="hidden" name="pageSet.currPage" value="<s:property value="pageSet.currPage"/>" />
	<input id="pageSettotalPage" type="hidden" name="pageSet.totalPage" value="<s:property value="pageSet.totalPage"/>" />
	<tr>
		<td width="30%" style="border:0px" style="text-align:left;height:26px;">
			&nbsp;第<s:property value="pageSet.currPage" />页/共<s:property value="pageSet.totalPage" />页&nbsp;共<s:property value="pageSet.totalSize" />条
		</td>
		<td style="text-align:right" width="70%" style="border:0px">
			每页大小&nbsp;<select id="pageSize" name="pageSet.pageSize" style="font-size:12px;">
				<option value="10"
					<s:if test="pageSet.pageSize==10">selected</s:if>>
					10
				</option>
				<option value="20"
					<s:if test="pageSet.pageSize==20">selected</s:if>>
					20
				</option>
				<option value="30"
					<s:if test="pageSet.pageSize==30">selected</s:if>>
					30
				</option>
			</select>
			&nbsp;跳转<input id="turnPage" style="font-size:12px;" name="pageSet.turnPage" size="2" id="pageSetturnPage"
					value="<s:property value="pageSet.turnPage"/>" onclick="javascript:this.select()"/>
			<img width="19px" height="19px" style="margin:0px;cursor:pointer;" src="resource/images/top_search_go.gif" onclick="setCurrPage(5)" alt="跳转"/>&nbsp;
			<a href="javascript:setCurrPage(1);">首页</a>&nbsp;
			<s:if test="pageSet.currPage > 1">
				<a href="javascript:setCurrPage(2);">上一页</a>&nbsp;
			</s:if>
			<s:if test="pageSet.currPage*pageSet.pageSize < pageSet.totalSize">
				<a href="javascript:setCurrPage(3);">下一页</a>&nbsp;
     		</s:if>
			<a href="javascript:setCurrPage(4);">末页</a>&nbsp;&nbsp;
		</td>
	</tr>
</table>
