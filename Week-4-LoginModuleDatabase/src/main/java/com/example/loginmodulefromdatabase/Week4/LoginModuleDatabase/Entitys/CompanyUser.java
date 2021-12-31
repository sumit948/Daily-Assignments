package com.example.loginmodulefromdatabase.Week4.LoginModuleDatabase.Entitys;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CompanyUser extends AuditModel implements Serializable {
	private static final long serialVersionUID = -6603226864656528349L;

    public static final String ROLE_MANAGER = "MANAGER";
    public static final String ROLE_EMPLOYEE = "EMPLOYEE";

    @Column(name = "Active", length = 1, nullable = true)
    private boolean active;

    @Column(name = "User_Role", length = 20, nullable = true)
    private String userRole;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 45)
    private String email;

    @Column(nullable = false, length = 64)
    private String password;

    @Column(name = "first_name", nullable = false, length = 20)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 20)
    private String lastName;
    private String username;

    @OneToOne(cascade = CascadeType.ALL)
    private Deparment depatment;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Deparment getDepatment() {
		return depatment;
	}

	public void setDepatment(Deparment depatment) {
		this.depatment = depatment;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getRoleManager() {
		return ROLE_MANAGER;
	}

	public static String getRoleEmployee() {
		return ROLE_EMPLOYEE;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(active, depatment, email, firstName, id, lastName, password, userRole, username);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompanyUser other = (CompanyUser) obj;
		return active == other.active && Objects.equals(depatment, other.depatment)
				&& Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(id, other.id) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(password, other.password) && Objects.equals(userRole, other.userRole)
				&& Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "CompanyUser [active=" + active + ", userRole=" + userRole + ", id=" + id + ", email=" + email
				+ ", password=" + password + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
				+ username + ", depatment=" + depatment + "]";
	}

	public CompanyUser() {
		super();
	}
    
    
}	
