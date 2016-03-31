package gapp.model.dao.jpa;

import org.springframework.stereotype.Repository;

import gapp.model.Application;
import gapp.model.dao.ApplicationDao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ApplicationDaoImpl implements ApplicationDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Application getApplication(Integer id) {
		return entityManager.find(Application.class, id);
	}

	@Override
	public List<Application> getApplications() {
		return entityManager.createQuery("from Application order by id", Application.class).getResultList();
	}

	@Override
	public Application getApplicationByTerm(String term) {
		Application application = null;
		List<Application> applications = getApplications();
		for (int i = 0; i < applications.size(); i++) {
			if (applications.get(i).getTerm().equalsIgnoreCase(term)) {
				application = applications.get(i);
				break;
			}
		}
		return application;
	}

	@Override
	public Application getApplicationByDepartment(String department) {

		Application application = null;
		List<Application> applications = getApplications();
		for (int i = 0; i < applications.size(); i++) {
			if (applications.get(i).getDepartment().getDepartmentname().equalsIgnoreCase(department)) {
				application = applications.get(i);
				break;
			}
		}
		return application;

	}

}
