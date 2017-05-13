package idv.caemasar.documentCenter.service;

import java.util.List;

import idv.caemasar.documentCenter.entity.Mail;

public interface MailService {
	public List<Mail> getInMails(int u_id);

	public List<Mail> getSentMails(int u_id);

	public void sendMail(Mail mail);
}
