package idv.caemasar.documentCenter.action;

import java.util.List;

import idv.caemasar.documentCenter.entity.Mail;
import idv.caemasar.documentCenter.service.MailService;
import idv.caemasar.documentCenter.service.UserService;

public class InMailsAction extends BaseAction {
	private List<Mail> mails;
	
	public List<Mail> getMails() {
		return mails;
	}

	public void setMails(List<Mail> mails) {
		this.mails = mails;
	}

	public String execute() throws Exception
	{
		try
		{
			MailService mailService = serviceManager.getMailService();
			mails = mailService.getInMails(Integer.parseInt(getCookieValue("u_id")));
			UserService userService = serviceManager.getUserService();
			for (Mail mail : mails) {
				String formUsername = userService.getUsernameByID(mail.getMail_from_userid());
				mail.setMail_from_username(formUsername);
				String toUsername = userService.getUsernameByID(mail.getMail_to_userid());
				mail.setMail_to_username(toUsername);
				
			}
			return SUCCESS;
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return ERROR;
	}
}
