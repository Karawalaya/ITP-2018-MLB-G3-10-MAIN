package pojo_model.user_management;

import java.sql.Date;
import java.text.SimpleDateFormat;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.HibernateUtil;
import pojo_model.employee_hr_payroll_management.Branch;
import pojo_model.employee_hr_payroll_management.Department;
import pojo_model.employee_hr_payroll_management.Designation;
import pojo_model.employee_hr_payroll_management.Employee;
import pojo_model.employee_hr_payroll_management.NormalEmployee;

public class main {
	public static void main(String[] args) {
		Gender male = new Gender("male");
		Gender female = new Gender("female");

		Nationality sinhalese = new Nationality("sinhala");
		Nationality muslim = new Nationality("muslim");
		Nationality tamil = new Nationality("tamil");

		Permission less = new Permission("less");
		Permission medium = new Permission("medium");
		Permission high = new Permission("high");
		Permission exclusive = new Permission("exclusive");
		
		Branch branch01 = new Branch("branch01street01", "branch01street02", "branch01city", "branch01province", "10280", "branch01email", 
				"0771111111");
		Branch branch02 = new Branch("branch02street01", "branch02street02", "branch02city", "branch02province", "10280", "branch02email", 
				"0772222222");
		
		Department dept01 = new Department("IT", "0773333333", branch01);
		Department dept02 = new Department("Human Resource", "077444444", branch01);
		Department dept03 = new Department("Loan", "077555555", branch01);
		Department dept04 = new Department("Lease", "0776666666", branch01);
		//
		Department dept05 = new Department("Finance", "0777777777", branch02);
		Department dept06 = new Department("Loan", "0778888888", branch02);
		Department dept07 = new Department("Lease", "0779999999", branch02);
		
		Designation desig01 = new Designation("Intern");
		Designation desig02 = new Designation("Junior");
		Designation desig03 = new Designation("Senior");
		Designation desig04 = new Designation("Credit Officer");
		Designation desig05 = new Designation("Front Desk Officer");
		Designation desig06 = new Designation("Security");
		Designation desig07 = new Designation("Lease Officer");
		Designation desig08 = new Designation("Loan Officer");
		Designation desig09 = new Designation("Manager");
		Designation desig10 = new Designation("Head");
		
		OnlineSecurityKey on = new OnlineSecurityKey("abcd1234ef");
		
		NormalEmployee nrEmp01 = new NormalEmployee("Isuru", "Dananjaya", "Samarasekara", "S.A.M.", "83/2 Piliyandala Road", null, "Maharagama", 
				"Western", "10280", "961370213v", "1996-05-16", "2018-09-05", null, "011844830", "0772841580", "isurusamarasekara@gmail.com", 
				male, sinhalese, medium, on, branch02, "karawalaya@gmail.com", desig05, dept05);
		
		OnlinePerson op01 = new OnlinePerson("Karawalaya", "yoYo", nrEmp01);
		
		Session session = HibernateUtil.openSession();
		session.beginTransaction();
		

		session.save(male);
		session.save(female);
		session.save(sinhalese);
		session.save(muslim);
		session.save(tamil);
		session.save(less);
		session.save(medium);
		session.save(high);
		session.save(exclusive);
		session.save(branch01);
		session.save(branch02);
		session.save(dept01);
		session.save(dept02);
		session.save(dept03);
		session.save(dept04);
		session.save(dept05);
		session.save(dept06);
		session.save(dept07);
		session.save(desig01);
		session.save(desig02);
		session.save(desig03);
		session.save(desig04);
		session.save(desig05);
		session.save(desig06);
		session.save(desig07);
		session.save(desig08);
		session.save(desig09);
		session.save(desig10);
		session.save(on);
		session.save(nrEmp01);
		session.save(op01);
		
		session.getTransaction().commit();
		HibernateUtil.closeSession();
		
//		session = HibernateUtil.openSession();
//		session.beginTransaction();
//		Gender gender = session.get(Gender.class, 1);
//		System.out.println(gender.getPerson().size());
//		HibernateUtil.closeSession();
	}
}
