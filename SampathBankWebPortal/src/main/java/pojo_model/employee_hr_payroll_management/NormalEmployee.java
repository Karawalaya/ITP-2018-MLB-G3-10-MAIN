package pojo_model.employee_hr_payroll_management;

import java.sql.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import pojo_model.user_management.Address;
import pojo_model.user_management.Gender;
import pojo_model.user_management.Name;
import pojo_model.user_management.Nationality;
import pojo_model.user_management.OnlineSecurityKey;
import pojo_model.user_management.Permission;
import pojo_model.user_management.RegistrationDates;


@Entity
//@Table (name="normal_employee")
//@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("normal employee")
public class NormalEmployee extends Employee {

	
	public NormalEmployee() {
		super();
	}

	public NormalEmployee(int personId, Name name, Address address, String nic, java.util.Date dateOfBirth,
			RegistrationDates registrationDates, String homeContact, String mobileContact, String personalEmail,
			Gender gender, Nationality nationality, Permission permission, OnlineSecurityKey onlineSecurityKey,
			Branch branch, String companyEmail, Designation designation, Department department) {
		super(personId, name, address, nic, dateOfBirth, registrationDates, homeContact, mobileContact, personalEmail, gender,
				nationality, permission, onlineSecurityKey, branch, companyEmail, designation, department);
		// TODO Auto-generated constructor stub
	}

	public NormalEmployee(String firstName, String middleName, String lastName, String otherNames, String addStreet01,
			String addStreet02, String addCity, String addProvince, String zipCode, String nic, String dateOfBirth,
			String phyRegDate, String onlineRegDate, String homeContact, String mobileContact, String personalEmail,
			Gender gender, Nationality nationality, Permission permission, OnlineSecurityKey onlineSecurityKey,
			Branch branch, String companyEmail, Designation designation, Department department) {
		super(firstName, middleName, lastName, otherNames, addStreet01, addStreet02, addCity, addProvince, zipCode, nic,
				dateOfBirth, phyRegDate, onlineRegDate, homeContact, mobileContact, personalEmail, gender, nationality,
				permission, onlineSecurityKey, branch, companyEmail, designation, department);
		// TODO Auto-generated constructor stub
	}

	
}
