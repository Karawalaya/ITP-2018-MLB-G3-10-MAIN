package pojo_model.employee_hr_payroll_management;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table (name="department")
public class Department {
	@Id
	private String departmentId;
	private String departmentName;
	@ManyToOne
	@JoinColumn(name="branchId")
	private Branch branch;
	@OneToMany(mappedBy="department")
	private Collection<Employee> employeeList = new ArrayList<Employee> ();
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable (name="department_contact",
				joinColumns = @JoinColumn(name = "departmentId"))
	@GenericGenerator(name = "id_generator_department_contact", strategy="sequence")
	@CollectionId(columns = { @Column(name="department_contactId")}, generator = "id_generator_department_contact", type = @Type(type="long"))
	private Collection<String> contactNumberList = new ArrayList<String> ();

	public Department() {}
	
	public Department(String departmentId, String departmentName, Branch branch, String contactNumber01, String contactNumber02) {
		this.setDepartmentId(departmentId);
		this.setBranch(branch);
		this.setDepartmentName(departmentName);
		this.setContactNumber(contactNumber01, contactNumber02);
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public Department(String departmentName) {
		this.setDepartmentName(departmentName);
	}
	
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
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
	
	public String getDepartmentId() {
		return departmentId;
	}
	
	public Branch getBranch() {
		return branch;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public Collection<String> getContactNumberList() {
		return contactNumberList;
	}
}
