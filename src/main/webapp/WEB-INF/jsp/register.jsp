<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sd"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>新用户--电子政务文档管理系统</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <s:head theme="xhtml" />
<sd:head parseContent="true" />
<script type="text/javascript">
	function refresh() {
		var img = document.getElementById("img_validation_code")
		img.src = "validate_code.action?" + Math.random();
	}
</script>
  </head>
  <body>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<nav class="navbar navbar-default" role="navigation">
					<div class="navbar-header">

						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
							<span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span
								class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="main_page.action">
						<!-- 
						<img src="images/MyLogo-B.png" height="40" width="40" />
						 -->
						 电子政务文档管理系统
						 </a>
					</div>

					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav">
							<li class="active">
								<a href="#">个人文档</a>
							</li>
							<li>
								<a href="#">部门文档</a>
							</li>
							
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">人员管理<strong
									class="caret"></strong></a>
								<ul class="dropdown-menu">
									<li>
										<a href="#">查看部门构成</a>
									</li>
									<li class="divider"></li>
									<li>
										<a href="#">添加新成员</a>
									</li>
								</ul>
							</li>
						</ul>
						<ul class="nav navbar-nav navbar-right">
							<form class="navbar-form navbar-left" role="search">
								<div class="form-group">
									<input type="text" class="form-control" />
								</div>
								<button type="submit" class="btn btn-default">搜索</button>
							</form>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown"><%=session.getAttribute("username")%><span class="badge">4</span><strong
									class="caret"></strong></a>
								<ul class="dropdown-menu">
									<li>
										<a href="#">个人信息</a>
									</li>
									<li>
										<a href="#">站内信箱</a>
									</li>
									<li>
										<a href="#">文件推送</a>
									</li>
									<li class="divider"></li>
									<li>
										<a href="#" id="btn_relogin" onClick="relogin()">退出</a>
									</li>
								</ul>
							</li>
						</ul>
					</div>

				</nav>
			<div class="row">
				<div class="col-md-12">
					<div class="row">
						<div class="col-md-4">
						</div>
						<div class="col-md-4">
								<form role="form" action="register.action" method="post">
									<div class="form-group">

										<label for="user"> 用户名 </label> <input type="text" class="form-control" id="user" name="user" required="true"
											value="" placeholder="请输入新用户名" />
									</div>
									<div class="form-group">

										<label for="password"> 密码 </label> <input type="password" class="form-control" id="password" name="password"
											required="true" placeholder="请输入新用户密码" />
									</div>
									<div class="form-group">

										<label for="repassword"> 请再次输入密码 </label> <input type="password" class="form-control" id="repassword"
											name="repassword" required="true" placeholder="请再次输入新用户密码" />
									</div>
									<div class="form-group">

										<label for="xm"> 姓名 </label> <input type="text" class="form-control" id="xm" name="xm" value=""
											placeholder="请输入新用户真实姓名" />
									</div>
									<div class="form-group">

										<label for="email"> 邮箱地址 </label> <input type="text" class="form-control" id="email" name="email" value=""
											placeholder="请输入新用户邮箱地址" />
									</div>
									<div class="form-group">

										<label for="phone"> 电话 </label> <input type="text" class="form-control" id="phone" name="phone"
											placeholder="请输入新用户电话" />
									</div>
									<div class="form-group">

										<label for="qq"> QQ </label> <input type="text" class="form-control" id="qq" name="qq" value=""
											placeholder="请输入新用户QQ" />
									</div>
									<div class="form-group">

										<label for="validationCode"> 验证码 </label> <input type="text" class="form-control" id="validationCode"
											placeholder="请输入验证码" name="validationCode" />
									</div>
									<div class="form-group">
										<span><label for="img_validation_code"> 用户验证码： </label> <a href="#" onClick="refresh()"><img
												id="img_validation_code" src="validate_code.action" /> <span>重新获得验证码</span></a></span>
									</div>
									<!--
								<div class="form-group">
									 
									<label for="exampleInputFile">
										File input
									</label>
									<input type="file" id="exampleInputFile" />
									<p class="help-block">
										Example block-level help text here.
									</p>
								</div>
								-->
									<button type="submit" class="btn btn-success btn-lg btn-block">注册</button>
								</form>
							</div>
						<div class="col-md-4">
						</div>
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