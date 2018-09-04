package pojo_model.employee_hr_payroll_management.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pojo_model.employee_hr_payroll_management.exceptions.EmployeeRegistrationException;

public class Validator {
	public boolean isValidByEmpty(String str) {
		boolean isEmpty = (str == null || str.trim().length() == 0);
		return !isEmpty;
	}
	
	public boolean isStringOnly(String str) {
		for(int i = 0; i < str.trim().length(); i++) {
			if(Character.isDigit(str.trim().charAt(i)))
				return false;
		}
		return true;
	}
	
	public boolean isContainsWhiteSpaces(String str) {
		for(int i = 0; i < str.trim().length(); i++) {
			if(Character.isWhitespace(str.trim().charAt(i)))
				return true;
		}
		return false;
	}
	
	public boolean checkGender(String gender) {
		boolean isRight = gender.trim().equalsIgnoreCase("MALE") || gender.trim().equalsIgnoreCase("FEMALE");
		return isRight;
	}
	
	public boolean checkProvince(String province) {
		boolean isRight = province.trim().equalsIgnoreCase("NOTHERN") || province.trim().equalsIgnoreCase("NORTH WESTERN") || 
				province.trim().equalsIgnoreCase("WESTERN") || province.trim().equalsIgnoreCase("NORTH CENTRAL") || 
				province.trim().equalsIgnoreCase("CENTRAL") || province.trim().equalsIgnoreCase("SABARAGAMUWA") || 
				province.trim().equalsIgnoreCase("EASTERN") || province.trim().equalsIgnoreCase("UVA") || province.trim().equalsIgnoreCase("SOUTHERN");
		return isRight;
	}
	
	public void checkZipNumberFormatValidity(String zip) throws NumberFormatException{
		int zip01 = Integer.parseInt(zip.trim());
	}
	
	public void checkZipNumberPositiveValidity(String zip) throws NumberFormatException{
		int zip01 = Integer.parseInt(zip.trim());
	}
	
	public boolean checkZipNumberLengthValidity(String zip) {
		return zip.trim().length() == 5;
	}
	
	public boolean contactNumberLengthValidity(String contact) {
		return contact.trim().length() == 10;
	}

	public boolean contactNumberDigitValidity(String contact) {
		for(int i = 0; i < contact.trim().length(); i++) {
			if(Character.isLetter(contact.trim().charAt(i)))
				return false;
		}
		return true;
	}
	
	public boolean checkBeginningOfContact(String Contact) {
		return Contact.trim().charAt(0) == '0';
	}
	
	public boolean checkBeginningOfMobileContact(String MobileContact) {
		return MobileContact.trim().charAt(0) == '0' && MobileContact.trim().charAt(1) == '7';
	}
	
	public boolean checkEmailPattern(String email) {
		Pattern email_regex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = email_regex.matcher(email.trim());
		return matcher.find();
	}
	
