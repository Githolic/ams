package gapp.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import gapp.model.Department;
import gapp.model.dao.DepartmentDao;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Department getDepartment(Integer id) {

		return entityManager.find(Department.class, id);
	}

	@Override
	public List<Department> getDepartments() {

		return entityManager.createQuery("from Department order by id", Department.class).getResultList();
	}

	@Override
	public Department getDepartment(String departmentname) {

		Department department = null;
		List<Department> departments = getDepartments();
		for (int i = 0; i < departments.size(); i++) {
			if (departments.get(i).getDepartmentname().equalsIgnoreCase(departmentname)) {
				department = departments.get(i);
				break;
			}
		}
		return department;

	}

}
