package idv.caemasar.documentCenter.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import idv.caemasar.documentCenter.dao.DepartmentDAO;
import idv.caemasar.documentCenter.entity.DcTDepartments;
import idv.caemasar.documentCenter.entity.File;

public class DepartmentDAOImpl extends HibernateDaoSupport implements DepartmentDAO {

	@Override
	public DcTDepartments getDepartment(int dept_id) {
		@SuppressWarnings("unchecked")
		List<DcTDepartments> DcTDepartmentss = (List<DcTDepartments>) this.getHibernateTemplate().findByNamedParam(
				"from DcTDepartments where dept_id = :dept_id", new String[] { "dept_id" }, new Object[] { dept_id });
		if (DcTDepartmentss.size() > 0) {
			return DcTDepartmentss.get(0);
		}
		return null;

	}

	@Override
	public List<DcTDepartments> getSubDepartment(int dept_id) {
		@SuppressWarnings("unchecked")
		List<DcTDepartments> DcTDepartmentss = (List<DcTDepartments>) this.getHibernateTemplate().findByNamedParam(
				"from DcTDepartments where dept_super = :dept_id", new String[] { "dept_id" }, new Object[] { dept_id });
		if (DcTDepartmentss.size() > 0) {
			return DcTDepartmentss;
		}
		return null;
	}

}
