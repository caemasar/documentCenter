package idv.caemasar.documentCenter.action;

import idv.caemasar.documentCenter.service.MailService;

public class MailBoxAction extends BaseAction {
	public String execute() throws Exception
	{
		try
		{
			return SUCCESS;
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return ERROR;
	}
}
