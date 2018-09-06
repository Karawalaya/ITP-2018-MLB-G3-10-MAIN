package controller_servlet.user_management;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao_service.user_management.LoginDAO;
import pojo_model.user_management.OnlinePerson;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		LoginDAO ld = new LoginDAO();
		OnlinePerson op = ld.authenticate(username, password);
		if(op != null) {
			response.sendRedirect("/SampathBankWebPortal/jsp/employee_hr_payroll_management/EHPM_CommonEmployeeHomepage.jsp");
			System.out.println(op.getPerson().getMobileContact());
		}
		else {
			PrintWriter out = response.getWriter();
			out.println("ERROR");
		}
			
	}
}
