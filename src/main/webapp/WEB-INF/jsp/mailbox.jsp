<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>人员管理--电子政务文档管理系统</title>

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="javascript/mailbox.js"></script>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<c:set var="choosestr" value="persl_magnt" scope="page" />
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<%@include file="navbar.jsp"%>
				<div class="col-md-12">
					<div class="row">
						<div class="col-md-1"></div>
						<div class="col-md-5" id="in_mails">
						<!-- 
							<h3 class="text-primary text-center">收件箱</h3>
							<div class="panel-group" id="panel-87564">
								<div class="panel panel-default">
									<div class="panel-heading">
										<a class="panel-title" data-toggle="collapse" data-parent="#panel-87564" href="#panel-element-865909">发件人</a>
									</div>
									<div id="panel-element-865909" class="panel-collapse collapse in">
										<div class="panel-body">内容</div>
									</div>
								</div>
								
							</div>
						 -->
						</div>
						<div class="col-md-5" id="sent_mails">
						<!-- 
							<h3 class="text-success text-center">发件箱</h3>
							<div class="panel-group" id="panel-918632">
								<div class="panel panel-default">
									<div class="panel-heading">
										<a class="panel-title" data-toggle="collapse" data-parent="#panel-918632" href="#panel-element-893614">收件人</a>
									</div>
									<div id="panel-element-893614" class="panel-collapse collapse in">
										<div class="panel-body">内容</div>
									</div>
								</div>
								
							</div>
						 -->
						</div>
						<div class="col-md-1"></div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript">
	jsonLoadInMails();
	jsonLoadSentMails();
	</script>
</body>
</html>