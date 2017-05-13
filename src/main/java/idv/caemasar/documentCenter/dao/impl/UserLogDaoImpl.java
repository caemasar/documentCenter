package idv.caemasar.documentCenter.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import idv.caemasar.documentCenter.dao.UserLogDao;
import idv.caemasar.documentCenter.entity.DcTUserLog;
import idv.caemasar.documentCenter.entity.DcTUsers;

public class UserLogDaoImpl extends HibernateDaoSupport implements UserLogDao {

	@Override
	public void recordUser(int u_id, String addr) {

		@SuppressWarnings("unchecked")
		java.util.List<DcTUsers> dcTUserss = (List<DcTUsers>) this.getHibernateTemplate().findByNamedParam(
				"from DcTUsers where UId = :UId", new String[] { "UId" }, new Object[] { u_id });
		DcTUsers dcTUsers = null;
		if (dcTUserss.size() > 0){
			dcTUsers = dcTUserss.get(0);
		}
		
		DcTUserLog dcTUserLog = new DcTUserLog();
		dcTUserLog.setDcTUsers(dcTUsers);
		dcTUserLog.setUlogTime(new Date());
		dcTUserLog.setUlogIp(addr);
		
		this.getHibernateTemplate().save(dcTUserLog);
		
	}

}
