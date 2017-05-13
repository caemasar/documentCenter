<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>站内信箱--电子政务文档管理系统</title>

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
	<c:set var="choosestr" value="mailbox" scope="page" />
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
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">写邮件</h4>
				</div>
				<div class="modal-body">

					<div class="container-fluid">
						<div class="row">
							<div class="col-md-12">
								<form role="form" action="send_mail.action" method="post">
									<div class="form-group">

										<label for="mail_to_userid"> 收件人 </label> <input type="text" class="form-control" id="mail_to_userid"
											name="mail_to_userid" />
									</div>
									<div class="form-group">

										<label for="mail_letter"> 信件内容 </label>
										<textarea class="form-control" name="mail_letter" id="mail_letter" rows="3"></textarea>
									</div>

									<button type="submit" class="btn btn-success">发送</button>
									<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
								</form>
							</div>
						</div>
					</div>

				</div>
				<div class="modal-footer"></div>
			</div>
			<!-- /.modal-content -->
		</div>
	</div>
	<!-- /.modal -->

</body>
</html>