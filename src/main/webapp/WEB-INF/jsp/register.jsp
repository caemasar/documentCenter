<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sd"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<c:set var="choosestr" value="register" scope="page"/>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<%@include file="navbar.jsp"%>
				<div class="row">
					<div class="col-md-12">
						<div class="row">
							<div class="col-md-4"></div>
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