package idv.caemasar.documentCenter.action;

import java.util.Date;

import com.opensymphony.xwork2.ModelDriven;

import idv.caemasar.documentCenter.entity.Mail;
import idv.caemasar.documentCenter.service.MailService;

public class SendMailAction extends BaseAction implements ModelDriven<Mail> {
	private Mail mail = new Mail();

	public String execute() throws Exception {
		try {
			MailService mailService = serviceManager.getMailService();
			mail.setMail_from_userid(Integer.parseInt(getCookieValue("u_id")));
			mail.setMail_sendtime(new Date());
System.out.println(mail);
			mailService.sendMail(mail);
			return SUCCESS;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return ERROR;
	}

	@Override
	public Mail getModel() {
		return mail;
	}
}
