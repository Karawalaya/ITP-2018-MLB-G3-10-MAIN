package pojo_model.employee_hr_payroll_management;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import pojo_model.user_management.Address;
import pojo_model.user_management.Gender;
import pojo_model.user_management.Name;
import pojo_model.user_management.Nationality;
import pojo_model.user_management.OnlineSecurityKey;
import pojo_model.user_management.Permission;
import pojo_model.user_management.Person;
import pojo_model.user_management.RegistrationDates;


@Entity
@Table (name="employee",
		uniqueConstraints = { @UniqueConstraint ( columnNames = "companyEmail")})
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
		name = "employeeType",
		discriminatorType=DiscriminatorType.STRING
)
public abstract class Employee extends Person {
	@Column(nullable=false, unique=true)
	private String companyEmail;
	@ManyToOne
	private Designation designation;
	@ManyToOne
	@JoinColumn(name="departmentId")
	private Department department;
	
	public Employee() {
		super();
	}
	
	public Employee(int personId, Name name, Address address, String nic, Date dateOfBirth,
			RegistrationDates registrationDates, String homeContact, String mobileContact, String personalEmail,
			Gender gender, Nationality nationality, Permission permission, OnlineSecurityKey onlineSecurityKey,
			Branch branch, String companyEmail, Designation designation, Department department) {
		super(personId, name, address, nic, dateOfBirth, registrationDates, homeContact, mobileContact, personalEmail, gender,
				nationality, permission, onlineSecurityKey, branch);
		this.setCompanyEmail(companyEmail);
		this.setDesignation(designation);
		this.setDepartment(department);
	}



	public Employee(String firstName, String middleName, String lastName, String otherNames, String addStreet01,
			String addStreet02, String addCity, String addProvince, String zipCode, String nic, String dateOfBirth,
			String phyRegDate, String onlineRegDate, String homeContact, String mobileContact, String personalEmail,
			Gender gender, Nationality nationality, Permission permission, OnlineSecurityKey onlineSecurityKey,
			Branch branch, String companyEmail, Designation designation, Department department) {
		super(firstName, middleName, lastName, otherNames, addStreet01, addStreet02, addCity, addProvince, zipCode, nic,
				dateOfBirth, phyRegDate, onlineRegDate, homeContact, mobileContact, personalEmail, gender, nationality,
				permission, onlineSecurityKey, branch);
		this.setCompanyEmail(companyEmail);
		this.setDesignation(designation);
		this.setDepartment(department);
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public Designation getDesignation() {
		return designation;
	}

	public Department getDepartment() {
		return department;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
