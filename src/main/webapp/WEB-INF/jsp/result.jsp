<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>网盘--电子政务文档管理系统</title>

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="javascript/prototype.js" type="text/javascript">
	
</script>
<script type="text/javascript" src="javascript/common.js">
	
</script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<form action="upload_page.action" method="post" name="uploadForm">
		<input type="hidden" value="" name="uploadPath" />
	</form>
	<iframe src="" id="downloadFrame" style="visibility: hidden; height: 0px; width: 0px"></iframe>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<nav class="navbar navbar-default" role="navigation">
					<div class="navbar-header">

						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
							<span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span
								class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#"> <!-- 
						<img src="images/MyLogo-B.png" height="40" width="40" />
						 --> 电子政务文档管理系统
						</a>
					</div>

					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav">
							<li class="active"><a href="#">个人文档</a></li>
							<li><a href="#">部门文档</a></li>

							<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">人员管理<strong
									class="caret"></strong></a>
								<ul class="dropdown-menu">
									<li><a href="#">查看部门构成</a></li>
									<li class="divider"></li>
									<li><a href="register_page.action">添加新成员</a></li>
								</ul></li>
						</ul>
						<ul class="nav navbar-nav navbar-right">
							<form class="navbar-form navbar-left" role="search">
								<div class="form-group">
									<input type="text" class="form-control" />
								</div>
								<button type="submit" class="btn btn-default">搜索</button>
							</form>
							<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">username<span
									class="badge">4</span><strong class="caret"></strong></a>
								<ul class="dropdown-menu">
									<li><a href="#">个人信息</a></li>
									<li><a href="#">站内信箱</a></li>
									<li><a href="#">文件推送</a></li>
									<li class="divider"></li>
									<li><a href="#" id="btn_relogin" onClick="relogin()">退出</a></li>
								</ul></li>
						</ul>
					</div>

				</nav>
				<div class="row">
					<div class="col-md-12">
						<div class="row">
							<div class="col-md-4"></div>
							<div class="col-md-4">
								<h3 class="text-center text-success">
									<s:property value='result' />
								</h3>
							</div>
							<div class="col-md-4"></div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="js/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>