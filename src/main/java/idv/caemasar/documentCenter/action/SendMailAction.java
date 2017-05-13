package idv.caemasar.documentCenter.action;

import java.util.List;

import idv.caemasar.documentCenter.entity.Mail;
import idv.caemasar.documentCenter.service.MailService;

public class SendMailAction extends BaseAction {
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
			return SUCCESS;
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return ERROR;
	}
}
