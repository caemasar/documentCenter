<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>创建新目录--电子政务文档管理系统</title>

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<script type="text/javascript" src="javascript/prototype.js"></script>
<script type="text/javascript" src="javascript/common.js"></script>
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
				<form class="form-horizontal" role="form" id="form_dir" method="post">
					<div class="form-group">

						<label for="dir" class="col-sm-2 control-label"> 请输入文件夹名称 </label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="dir" name="dir" />
						</div>
					</div>
					<div class="form-group">
						<label for="dir" class="col-sm-2 control-label"> 当前路径  :</label><label for="dir" class="col-sm-9 control-label"
							id="lbl_path"></label>
						<div class="col-sm-1">
							<input type="hidden" name="parentPath" id="parentPath" class="form-control" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">

							<button class="btn btn-success btn-lg" onclick="jsonCreateDir()">确定</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		var path = window.dialogArguments.path;
		var parentWindow = window.dialogArguments.window;
		
		var lbl_path = document.getElementById("lbl_path");
		var parentPath = document.getElementById("parentPath");
		lbl_path.innerHTML = path;
		parentPath.value = path;
	</script>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="js/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>