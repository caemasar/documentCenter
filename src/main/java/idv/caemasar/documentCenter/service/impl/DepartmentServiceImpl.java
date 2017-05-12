package idv.caemasar.documentCenter.service.impl;

import java.util.List;

import idv.caemasar.documentCenter.dao.DepartmentDAO;
import idv.caemasar.documentCenter.entity.DcTDepartments;
import idv.caemasar.documentCenter.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
	private DepartmentDAO departmentDAO;
	
	public DepartmentServiceImpl(DepartmentDAO departmentDAO) {
		this.departmentDAO = departmentDAO;
	}

	@Override
	public DcTDepartments getDepartment(int dept_id) {
		
		return departmentDAO.getDepartment(dept_id);
	}

	@Override
	public List<DcTDepartments> getSubDepartment(int dept_id) {
		return departmentDAO.getSubDepartment(dept_id);
	}

}
