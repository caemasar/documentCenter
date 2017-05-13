package idv.caemasar.documentCenter.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import idv.caemasar.documentCenter.dao.MailDAO;
import idv.caemasar.documentCenter.entity.Mail;

public class MailDAOImpl extends HibernateDaoSupport implements MailDAO {

	@Override
	public List<Mail> getInMails(int u_id) {
		@SuppressWarnings("unchecked")
		List<Mail> mails = (List<Mail>) this.getHibernateTemplate().findByNamedParam(
				"from Mail where mail_to_userid = :mail_to_userid order by mail_sendtime desc",
				new String[] { "mail_to_userid" }, new Object[] { u_id });
		if (mails.size() > 0) {
			return mails;
		}
		return null;
	}

	@Override
	public List<Mail> getSentMails(int u_id) {
		@SuppressWarnings("unchecked")
		List<Mail> mails = (List<Mail>) this.getHibernateTemplate().findByNamedParam(
				"from Mail where mail_from_userid = :mail_from_userid order by mail_sendtime desc",
				new String[] { "mail_from_userid" }, new Object[] { u_id });
		if (mails.size() > 0) {
			return mails;
		}
		return null;
	}

	@Override
	public void sendMail(Mail mail) {
		this.getHibernateTemplate().save(mail);
	}

}
