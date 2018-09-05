package pojo_model.employee_hr_payroll_management;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Designation {
	@Id @GeneratedValue
	private int designationId;
	@Column(nullable=false, unique=true)
	private String designation;
	@OneToMany(mappedBy="designation")
	Collection<Employee> employeeList = new ArrayList<Employee> ();
	
	public Designation() {}
	
	public Designation(int designationId, String designation) {
		this.designationId = designationId;
		this.designation = designation;
	}
	
	public Designation(String designation) {
		this.setDesignation(designation);
	}

	public int getDesignationId() {
		return designationId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