	public boolean checkNicPattern(String nic) {
		Pattern nic_regex = Pattern.compile("^[0-9]{9}[vV]$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = nic_regex.matcher(nic.trim());
		return matcher.find();
	}
	
	public boolean checkNationality(String nationality) {
		boolean isRight = nationality.trim().equalsIgnoreCase("SINHALESE") || nationality.trim().equalsIgnoreCase("TAMIL") || nationality.trim().equalsIgnoreCase("MUSLIM");
		return isRight;
	}
	
	public boolean checkBranch(String branch) {
		boolean isRight = branch.trim().equalsIgnoreCase("MAHARAGAMA") || branch.trim().equalsIgnoreCase("MALABE") || branch.trim().equalsIgnoreCase("NUGEGODA");
		return isRight;
	}

	public boolean checkDepartment(String department) {
		boolean isRight = department.trim().equalsIgnoreCase("IT") || department.trim().equalsIgnoreCase("FINANCE") || department.trim().equalsIgnoreCase("CARD CENTER");
		return isRight;
	}
	
	public boolean validateEmployeeRegistration(String empFirstName, String empMiddleName, String empLastName, String empOtherNames, String empGender, String empAddLine01, String empAddLine02, String empAddCity, String empAddProvince, String empAddZip, 
			String empHomeContact, String empMobileContact, String empPersonalEmail, String empNic, String empNationality, String empDob, String empBranch, String empDepartment, String empDesignation, String empRole) throws EmployeeRegistrationException{

		if(this.isValidByEmpty(empFirstName)) {//
			if(!this.isStringOnly(empFirstName)) {
				throw new EmployeeRegistrationException("First Name, must only contain letters."); }
			else if(this.isContainsWhiteSpaces(empFirstName)) {
				throw new EmployeeRegistrationException("First Name, must not contain any whitespaces."); }
			else {//
				if(this.isValidByEmpty(empMiddleName)) {
					if(!this.isStringOnly(empMiddleName)) {
						throw new EmployeeRegistrationException("Middle Name, must only contain letters."); }
					else if(this.isContainsWhiteSpaces(empMiddleName)) {
						throw new EmployeeRegistrationException("Middle Name, must not contain any whitespaces."); }
				}
				if(this.isValidByEmpty(empLastName)) {//
					if(!this.isStringOnly(empLastName)) {
						throw new EmployeeRegistrationException("Last Name, must only contain letters."); }
					else if(this.isContainsWhiteSpaces(empLastName)) {
						throw new EmployeeRegistrationException("Last Name, must not contain any whitespaces."); }
					else {//
						if(this.isValidByEmpty(empOtherNames)) {
							if(!this.isStringOnly(empOtherNames)) {
								throw new EmployeeRegistrationException("Other Names, must only contain letters."); }
						}
						if(this.isValidByEmpty(empGender)) {//
							if(!this.checkGender(empGender)) {
								throw new EmployeeRegistrationException("Gender, must only be either \"Male\" or \"Female\"."); }
							else {//
								if(this.isValidByEmpty(empAddLine01)) {//
									if(this.isValidByEmpty(empAddLine02)) {
										if(!this.isStringOnly(empAddLine02)) {
											throw new EmployeeRegistrationException("Address Line 02, must only contain letters."); }
									}
									if(this.isValidByEmpty(empAddCity)) {//
										if(!this.isStringOnly(empAddCity)) {
											throw new EmployeeRegistrationException("City, must only contain letters."); }
										else if(this.isContainsWhiteSpaces(empAddCity)) {
											throw new EmployeeRegistrationException("City, must not contain any whitespaces."); }
										else {//
											if(this.isValidByEmpty(empAddProvince)) {//
												if(!this.checkProvince(empAddProvince)) {
													throw new EmployeeRegistrationException("Province, must only be selected from the given 9 Provinces."); }
												else {//
													if(this.isValidByEmpty(empAddZip)) {//
														try {
															this.checkZipNumberFormatValidity(empAddZip);
														} catch(NumberFormatException e) {
															throw new EmployeeRegistrationException("ZIP code, must only contain numbers.");
														}
														try {
															this.checkZipNumberPositiveValidity(empAddZip);
														} catch(NumberFormatException e) {
															throw new EmployeeRegistrationException("ZIP code, must be a positive value.");
														}
														
														if(!this.checkZipNumberLengthValidity(empAddZip)) {
															throw new EmployeeRegistrationException("ZIP code, must contain exactly 5 digits."); }
														else {//
															if(this.isValidByEmpty(empHomeContact)) {//
																if(!contactNumberLengthValidity(empHomeContact)) {
																	throw new EmployeeRegistrationException("home contact, number must contain 10 digits with including the preceding 0."); }
																else if(!contactNumberDigitValidity(empHomeContact)) {
																	throw new EmployeeRegistrationException("Home contact, number must only contain digits."); }
																else if(!this.checkBeginningOfContact(empHomeContact)) {
																	throw new EmployeeRegistrationException("Home contact, number must begin with a 0."); }
																else {
																	if(this.isValidByEmpty(empMobileContact)) {
																		if(!contactNumberLengthValidity(empMobileContact)) {
																			throw new EmployeeRegistrationException("Mobile contact, number must contain 10 digits with including the preceding 07."); }
																		else if(!contactNumberDigitValidity(empMobileContact)) {
																			throw new EmployeeRegistrationException("Mobile contact, number must only contain digits."); }
																		else if(!this.checkBeginningOfMobileContact(empMobileContact)) {
																			throw new EmployeeRegistrationException("Mobile contact, number must begin with a 07."); }
																	}
																	if(this.isValidByEmpty(empPersonalEmail)) {//
																		if(!this.checkEmailPattern(empPersonalEmail)) {
																			throw new EmployeeRegistrationException("Personal Email, must be a valid email address."); }
																		else {//
																			if(this.isValidByEmpty(empNic)) {//
																				if(!this.checkNicPattern(empNic)) {
																					throw new EmployeeRegistrationException("NIC number, must be a valid number with 9 digits and the succeeding v or V."); }
																				else {
																					if(this.isValidByEmpty(empNationality)) {//
																						if(!this.checkNationality(empNationality)) {
																							throw new EmployeeRegistrationException("Nationality, must only be selected from the given nationalities."); }
																						if(this.isValidByEmpty(empDob))
																							if(this.isValidByEmpty(empBranch)) {//
																								if(!this.checkBranch(empBranch)) {
																									throw new EmployeeRegistrationException("Banch, must only be selected from the given branches."); }
																								else {//
																									if(this.isValidByEmpty(empDepartment)) {//
																										if(!this.checkDepartment(empDepartment)) {
																											throw new EmployeeRegistrationException("Department, must only be selected from the given Departments."); }
																										else {//
																											if(this.isValidByEmpty(empDesignation))
																												if(this.isValidByEmpty(empRole))
																													return true;
																												else
																													throw new EmployeeRegistrationException("Role field cannot be empty.");
																											else
																												throw new EmployeeRegistrationException("Designation field cannot be empty.");
																										}
																									}
																									else
																										throw new EmployeeRegistrationException("Department field cannot be empty.");
																								}
																							}
																							else
																								throw new EmployeeRegistrationException("\"Branch:\" field cannot be empty.");
																						else
																							throw new EmployeeRegistrationException("\"Date of Birth:\" field cannot be empty.");
																					}
																					else
																						throw new EmployeeRegistrationException("\"Nationality:\" field cannot be empty.");
																				}
																			}
																			else
																				throw new EmployeeRegistrationException("\"NIC:\" field cannot be empty.");
																		}
																	}
																	else
																		throw new EmployeeRegistrationException("\"Personal Email:\" field cannot be empty.");
																}
															}
															else
																throw new EmployeeRegistrationException("\"Home Contact No:\" field cannot be empty.");
														}
													}
													else
														throw new EmployeeRegistrationException("\"ZIP Code:\" field cannot be empty.");
												}
											}
										else
											throw new EmployeeRegistrationException("\"Province:\" field cannot be empty.");
										}
									}
								else
									throw new EmployeeRegistrationException("\"City\" field cannot be empty.");
								}
							else
								throw new EmployeeRegistrationException("\"Street Address: Line 01:\" field cannot be empty.");
							}
						}
						else
							throw new EmployeeRegistrationException("\"Gender:\" field cannot be empty.");
					}
				}
				else
					throw new EmployeeRegistrationException("\"Last Name:\" field cannot be empty.");
			}
		}
		else
			throw new EmployeeRegistrationException("\"First Name:\" field cannot be empty.");
	}
}
