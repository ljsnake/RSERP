<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">  
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=7" />
		<title>TaxiFee</title>
		<style>
 			html,body { overflow:hidden;} 
		</style>
		<link href="resource/css/main.css" rel="stylesheet" type="text/css" media="all" />
		<link href="resource/css/style.css" rel="stylesheet" type="text/css" media="all" />
		<script src="resource/js/jquery-1.4.2.min.js" type="text/javascript"></script>
		<script src="resource/js/jquery.onlyforindex.js" type="text/javascript"></script>
		<script type="text/javascript">
// 		$(document).ready(function(){
// 			$("#toggleTd").click();
// 		})
		</script>
	</head>
	<body class="content-pages-body">
		<div id="header-wrap">
			<iframe allowtransparency="true" frameborder="0" id="header-box" scrolling="no" src="top.jsp"></iframe>
		</div>
		<div id="main-wrap">
			<div id="main-nav">
				<iframe frameborder="0" name="siderbar-box" id="siderbar-box" scrolling="auto" src="inc-nav.jsp"></iframe>
			</div>
			<div id="main-content">
				<table border="0" cellpadding="0" cellspacing="0"
					id="main-content-box">
					<tr>
						<td class="toggle" id="toggleTd"></td>
						<td class="content-wrap" style="overflow:none;">
							<iframe frameborder="0" id="content-box"src="welcome.jsp" scrolling="auto"></iframe>
						</td>
					</tr>
				</table>
			</div>
		</div>
	</body>
</html>
