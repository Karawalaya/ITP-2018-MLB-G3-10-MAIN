package pojo_model.employee_hr_payroll_management;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import pojo_model.user_management.Address;
import pojo_model.user_management.ContactNumber;
import pojo_model.user_management.Person;

@Entity
@Table (name="branch")
public class Branch {
	@Id
	private String branchId;
	@Embedded
	private Address address;
	private String branchEmail;
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable (name="branch_contact",
				joinColumns = @JoinColumn(name = "branchId"))
	@GenericGenerator(name = "id_generator_branch_contact", strategy="sequence")
	@CollectionId(columns = { @Column(name="branch_contactId")}, generator = "id_generator_branch_contact", type = @Type(type="long"))
	private Collection<String> contactNumberList = new ArrayList<String> ();
	@OneToMany(mappedBy = "branch")
	private Collection<Person> person = new ArrayList<Person> ();
	@OneToMany(mappedBy = "branch")
	private Collection<Department> department = new ArrayList<Department> ();

	public Branch() {}
	
	public Branch(String branchId, String addStreet01, String addStreet02,  String addCity, String addProvince, int zipCode, String branchEmail, 
			String contactNumber01, String contactNumber02) {
		this.setBranchId(branchId);
		this.setBranchAddress(addStreet01, addStreet02, addCity, addProvince, zipCode);
		this.setBranchEmail(branchEmail);
		this.setContactNumber(contactNumber01, contactNumber02);
	}

	public String getBranchId() {
		return branchId;
	}

	public Address getAddress() {
		return address;
	}

	public String getBranchEmail() {
		return branchEmail;
	}

	public Collection<Person> getPerson() {
		return person;
	}

	public Collection<Department> getDepartment() {
		return department;
	}

	public Collection<String> getContactNumberList() {
		return contactNumberList;
	}

	public void setBranchId(String branchId) {
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

	public void setPerson(Collection<Person> person) {
		this.person = person;
	}

	public void setDepartment(Collection<Department> department) {
		this.department = department;
	}

	public void setContactNumberList(Collection<String> contactNumberList) {
		this.contactNumberList = contactNumberList;
	}
	
	public void insertContactNumberList(String contactNumber) {
		this.contactNumberList.add(contactNumber);
	}
	
	public void setContactNumber(String contactNumber01, String contactNumber02) {
		this.insertContactNumberList(contactNumber01);
		this.insertContactNumberList(contactNumber02);
	}
}