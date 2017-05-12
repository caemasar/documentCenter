package idv.caemasar.documentCenter.dao;

import java.util.List;

import idv.caemasar.documentCenter.entity.DcTDepartments;

public interface DepartmentDAO {

	public DcTDepartments getDepartment(int dept_id);

	public List<DcTDepartments> getSubDepartment(int dept_id);

}
