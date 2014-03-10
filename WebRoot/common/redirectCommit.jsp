<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<base target="_self" />
		<script type="text/javascript">
	var reUrl = "";
	var willLocation = false;
	var locationOnce = true;
	<s:if test="#parameters.reUrl[0] != null && !#parameters.reUrl[0].equals(\"\")">
		function forwardPage() {
			reUrl = location.search.substring(location.search.indexOf("=")+1);//取出redirectURL
			document.getElementById("commit").href="../" + reUrl;
			setInterval(locationNextPage, 1000);
		}
	
		function locationNextPage() {
			if (willLocation && locationOnce) {
				locationOnce = false;
				window.location.href = "../" + reUrl;
			} else {
				willLocation = true;
			}
		}
	</s:if>
	<s:else>
	
		function forwardPage() {
// 			setInterval(locationNextPage, 1000);
		}
		function locationNextPage() {
// 			if (willLocation && locationOnce) {
// 				locationOnce = false;
// 				window.close();
// 			} else {
// 				willLocation = true;
// 			}
		}
	</s:else>
	
</script>
	</head>
	<body onload="forwardPage();" bgcolor="#EDF5FB">
		<table cellSpacing=0 cellPadding=0 width="98%" align=center border=0 class="btable">
			<tbody>
				<tr><td>
					<table cellSpacing='0' cellPadding='4' width="100%" border="0">
						<tr>
							<td align="center">
								<img src="../resource/images/folder_big.gif">
								操作已成功
							</td>
						</tr>
						<s:if test="#parameters.reUrl != null && !#parameters.reUrl[0].equals(\"\")">
							<tr>
								<td align="center">
									1秒后跳转，如果没有跳转请<a style="color: red;" id="commit" href="../<s:property escape="false" value="#parameters.reUrl[0]"/>">点击此处</a>
								</td>
							</tr>
						</s:if>
<%-- 						<s:else> --%>
<!-- 							<tr> -->
<!-- 								<td align="center"> -->
<!-- 									1秒后自动关闭，如果没有关闭请<a style="color: red;" id="commit" href="javascript:window.close();">点击此处</a> -->
<!-- 								</td> -->
<!-- 							</tr> -->
<%-- 						</s:else> --%>
					</table>
				</td></tr>
			</tbody>
		</table>
		<input id="reUrl" value="<s:property escape="false" value="#parameters.reUrl" />" type="hidden" />
	</body>
</html>