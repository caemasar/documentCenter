<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<link rel="stylesheet" href="css/common.css" />
<link rel="stylesheet" href="css/register.css" />
<title>用户登录</title>

<script type="text/javascript">
	function refresh() {
		var img = document.getElementById("img_validation_code")
		img.src = "validate_code.action?" + Math.random();
	}
</script>
</head>
<body>
	<div class="box">
		<div class="nav cl">
			<div class="nav_z z">
				<img src="images/register01.png" />
			</div>
			<div class="nav_y y">
				<a href="">关于我们</a> <span>丨</span> <a href="">联系我们</a>
			</div>
		</div>
		<div class="main cl">
			<div class="main_z z">
				<img src="images/register02.png" />
			</div>
			<div class="main_y y">
				<div class="main_y_title">欢迎使用</div>
				<div class="meta">
					<FONT color="red"><s:fielderror /></FONT>
				</div>
				<div class="main_y_content">
					<s:form action="login" id="subform">
						<div class="main_input">
							<input type="text" placeholder="请输入用户名" class="phone" name="user" maxlength="11" />
							<img src="images/register03.png" />
						</div>
						<div class="main_input">
							<input type="password" placeholder="请输入密码" class="password" name="password" maxlength="18" />
							<img src="images/register03.png" />
						</div>
						<div class="main_input">
							<input type="text" placeholder="请输入验证码" class="validationCode" name="validationCode" maxlength="5" />
							<img src="images/register03.png" />
						</div>
						<div class="validationCodeDiv">
							<span>用户验证码：</span>
							<img id="img_validation_code" src="validate_code.action" />
							<a href="#" onClick="refresh()"><span>重新获得验证码</span></a>
						</div>
						<div class="remember_password">
							<input type="checkbox" checked="checked" name="checked" class="examine" />
							<span>记住密码</span>
						</div>
						<a href="#" name="submit" onclick="document.getElementById('subform').submit();return false">
							<div class="register">登&nbsp;录</div>
						</a>
						<div class="main_y_content_buttom">
							<a href="">忘记密码?</a>
						</div>

					</s:form>
				</div>
			</div>
		</div>
		<div class="footer">2016 youlianyun inc. All Rights Reserved</div>
	</div>
	<script type="text/javascript" src="js/jquery-2.2.3.min.js"></script>
	<script type="text/javascript" src="js/register.js"></script>
</body>
</html>
