//查看收件箱开始
function jsonLoadInMails() {
	// clearDeptList("dept_member_list");

	var action_url = 'inMails.action';
	var myAjax = $.ajax({
		url : action_url,
		type : 'POST',
		success : function(msg) {
			console.log(msg);
			processLoadInMails(msg);
		}
	});

}
function processLoadInMails(msg) {

	loadInMails(msg);
}
function loadInMails(msg) {
	var in_mails = eval('(' + msg + ')');
	var this_box = $("#in_mails");
	this_box.html(packageInMails(in_mails));
}
function packageInMails(in_mails) {
	var result = "<h3 class='text-primary text-center'>收件箱</h3>";

	for ( var iter_in_mails in in_mails) {
		result = result
				+ "<div class='panel-group' id='panel-"
				+ in_mails[iter_in_mails].mail_id
				+ "'>"
				+ "<div class='panel panel-default'>"
				+ "<div class='panel-heading'>"
				+ "<a class='panel-title' data-toggle='collapse' data-parent='#panel-"
				+ in_mails[iter_in_mails].mail_id + "' href='#panel-element-"
				+ in_mails[iter_in_mails].mail_id + "'>发件人："
				+ in_mails[iter_in_mails].mail_from_username
				+ "&nbsp;&nbsp;&nbsp;&nbsp;"
				+ in_mails[iter_in_mails].mail_sendtime + "</a>" + "</div>"
				+ "<div id='panel-element-" + in_mails[iter_in_mails].mail_id
				+ "' class='panel-collapse collapse in'>"
				+ "<div class='panel-body'>"
				+ in_mails[iter_in_mails].mail_letter + "</div>" + "</div>"
				+ "</div>" +

				"</div>";
	}
	return result;
}

// 查看收件箱结束
// 查看发件箱开始
function jsonLoadSentMails() {
	// clearDeptList("dept_member_list");

	var action_url = 'sentMails.action';
	var myAjax = $.ajax({
		url : action_url,
		type : 'POST',
		success : function(msg) {
			console.log(msg);
			processLoadSentMails(msg);
		}
	});

}
function processLoadSentMails(msg) {

	loadSentMails(msg);
}
function loadSentMails(msg) {
	var sent_mails = eval('(' + msg + ')');
	var this_box = $("#sent_mails");
	this_box.html(packageSentMails(sent_mails));
}
function packageSentMails(sent_mails) {
	var result = "<h3 class='text-success text-center'>发件箱</h3>";

	for ( var iter_sent_mails in sent_mails) {
		result = result
				+ "<div class='panel-group' id='panel-"
				+ sent_mails[iter_sent_mails].mail_id
				+ "'>"
				+ "<div class='panel panel-default'>"
				+ "<div class='panel-heading'>"
				+ "<a class='panel-title' data-toggle='collapse' data-parent='#panel-"
				+ sent_mails[iter_sent_mails].mail_id
				+ "' href='#panel-element-"
				+ sent_mails[iter_sent_mails].mail_id + "'>收件人："
				+ sent_mails[iter_sent_mails].mail_to_username
				+ "&nbsp;&nbsp;&nbsp;&nbsp;"
				+ sent_mails[iter_sent_mails].mail_sendtime + "</a>" + "</div>"
				+ "<div id='panel-element-"
				+ sent_mails[iter_sent_mails].mail_id
				+ "' class='panel-collapse collapse in'>"
				+ "<div class='panel-body'>"
				+ sent_mails[iter_sent_mails].mail_letter + "</div>" + "</div>"
				+ "</div>" +

				"</div>";
	}
	return result;
}

// 查看发件箱结束
