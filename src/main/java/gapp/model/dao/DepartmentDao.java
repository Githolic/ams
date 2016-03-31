package gapp.model.dao;

import java.util.List;
import gapp.model.Department;


public interface DepartmentDao {
	
	 Department getDepartment( Integer id );

	 List<Department> getDepartments();
	 
	 Department getDepartment( String departmentname);

}
