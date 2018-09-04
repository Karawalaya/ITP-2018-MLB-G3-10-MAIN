package pojo_model.employee_hr_payroll_management;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import pojo_model.user_management.Gender;
import pojo_model.user_management.Nationality;
import pojo_model.user_management.OnlineSecurityKey;
import pojo_model.user_management.Permission;
import pojo_model.user_management.Role;

@Entity
@Table (name="normal_employee")
@Inheritance(strategy = InheritanceType.JOINED)
public class NormalEmployee extends Employee {

	public NormalEmployee() {
		super();
	}

	public NormalEmployee(String personId, String firstName, String middleName, String lastName, String otherNames,
			String addStreet01, String addStreet02, String addCity, String addProvince, int zipCode, Date phyRegDate,
			Date onlineRegDate, String personalEmail, Gender gender, String nic, Nationality nationality,
			Date dateOfBirth, Role role, Permission permission, String contactNumberHome, String contactNumberMobile, Branch branch, 
			OnlineSecurityKey onlineSecurityKey, String companyEmail, String designation, Department department) {
		super(personId, firstName, middleName, lastName, otherNames, addStreet01, addStreet02, addCity, addProvince, zipCode,
				phyRegDate, onlineRegDate, personalEmail, gender, nic, nationality, dateOfBirth, role, permission,
				contactNumberHome, contactNumberMobile, branch, onlineSecurityKey, companyEmail, designation, department);
	}
	
}
