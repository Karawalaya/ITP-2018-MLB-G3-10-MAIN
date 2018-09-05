package controller_servlet.employee_hr_payroll_management.recruitment_officer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo_model.employee_hr_payroll_management.Validator.Validator;
import pojo_model.employee_hr_payroll_management.exceptions.EmployeeRegistrationException;


public class EmployeeRecruitment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empFirstName = request.getParameter("empFirstName");
		String empMiddleName = request.getParameter("empMiddletName");
		String empLastName = request.getParameter("empLastName");
		String empOtherNames = request.getParameter("empOtherNames");
		String empGender = request.getParameter("empGender");
		String empAddLine01 = request.getParameter("empAddLine01");
		String empAddLine02 = request.getParameter("empAddLine02");
		String empAddCity = request.getParameter("empAddCity");
		String empAddProvince = request.getParameter("empAddProvince");
		String empAddZip = request.getParameter("empAddZip");
		String empHomeContact = request.getParameter("empHomeContact");
		String empMobileContact = request.getParameter("empMobileContact");
		String empPersonalEmail = request.getParameter("empPersonalEmail");
		String empNic = request.getParameter("empNic");
		String empNationality = request.getParameter("empNationality");
		String empDob = request.getParameter("empDob");
		String empBranch = request.getParameter("empBranch");
		String empDepartment = request.getParameter("empDepartment");
		String empDesignation = request.getParameter("empDesignation");
		String empRole = request.getParameter("empRole");
		String empPhyRegDate = request.getParameter("empPhyRegDate");
		
		//Testing......
		boolean validated = false;
		try {
			validated = new Validator().validateEmployeeRegistration(empFirstName, empMiddleName, empLastName, empOtherNames, empGender, empAddLine01, 
					empAddLine02, empAddCity, empAddProvince, empAddZip, empHomeContact, empMobileContact, empPersonalEmail, empNic, empNationality, empDob, empBranch, 
					empDepartment, empDesignation, empRole);
			
			
		} catch (EmployeeRegistrationException e) {
			System.out.println(e.getDescription());
			PrintWriter out = response.getWriter();
			String error = e.getDescription();
			   out.println("<script type=\"text/javascript\">");
			   out.println("alert('" + error + "');");
			   out.println("location='/SampathBankWebPortal/jsp/employee_hr_payroll_management/trials/EHPM_HrRecruitmentOfficer_RecruitAnEmployee.jsp';");
			   out.println("</script>");
		}
		System.out.println(validated);
	}
}
