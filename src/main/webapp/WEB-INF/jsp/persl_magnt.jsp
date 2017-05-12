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
<script type="text/javascript" src="javascript/commons.js"></script>
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
				<div class="row">
					<div class="col-md-1"></div>
					<div class="col-md-3">
						<div class="panel-group" id="panel-713542">
							<div class="panel panel-default">
								<div class="panel-heading">
									<a class="panel-title" data-toggle="collapse" data-parent="#panel-713542" href="#panel-element-992124">本部门</a>
								</div>
								<div id="panel-element-992124" class="panel-collapse collapse in">
									<div class="panel-body" id="this_dept"></div>
								</div>
							</div>
							<div class="panel panel-default">
								<div class="panel-heading">
									<a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-713542"
										href="#panel-element-961344" id="sub_dept">下属部门</a>
								</div>
								<div id="panel-element-961344" class="panel-collapse collapse">
									<div class="panel-body" id="sub_dept_list">
										<a onClick="">1</a>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-7" id="dept_member_list">
						<div class="row">
							<div class="col-md-4">
								<div class="thumbnail">
									<img alt="Bootstrap Thumbnail First" src="http://lorempixel.com/output/people-q-c-600-200-1.jpg" />
									<div class="caption">
										<h3>张三</h3>
										<p>001</p>
										<p>
											<a class="btn btn-primary" href="#">管理权限</a>
											<a class="btn" href="#">查看</a>
											<a class="btn" href="#">删除</a>
										</p>
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<div class="thumbnail">
									<img alt="Bootstrap Thumbnail First" src="http://lorempixel.com/output/people-q-c-600-200-1.jpg" />
									<div class="caption">
										<h3>张三</h3>
										<p>001</p>
										<p>
											<a class="btn btn-primary" href="#">管理权限</a>
											<a class="btn" href="#">查看</a>
											<a class="btn" href="#">删除</a>
										</p>
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<div class="thumbnail">
									<img alt="Bootstrap Thumbnail First" src="http://lorempixel.com/output/people-q-c-600-200-1.jpg" />
									<div class="caption">
										<h3>张三</h3>
										<p>001</p>
										<p>
											<a class="btn btn-primary" href="#">管理权限</a>
											<a class="btn" href="#">查看</a>
											<a class="btn" href="#">删除</a>
										</p>
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<div class="thumbnail">
									<img alt="Bootstrap Thumbnail First" src="http://lorempixel.com/output/people-q-c-600-200-1.jpg" />
									<div class="caption">
										<h3>张三</h3>
										<p>001</p>
										<p>
											<a class="btn btn-primary" href="#">管理权限</a>
											<a class="btn" href="#">查看</a>
											<a class="btn" href="#">删除</a>
										</p>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-1"></div>
				</div>
			</div>
		</div>
		<script type="text/javascript">
			jsonLoadDeptInfoAndMember();
		</script>
</body>
</html>