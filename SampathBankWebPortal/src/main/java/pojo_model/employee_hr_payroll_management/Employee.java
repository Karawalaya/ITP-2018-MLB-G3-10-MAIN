package pojo_model.employee_hr_payroll_management;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import pojo_model.user_management.Gender;
import pojo_model.user_management.Nationality;
import pojo_model.user_management.OnlineSecurityKey;
import pojo_model.user_management.Permission;
import pojo_model.user_management.Person;
import pojo_model.user_management.Role;

@Entity
@Table (name="employee",
		uniqueConstraints = {	@UniqueConstraint ( columnNames = {"companyEmail", "designation"}),
								@UniqueConstraint ( columnNames = "companyEmail")})
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Employee extends Person {
	private String companyEmail;
	private String designation;
	@ManyToOne
	@JoinColumn(name="departmentId")
	private Department department;
	
	public Employee() {
		super();
	}
	
	public Employee(String personId, String firstName, String middleName, String lastName, String otherNames,
			String addStreet01, String addStreet02, String addCity, String addProvince, int zipCode, Date phyRegDate,
			Date onlineRegDate, String personalEmail, Gender gender, String nic, Nationality nationality,
			Date dateOfBirth, Role role, Permission permission, String contactNumberHome, String contactNumberMobile, Branch branch, 
			OnlineSecurityKey onlineSecurityKey, String companyEmail, String designation, Department department) {
		super(personId, firstName, middleName, lastName, otherNames, addStreet01, addStreet02, addCity, addProvince, zipCode,
				phyRegDate, onlineRegDate, personalEmail, gender, nic, nationality, dateOfBirth, role, permission,
				contactNumberHome, contactNumberMobile, onlineSecurityKey, branch);

		this.setCompanyEmail(companyEmail);
		this.setDesignation(designation);
		this.setDepartment(department);
	}



	public String getCompanyEmail() {
		return companyEmail;
	}
	public String getDesignation() {
		return designation;
	}
	public Department getDepartment() {
		return department;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	

}
