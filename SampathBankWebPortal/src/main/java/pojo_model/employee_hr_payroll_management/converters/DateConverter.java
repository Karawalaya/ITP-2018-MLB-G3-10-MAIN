package pojo_model.employee_hr_payroll_management.converters;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateConverter {
	
	public Date getSqlDate(String date) {
		java.util.Date date1 = null;
		try {
			date1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
		} catch (Exception e) {
			System.out.println("Date stuff wrong...");
			e.printStackTrace();
		}
		Date date01 = new java.sql.Date(date1.getTime());
		
		return date01;
	}
	
	public int getIntFromString(String number) {
		int i = Integer.parseInt(number);
		
		return i;
	}
	
	public java.util.Date getJavaDate(String date) {
		java.util.Date date1 = null;
		try {
			date1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
		} catch (Exception e) {
			System.out.println("Date stuff wrong...");
			e.printStackTrace();
		}
		//Date date01 = new java.sql.Date(date1.getTime());
		
		return date1;
	}
}