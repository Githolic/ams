package gapp.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class Department implements Serializable {

	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue
    private Integer id;
    
    @OneToMany(mappedBy="department")
    private Set<Application> applications;
    
    @OneToMany(mappedBy="department")
    private Set<Program> programs;
    
    public Set<Application> getApplications() {
		return applications;
	}

	public void setApplications(Set<Application> applications) {
		this.applications = applications;
	}

	@Column(name="department_name")
    private String departmentname;
    

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public Set<Program> getPrograms() {
		return programs;
	}

	public void setPrograms(Set<Program> programs) {
		this.programs = programs;
	}
    
    
	
	

}
