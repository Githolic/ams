package gapp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "degrees")
public class Degree implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne
	private Application application;

	@Column(name = "degree_name")
	private String degreename;

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	@Column(name = "university_name")
	private String universityname;

	@Column(name = "time_attend")
	private String timeattend;

	private String major;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDegreename() {
		return degreename;
	}

	public void setDegreename(String degreename) {
		this.degreename = degreename;
	}

	public String getUniversityname() {
		return universityname;
	}

	public void setUniversityname(String universityname) {
		this.universityname = universityname;
	}

	public String getTimeattend() {
		return timeattend;
	}

	public void setTimeattend(String timeattend) {
		this.timeattend = timeattend;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
