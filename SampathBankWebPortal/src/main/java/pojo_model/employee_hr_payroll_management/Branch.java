package pojo_model.employee_hr_payroll_management;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import pojo_model.employee_hr_payroll_management.converters.DateConverter;
import pojo_model.user_management.Address;
import pojo_model.user_management.Person;

@Entity
@Table (name="branch")
public class Branch {
	@Id @GeneratedValue
	private int branchId;
	@Embedded
	private Address address;
	@Column(length = 100, nullable = false)
	private String branchEmail;
	@Column(length = 10, nullable = false)
	private String contactNumber;
	@OneToMany(mappedBy = "branch")
	private Collection<Person> personList = new ArrayList<Person> ();
	@OneToMany(mappedBy = "branch")
	private Collection<Department> departmentList = new ArrayList<Department> ();

	public Branch() {}
	
	public Branch(String addStreet01, String addStreet02,  String addCity, String addProvince, String zipCode, String branchEmail, 
			String contactNumber) {
		DateConverter dc = new DateConverter();
		this.setBranchAddress(addStreet01, addStreet02, addCity, addProvince, dc.getIntFromString(zipCode));
		this.setBranchEmail(branchEmail);
		this.setContactNumber(contactNumber);
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getBranchId() {
		return branchId;
	}

	public Address getAddress() {
		return address;
	}

	public String getBranchEmail() {
		return branchEmail;
	}

	public Collection<Person> getPerson() {
		return personList;
	}

	public Collection<Department> getDepartment() {
		return departmentList;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void setBranchAddress(String addStreet01, String addStreet02, String addCity, String addProvince, int zipCode) {
		this.setAddress(new Address(addStreet01, addStreet02, addCity, addProvince, zipCode));
	}

	public void setBranchEmail(String branchEmail) {
		this.branchEmail = branchEmail;
	}

	public Collection<Person> getPersonList() {
		return personList;
	}

	public Collection<Department> getDepartmentList() {
		return departmentList;
	}

	public void setPersonList(Collection<Person> personList) {
		this.personList = personList;
	}

	public void setDepartmentList(Collection<Department> departmentList) {
		this.departmentList = departmentList;
	}
}