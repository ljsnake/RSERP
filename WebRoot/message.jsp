<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="Cache-Control" content="no-cache, must-revalidate" />
<meta http-equiv="expires" content="0" />
<title>操作结果页面</title>
</head>
<body>
	<center>
		<table border="0" width="100%">
				<tr>
					<td align="center">
						<h3>
							系统提示您
						</h3>
					</td>
				</tr>
				<tr>
					<td style="font-size:14px;" align="center">
						消息：
						<font color="red">
							<s:property value="msg.message" />
						</font>
					</td>
				</tr>
				<s:if test="msg.url!=null&&msg.url!=''">
					<tr>
						<td colspan="2" style="padding-top:40px;font-size:14px;" align="center">
							<s:else>
								点
								<a style="text-decoration: none" href="<s:property value="msg.url" />">
									<font color="blue"><b>这里</b></font>
								</a>跳转
							</s:else>
						</td>
					</tr>
				</s:if>
			</table>
	</center>
</body>
</html>
