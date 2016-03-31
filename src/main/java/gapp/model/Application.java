package gapp.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "applications")
public class Application implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;

	@ManyToOne
	private Department department;

	@ManyToOne
	private User user;

	@ManyToOne
	private Program program;

	private String term;

	@Embedded
	private Information information;

	@OneToMany(mappedBy = "application")
	private Set<Degree> degrees;

	@Embedded
	private Academic record;

	@OneToMany(mappedBy="application")
	private Set<AdditionalInfo> additionalinfos;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getTerm() {
		return term;
	}

	public Information getInformation() {
		return information;
	}

	public void setInformation(Information information) {
		this.information = information;
	}

	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}

	public Set<Degree> getDegrees() {
		return degrees;
	}

	public void setDegrees(Set<Degree> degrees) {
		this.degrees = degrees;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public Academic getRecord() {
		return record;
	}

	public void setRecord(Academic record) {
		this.record = record;
	}

	public Set<AdditionalInfo> getAdditionalinfos() {
		return additionalinfos;
	}

	public void setAdditionalinfos(Set<AdditionalInfo> additionalinfos) {
		this.additionalinfos = additionalinfos;
	}



}
