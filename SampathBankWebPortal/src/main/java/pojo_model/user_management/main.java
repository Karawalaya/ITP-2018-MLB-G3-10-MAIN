package pojo_model.user_management;

import java.sql.Date;
import java.text.SimpleDateFormat;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.HibernateUtil;
import pojo_model.employee_hr_payroll_management.Branch;
import pojo_model.employee_hr_payroll_management.Department;
import pojo_model.employee_hr_payroll_management.Employee;
import pojo_model.employee_hr_payroll_management.NormalEmployee;

public class main {
	public static void main(String[] args) {
		Gender male = new Gender("male");
		Gender female = new Gender("female");

		Nationality sinhala = new Nationality("sinhala");
		Nationality muslim = new Nationality("muslim");
		Nationality tamil = new Nationality("tamil");
		
		Role normalEmployee = new Role("normal employee", "employee");
		Role head = new Role("head", "employee");
		Role manager = new Role("manager", "employee");
		Role admin = new Role("admin", "employee");
		Role supplier = new Role("supplier", "associate");
		Role customer = new Role("customer", "customer");
		
		Permission less = new Permission("less");
		Permission medium = new Permission("medium");
		Permission high = new Permission("high");
		Permission exclusive = new Permission("exclusive");
		
		OnlineSecurityKey onlineSecurityKey = new OnlineSecurityKey();
		onlineSecurityKey.setOnlineSecurityKey("ONSE0001");;
		
		Branch branch = new Branch("BRAN0001", "93 Kohehari", "Thawa",  "Kottawa", "Western", 
				10282, "aaa@ccc", "1111111111", "2222222222");
		
		Department department = new Department("DEPT0001", "01IT", branch, "3333333333", "4444444444");
		

		NormalEmployee IsuruEmployee = new NormalEmployee("NRML0001", "Isuru", "Dananjaya", "Samarasekara", "Samarasekara Ayyappandi Mudiyanselage", 
				"83/2", "Piliyandala Road", "Maharagama", "Western", 10280, new Date(0), new Date(0), "isurusamarasekara@gmail.com", 
				male, "961370213v", sinhala, new Date(0), normalEmployee, medium, "0112844830", "0772841580", branch, onlineSecurityKey, 
				"isurusamarasekara@icloud.com", "Recruitment Officer", department);
//		Person KeshiEmployee = new Employee();
//		Person AtheeqEmployee = new Employee();
		
		Session session = HibernateUtil.openSession();
		session.beginTransaction();
		
		session.save(male);
		session.save(female);
		session.save(sinhala);
		session.save(muslim);
		session.save(tamil);
		session.save(normalEmployee);
		session.save(head);
		session.save(manager);
		session.save(admin);
		session.save(supplier);
		session.save(customer);
		session.save(less);
		session.save(medium);
		session.save(high);
		session.save(exclusive);
		session.save(onlineSecurityKey);
		session.save(branch);
		session.save(department);
		session.save(IsuruEmployee);
		
		session.getTransaction().commit();
		HibernateUtil.closeSession();
		
		session = HibernateUtil.openSession();
		session.beginTransaction();
		Gender gender = session.get(Gender.class, 1);
		System.out.println(gender.getPerson().size());
		HibernateUtil.closeSession();
	}

	private static Date parseDate(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
