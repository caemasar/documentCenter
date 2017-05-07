<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>用户登录--电子政务文档管理系统</title>

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
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
						<a class="navbar-brand" href="#"> <!-- 
						<img src="images/MyLogo-B.png" height="40" width="40" />
						 --> 电子政务文档管理系统
						</a>
					</div>

					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1"></div>

				</nav>
				<div class="row">
					<div class="col-md-8">
						<center>
							<img src="images/MyLogo-R.png" height="400" width="400" />
						</center>

					</div>
					<div class="col-md-4">
						<div class="row">
							<div class="col-md-1"></div>
							<div class="col-md-9">
								<center>
									<FONT color="red"><s:fielderror /></FONT>
								</center>
								<form role="form" action="login.action" id="subform" method="post">

									<div class="form-group">

										<label for="user"> 用户名 </label> <input type="text" class="form-control" id="user" placeholder="请输入用户名"
											name="user" />
									</div>
									<div class="form-group">

										<label for="password"> 密码 </label> <input type="password" class="form-control" id="password"
											placeholder="请输入密码" name="password" />
									</div>
									<div class="form-group">

										<label for="validationCode"> 验证码 </label> <input type="text" class="form-control" id="validationCode"
											placeholder="请输入验证码" name="validationCode" />
									</div>
									<div class="form-group">
										<span><label for="img_validation_code"> 用户验证码： </label> <a href="#" onClick="refresh()"><img
												id="img_validation_code" src="validate_code.action" /> <span>重新获得验证码</span></a></span>
									</div>
									<div class="checkbox">

										<label> <input type="checkbox" checked="checked" name="checked" /> 记住密码
										</label>
									</div>
									<button type="submit" class="btn btn-primary btn-lg btn-block">登录</button>
									<p class="help-block">
										<a>忘记密码</a>？
									</p>

								</form>
							</div>
							<div class="col-md-2"></div>
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