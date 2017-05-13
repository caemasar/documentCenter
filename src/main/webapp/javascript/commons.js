//查看部门开始
function clearDeptList(dept_member_list) {
	var div_dept_member_list = document.getElementById(dept_member_list);
	var children = div_dept_member_list.childNodes;
	var childnum = children.length;
	for (var j = 0; j < childnum; j++) {
		div_dept_member_list.removeChild(div_dept_member_list.firstChild);
	}

}
function jsonLoadDeptInfoAndMember() {
	clearDeptList("dept_member_list");

	var action_url = 'dept.action';
	var myAjax = $.ajax({
		url : action_url,
		type : 'POST',
		success : function(msg) {
			processLoadDeptInfoAndMember(msg);
		}
	});

}
function processLoadDeptInfoAndMember(msg) {

	loadDeptInfo(msg);
	jsonLoadSubDeptInfo();
	jsonLoadMember();
}
function loadDeptInfo(msg) {
	var deptInfo = eval('(' + msg + ')');
	var this_dept = $("#this_dept");
	this_dept.html(packageDeptInfo(deptInfo));
}
function packageDeptInfo(deptInfo) {
	return "<a onClick='jsonLoadMember(" + deptInfo.dept_id + ")' >"
			+ deptInfo.dept_name + "</a>";
}

// 查看部门结束
// 查看子部门开始
function clearSubDeptList(sub_dept_list) {
	var div_sub_dept_list = document.getElementById(sub_dept_list);
	var children = div_sub_dept_list.childNodes;
	var childnum = children.length;
	for (var j = 0; j < childnum; j++) {
		div_sub_dept_list.removeChild(div_sub_dept_list.firstChild);
	}

}
function jsonLoadSubDeptInfo() {
	clearSubDeptList("sub_dept_list");

	var action_url = 'sub_dept.action';
	var myAjax = $.ajax({
		url : action_url,
		type : 'POST',
		success : function(msg) {
			processLoadSubDeptInfo(msg);
		}
	});

}
function processLoadSubDeptInfo(msg) {
	loadSubDeptInfo(msg);
}
function loadSubDeptInfo(msg) {
	var sub_deptInfo = eval('(' + msg + ')');
	var sub_dept_list = $("#sub_dept_list");
	var div_sub_dept_list = packageSubDeptInfo(sub_deptInfo);
	sub_dept_list.html(div_sub_dept_list);
}
function packageSubDeptInfo(sub_deptInfo) {
	var result = "<ul class='list-group'>";
	for ( var iter_deptInfo in sub_deptInfo) {
		result = result
				+ "<li class='list-group-item'><a onClick='jsonLoadMember("
				+ sub_deptInfo[iter_deptInfo].dept_id + ")'>"
				+ sub_deptInfo[iter_deptInfo].dept_name + "</a></li>";
	}
	result = result + "</ul>";
	return result;
}
// 查看子部门结束
// 查看部门成员开始
/*
 * function clearSubDeptList(sub_dept_list) { var div_sub_dept_list =
 * document.getElementById(sub_dept_list); var children =
 * div_sub_dept_list.childNodes; var childnum = children.length; for (var j = 0;
 * j < childnum; j++) {
 * div_sub_dept_list.removeChild(div_sub_dept_list.firstChild); } }
 */
function jsonLoadMember(dept_id) {
	clearDeptList("dept_member_list");
	var action_url = 'member.action';
	console.log(dept_id);
	var myAjax = $.ajax({
		url : action_url,
		type : 'POST',
		data : {
			deptID : dept_id
		},
		success : function(msg) {
			console.log(msg);
			processLoadMember(msg);
		}
	});

}
function processLoadMember(msg) {
	loadMember(msg);
}
function loadMember(msg) {
	var members = eval('(' + msg + ')');
	var dept_member_list = $("#dept_member_list");
	var div_dept_member_list = packageMember(members);
	dept_member_list.html(div_dept_member_list);
}
function packageMember(members) {
	var result = "";
	for ( var iter_member in members) {
		result = result
				+ "<div class='col-md-4'>"
				+ "<div class='thumbnail'>"
				+ "<img alt='员工照片' src='http://lorempixel.com/output/people-q-c-600-200-1.jpg' />"
				+ "<div class='caption'>"
				+ "<h3>"
				+ members[iter_member].u_realname
				+ "</h3>"
				+ "<p>"
				+ members[iter_member].u_phone
				+ "</p><p>"
				+ members[iter_member].u_email
				+ "</p><p>"
				+ "<a class='btn btn-primary' href='#' data-toggle='modal' data-target='#myModal'>管理权限</a>"
				+ "<a class='btn' href='#'>查看</a><a class='btn' href='#'>删除</a>"
				+ "</p></div></div></div>";
	}
	return result;
}
// 查看部门成员结束
function relogin() {
	document.location = "relogin.action"
}