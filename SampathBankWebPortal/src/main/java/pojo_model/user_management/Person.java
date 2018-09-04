package pojo_model.user_management;

import java.sql.Date;
import java.text.ParseException;
//import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import pojo_model.employee_hr_payroll_management.Branch;

@Entity
@Table( name = "person",
		uniqueConstraints = {	@UniqueConstraint(	columnNames = {"firstName", "middleName", "lastName", "otherNames", "nic", "dateOfBirth"}),
								@UniqueConstraint(	columnNames = {"nic"})})
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person {
	@Id
	private String personId;
	@Embedded
	@AttributeOverrides({
        @AttributeOverride(name = "firstName", column = @Column(name = "firstName")),
        @AttributeOverride(name = "middleName", column = @Column(name = "middleName")),
        @AttributeOverride(name = "lastName", column = @Column(name = "lastName")),
        @AttributeOverride(name = "otherNames", column = @Column(name = "otherNames")),
	})
	private Name name;
	@Embedded
/*	@AttributeOverrides({
        @AttributeOverride(name = "addStreet01", column = @Column(name = "addressStreet01")),
        @AttributeOverride(name = "addStreet02", column = @Column(name = "addressStreet02")),
        @AttributeOverride(name = "addCity", column = @Column(name = "addressCity")),
        @AttributeOverride(name = "addProvince", column = @Column(name = "addressProvince")),
        @AttributeOverride(name = "zipCode", column = @Column(name = "addressZipCode")),
	})*/
	private Address address;
	@Embedded
	private RegistrationDates registrationDates;
	private String personalEmail;
	@ManyToOne
	@JoinColumn (name = "genderId")
	private Gender gender; //Entity
	@Column(nullable = false)
	private String nic;
	@ManyToOne
	@JoinColumn (name = "nationalityId")
	private Nationality nationality; //Entity
	@Column (name="dateOfBirth")
	private Date dateOfBirth;
	@ManyToOne
	@JoinColumn (name = "roleId")
	private Role role; //Entity
	@ManyToOne
	@JoinColumn (name = "permissionId")
	private Permission permission; //Entity
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable (name="person_contact",
				joinColumns = @JoinColumn(name = "personId"))
	@GenericGenerator(name = "id_generator_person_contact", strategy="sequence")
	@CollectionId(columns = { @Column(name="person_contactId")}, generator = "id_generator_person_contact", type = @Type(type="long"))
	private Collection<ContactNumber> contactNumberList = new ArrayList<ContactNumber>(); //Entity?
	@OneToOne
	@JoinColumn(name="onlineSecurityKey")
	private OnlineSecurityKey onlineSecurityKey;
	@ManyToOne
	@JoinColumn(name="branchId")
	private Branch branch;
	
	public Person() {}
	
	public Person(String personId, String firstName, String middleName, String lastName, String otherNames, String addStreet01, String addStreet02, 
			String addCity, String addProvince, int zipCode, Date phyRegDate, Date onlineRegDate, String personalEmail, Gender gender, String nic, 
			Nationality nationality, Date dateOfBirth, Role role, Permission permission, String contactNumberHome, String contactNumberMobile,
			OnlineSecurityKey onlineSecurityKey, Branch branch) {
/*		java.util.Date date1 = new java.util.Date();
		java.util.Date date2 = new java.util.Date();
		java.util.Date date3 = new java.util.Date();
		try {
			date1 = new SimpleDateFormat("yyyy-MM-dd").parse(phyRegDate);
			date2 = new SimpleDateFormat("yyyy-MM-dd").parse(onlineRegDate);
			date3 = new SimpleDateFormat("yyyy-MM-dd").parse(dateOfBirth);
		} catch (ParseException e) {
			System.out.println("Date stuff wrong...");
			e.printStackTrace();
		}
		Date date01 = new java.sql.Date(date1.getTime());
		Date date02 = new java.sql.Date(date2.getTime());
		Date date03 = new java.sql.Date(date3.getTime());
		
		this.setName(firstName, middleName, lastName, otherNames);
		this.setAddress(addStreet01, addStreet02, addCity, addProvince, zipCode);
		this.setRegistrationDates(date01, date02);
		this.setPersonalEmail(personalEmail);
		this.setContactNumber(contactNumberHome, contactNumberMobile);
		this.setGender(gender);
		this.setNic(nic);
		this.setNationality(nationality);
		this.setDateOfBirth(date03);
		this.setRole(role);
		this.setPermission(permission);*/
		
		this.setPersonId(personId);
		this.setName(firstName, middleName, lastName, otherNames);
		this.setAddress(addStreet01, addStreet02, addCity, addProvince, zipCode);
		this.setRegistrationDates(phyRegDate, onlineRegDate);
		this.setPersonalEmail(personalEmail);
		this.setGender(gender);
		this.setNic(nic);
		this.setNationality(nationality);
		this.setDateOfBirth(dateOfBirth);
		this.setRole(role);
		this.setPermission(permission);
		this.setContactNumber(contactNumberHome, contactNumberMobile);
		this.setOnlineSecurityKey(onlineSecurityKey);
		this.setBranch(branch);
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}
	
	public void setName(String firstName, String middleName, String lastName, String otherNames) {
		this.setName(new Name(firstName, middleName, lastName, otherNames));
	}
	
	public void setName(Name name) {
		this.name = name;
	}
	
	public void setAddress(String addStreet01, String addStreet02, String addCity, String addProvince, int zipCode) {
		this.setAddress(new Address(addStreet01, addStreet02, addCity, addProvince, zipCode));
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void setRegistrationDates( Date phyRegDate, Date onlineRegDate) {
		this.setRegistrationDates(new RegistrationDates(phyRegDate, onlineRegDate));
	}
	
	public void setRegistrationDates(RegistrationDates registrationDates) {
		this.registrationDates = registrationDates;
	}
	
	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setNic(String nic) {
		this.nic = nic.trim();
	}
	
	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}

	public void setDateOfBirth(Date dateOfBirth) {
//		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//		Date myDate = formatter.parse(dateOfBirth);
//		java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());

		this.dateOfBirth = dateOfBirth;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}
	
	public void setContactNumberList(Collection<ContactNumber> contactNumberList) {
		this.contactNumberList = contactNumberList;
	}
	
	public void setContactNumber(String contactNumberHome, String contactNumberMobile) {
//		boolean x = true;
//		String y = contactNumber1;
//		int i = 1; //Integer.parseInt(y.substring(13));
//		while(x) {
//			this.insertContactNumberList(y);
//			
//			y = y.substring(0, 13) + (i + 1); 
//			if(y == null || y.equals("") || y.equals(" "))
//				x = false;
//			
//			i += 1;
//		}
		
		ContactNumber contactNumber = null;
		String number = contactNumberHome;
		String type = "Home";
		for(int i = 0; i < 2; i++) {
			if(number != null && number.trim().length() > 0) {
				contactNumber = new ContactNumber(number, type);
				this.insertContactNumberList(contactNumber);
			}
			number = contactNumberMobile;
			type="Mobile";
		}	
	}
	
	public void insertContactNumberList(ContactNumber contactNumber) {
		this.contactNumberList.add(contactNumber);
	}

	public void setOnlineSecurityKey(OnlineSecurityKey onlineSecurityKey) {
		this.onlineSecurityKey = onlineSecurityKey;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Name getName() {
		return this.name;
	}

	public Address getAddress() {
		return this.address;
	}

	public RegistrationDates getRegistrationDates() {
		return this.registrationDates;
	}

	public Gender getGender() {
		return this.gender;
	}

	public String getNic() {
		return this.nic;
	}

	public Nationality getNationality() {
		return this.nationality;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public Role getRole() {
		return this.role;
	}

	public Permission getPermission() {
		return this.permission;
	}

	public String getPersonalEmail() {
		return this.personalEmail;
	}
	
	public Collection<ContactNumber> getContactNumberList() {
		return this.contactNumberList;
	}

	public String getPersonId() {
		return personId;
	}

	public OnlineSecurityKey getOnlineSecurityKey() {
		return onlineSecurityKey;
	}
	
	public Branch getBranch() {
		return branch;
	}
}
