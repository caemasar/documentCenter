<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
				<%@include file="navbar.jsp"%>
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