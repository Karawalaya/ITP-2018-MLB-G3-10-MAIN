package pojo_model.employee_hr_payroll_management.exceptions;

public class EmployeeRegistrationException extends Exception {
	private String desc;
	
	public EmployeeRegistrationException() {
		super();
	}
	
	public EmployeeRegistrationException(String arg0) {
		super(arg0);
		this.desc = arg0;
	}
	
	public String getDescription() {
		return this.desc;
	}
}
