package idv.caemasar.documentCenter.service;

import java.util.List;

import idv.caemasar.documentCenter.entity.DcTDepartments;

public interface DepartmentService {

	public DcTDepartments getDepartment(int dept_id);

	public List<DcTDepartments> getSubDepartment(int dept_id);

}
