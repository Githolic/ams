package gapp.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable{
    
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "last_name")
    private String lastname;
    
    @Column(name = "first_name")
    private String firstname;
    
    private String email;

    private String password;
    
    private String username;
    
    @ElementCollection
    @CollectionTable(name = "authorities",
    		joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "usertype")
    private List<String> usertypes;
    
    @OneToMany(mappedBy="user")
    private List<Application> applications;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<String> getUsertypes() {
		return usertypes;
	}

	public void setUsertypes(List<String> usertypes) {
		this.usertypes = usertypes;
	}

	public List<Application> getApplications() {
		return applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

	public boolean isAdmin() {
		
		return usertypes.contains("ROLE_ADMIN");
	}
	
	public boolean isStaff() {
		return usertypes.contains("ROLE_STAFF");
	}
	
	public boolean isStudent() {
		return usertypes.contains("ROLE_STUDENT");
	}

   

}