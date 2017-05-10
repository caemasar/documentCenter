<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav class="navbar navbar-default" role="navigation">
	<div class="navbar-header">

		<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
			<span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span
				class="icon-bar"></span>
		</button>
		<a class="navbar-brand" href="main_page.action"> <!-- 
						<img src="images/MyLogo-B.png" height="40" width="40" />
						 --> 电子政务文档管理系统
		</a>
	</div>

	<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		<ul class="nav navbar-nav">
			<c:choose>
				<c:when test="${choosestr == 'main'}">
					<li class="active"><a href="main_page.action">个人文档</a></li>
				</c:when>
				<c:otherwise>
					<li><a href="main_page.action">个人文档</a></li>
				</c:otherwise>
			</c:choose>
			<li><a href="#">部门文档</a></li>
			<c:choose>
				<c:when test="${choosestr == 'register'}">
					<li class="dropdown active"><a href="#" class="dropdown-toggle" data-toggle="dropdown">人员管理<strong
							class="caret"></strong></a>
				</c:when>
				<c:otherwise>
					<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">人员管理<strong class="caret"></strong></a>
				</c:otherwise>
			</c:choose>

			<ul class="dropdown-menu">
				<li><a href="#">查看部门构成</a></li>
				<li class="divider"></li>
				<li><a href="register_page.action">添加新成员</a></li>
			</ul>
			</li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<form class="navbar-form navbar-left" role="search">
				<div class="form-group">
					<input type="text" class="form-control" id="kwy_word"/>
				</div>
				<a class="btn btn-default" onclick="jsonLoadSearchFile()">搜索</a>
			</form>
			<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><%=session.getAttribute("username")%><span
					class="badge">4</span><strong class="caret"></strong></a>
				<ul class="dropdown-menu">
					<li><a href="#">个人信息</a></li>
					<li><a href="#">站内信箱</a></li>
					<li><a href="#">文件推送</a></li>
					<li class="divider"></li>
					<li><a href="#" id="btn_relogin" onClick="relogin()">退出</a></li>
				</ul></li>
		</ul>
	</div>

</nav>