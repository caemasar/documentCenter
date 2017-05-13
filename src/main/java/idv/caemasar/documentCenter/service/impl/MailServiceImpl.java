package idv.caemasar.documentCenter.service.impl;

import java.util.List;

import idv.caemasar.documentCenter.dao.MailDAO;
import idv.caemasar.documentCenter.entity.Mail;
import idv.caemasar.documentCenter.service.MailService;

public class MailServiceImpl implements MailService {
	private MailDAO mailDao;

	public MailServiceImpl(MailDAO mailDao) {
		this.mailDao = mailDao;
	}

	@Override
	public List<Mail> getInMails(int u_id) {
		return mailDao.getInMails(u_id);
	}

	@Override
	public List<Mail> getSentMails(int u_id) {
		return mailDao.getSentMails(u_id);
	}

	@Override
	public void sendMail(Mail mail) {
		mailDao.sendMail(mail);

	}

}
