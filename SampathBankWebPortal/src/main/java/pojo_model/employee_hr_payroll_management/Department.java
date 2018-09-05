package pojo_model.employee_hr_payroll_management;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
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
	@Id @GeneratedValue
	private int departmentId;
	@Column(nullable = false)
	private String departmentName;
	@Column(length = 10, nullable = false, unique=true)
	private String contactNumber;
	@ManyToOne
	@JoinColumn(name="branchId")
	private Branch branch;
	@OneToMany(mappedBy="department")
	private Collection<Employee> employeeList = new ArrayList<Employee> ();

	public Department() {}
	
	public Department(String departmentName, String contactNumber, Branch branch) {
		this.setBranch(branch);
		this.setContactNumber(contactNumber);
		this.setDepartmentName(departmentName);
	}

	
	public String getContactNumber() {
		return contactNumber;
	}

	public Collection<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setEmployeeList(Collection<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public void setDepartmentId(int departmentId) {
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
	
	public int getDepartmentId() {
		return departmentId;
	}
	
	public Branch getBranch() {
		return branch;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
}
