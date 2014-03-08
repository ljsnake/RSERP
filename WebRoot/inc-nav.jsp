<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=7" />
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="Cache-Control" content="no-cache, must-revalidate" />
		<meta http-equiv="expires" content="0" />
		<title>TaxiFee</title>
		<link href="resource/css/main.css" rel="stylesheet" type="text/css" />
		<script src="resource/js/jquery-1.4.2.min.js" type="text/javascript"></script>
		<script src="resource/js/jquery.treeview.js" type="text/javascript"></script>
		<link href="resource/css/jquery.treeview.css" rel="stylesheet" type="text/css" />
		<script language="javascript">
		$().ready(function() {
			if($.browser.msie&&($.browser.version == "6.0")){
				$(".inc-nav-body").addClass("inc-nav-body-67");
      		}
			//树状菜单生成 JQuery Treeview
			$(".filetree").treeview( {
				//animated菜单展开关闭时动画效果
				animated : "medium",
        		//collapsed菜单载入时关闭还是展开
				collapsed: false
        		//unique同一层次是否只允许展开一个
				//unique: true
			});
			$(".nav-box").hide();
			$(".nav-box:first").show();
		});
		function urlTarget(urls) {
			$("#content-box",parent.document.body).attr("src",urls);
		}
		</script>
	</head>
	<body style="overflow: hidden;">
		<div class="inc-nav-body">
				<div id="div1" class="nav-box">
					<ul id="browser" class="filetree">
							<li>
								<span class="folder">通告栏</span>
								<ul>
										<li>
											<span class="file">
												<a onclick="urlTarget('tggl_show.action');" title="查看通告栏">查看通告</a>
												<br/>
											</span>
										</li>
								</ul>
							</li>
							<li>
								<span class="folder">合同管理</span>
								<ul>
										<li>
											<span class="file">
												<a onclick="urlTarget('htgl_fbdwList.action');" title="列表分包单位">分包单位列表</a>
												<br/>
											</span>
										</li>
										<li>
											<span class="file">
												<a onclick="urlTarget('htgl_fbdwAdd.action');" title="添加分包单位">分包单位新增</a>
												<br/>
											</span>
										</li>
								</ul>
							</li>
							
							<li>
								<span class="folder">外经证管理</span>
								<ul>
										<li>
											<span class="file">
												<a onclick="urlTarget('tbErpOutboundbusinesscertificate_list.action');" title="外经证列表">外经证列表</a>
												<br/>
											</span>
										</li>
								</ul>
							</li>
							
							<li>
								<span class="folder">用户管理</span>
								<ul>
										<li>
											<span class="file">
												<a onclick="urlTarget('yhgl_list.action');" title="列表用户">用户列表</a>
												<br/>
											</span>
										</li>
										<li>
											<span class="file">
												<a onclick="urlTarget('yhgl_add.action');" title="添加用户">用户新增</a>
												<br/>
											</span>
										</li>
										<li>
											<span class="file">
												<a onclick="urlTarget('yhgl_updatePassword.action');" title="密码修改">修改密码</a>
												<br/>
											</span>
										</li>
								</ul>
							</li>
					</ul>
				</div>
		</div>
	</body>
</html>