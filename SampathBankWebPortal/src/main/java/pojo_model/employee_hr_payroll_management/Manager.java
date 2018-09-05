package pojo_model.employee_hr_payroll_management;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import pojo_model.user_management.Address;
import pojo_model.user_management.Gender;
import pojo_model.user_management.Name;
import pojo_model.user_management.Nationality;
import pojo_model.user_management.OnlineSecurityKey;
import pojo_model.user_management.Permission;
import pojo_model.user_management.RegistrationDates;


@Entity
@DiscriminatorValue("manager")
public class Manager extends Employee {

	public Manager() {
		super();
	}

	public Manager(int personId, Name name, Address address, String nic, Date dateOfBirth,
			RegistrationDates registrationDates, String homeContact, String mobileContact, String personalEmail,
			Gender gender, Nationality nationality, Permission permission, OnlineSecurityKey onlineSecurityKey,
			Branch branch, String companyEmail, Designation designation, Department department) {
		super(personId, name, address, nic, dateOfBirth, registrationDates, homeContact, mobileContact, personalEmail, gender,
				nationality, permission, onlineSecurityKey, branch, companyEmail, designation, department);
		// TODO Auto-generated constructor stub
	}

	public Manager(String firstName, String middleName, String lastName, String otherNames, String addStreet01,
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
