<%@ page language="java" pageEncoding="UTF-8"%>
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
<c:set var="choosestr" value="main" scope="page"/>
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
							<div class="col-md-12">
								<div class="btn-group" id="crud_bt">
									<c:choose>
										<c:when test="${param.current_path == null}">
											<input type="hidden" value="/" name="txt_path" id="txt_path" />
										</c:when>
										<c:otherwise>
											<input type="hidden" value="${param.current_path}" name="txt_path" id="txt_path" />
										</c:otherwise>
									</c:choose>
									<button class="btn btn-default" type="button" id="btn_previous" onclick="toPrevious()">
										<em class="glyphicon glyphicon-arrow-left"></em> 返回上一级
									</button>
									<button class="btn btn-default" type="button" id="btn_upload" onclick="goUpload()">
										<em class="glyphicon glyphicon-upload"></em> 上传
									</button>
									<button class="btn btn-default" type="button" id="btn_download" onclick="downloadMoreFile()">
										<em class="glyphicon glyphicon-download"></em> 下载
									</button>
									<button class="btn btn-default" type="button" id="btn_create_dir" onClick="showCreateDirDialog()">
										<em class="glyphicon glyphicon-inbox"></em> 创建目录
									</button>
									<button class="btn btn-default" type="button" id="btn_delete" onClick="deletePath()">
										<em class="glyphicon glyphicon-trash"></em> 删除
									</button>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<span id="div_current_path" class="label label-default">当前路径：</span>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<table id="tbl_list" class="table table-hover">
									<thead>
										<tr>
											<th><input type="checkbox" id="checkbox_head" onclick="checkAll(this);" /> &nbsp;目录</th>
											<th>上传时间</th>
											<th>大小</th>
										</tr>
									</thead>
									<tbody>

									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		jsonLoadDirAndFile();
		showCurrentPath();
	</script>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="js/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>