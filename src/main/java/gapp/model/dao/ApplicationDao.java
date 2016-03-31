package gapp.model.dao;

import java.util.List;

import gapp.model.Application;

public interface ApplicationDao {
	
	Application getApplication( Integer id);
	
	List<Application> getApplications ();
	
	Application getApplicationByTerm ( String term);
	
	Application getApplicationByDepartment( String department);

}
