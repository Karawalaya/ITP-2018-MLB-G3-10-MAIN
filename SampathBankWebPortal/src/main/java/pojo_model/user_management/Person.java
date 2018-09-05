package pojo_model.user_management;

import java.util.Date;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
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
		uniqueConstraints = {	@UniqueConstraint(	columnNames = {"firstName", "middleName", "lastName", "otherNames", "dateOfBirth"}),
								@UniqueConstraint(	columnNames = {"nic"})})
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person {
	@Id @GeneratedValue
	private int personId;
	@Embedded
	private Name name;
	@Embedded
	private Address address;
	@Embedded
	private RegistrationDates registrationDates;
	@Column(length = 100, nullable = false)
	private String personalEmail;
	@ManyToOne
	@JoinColumn (name = "genderId", nullable = false)
	private Gender gender; //Entity
	@Column(length = 10, nullable = false)
	private String nic;
	@ManyToOne
	@JoinColumn (name = "nationalityId", nullable = false)
	@Column(length = 100)
	private Nationality nationality; //Entity
	@Column (name="dateOfBirth", nullable=false)
	@Temporal (TemporalType.DATE)
	private Date dateOfBirth;
	@ManyToOne
	@JoinColumn (name = "roleId", nullable = false)
	private Role role; //Entity
	@ManyToOne
	@JoinColumn (name = "permissionId", nullable=false)
	private Permission permission; //Entity
	@OneToOne
	@JoinColumn(name="onlineSecurityKey", nullable = false)
	private OnlineSecurityKey onlineSecurityKey;
	@ManyToOne
	@JoinColumn(name="branchId", nullable = false)
	private Branch branch;
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable (name="person_contact",
				joinColumns = @JoinColumn(name = "personId"))
	@GenericGenerator(name = "id_generator_person_contact", strategy="sequence")
	@CollectionId(columns = { @Column(name="person_contactId")}, generator = "id_generator_person_contact", type = @Type(type="int"))
	private Collection<ContactNumber> contactNumberList = new ArrayList<ContactNumber>(); //Entity?

	//Default Constructor
	public Person() {}
	
	//First overloaded constructor
	public Person(int personId, Name name, Address address, RegistrationDates registrationDates, String personalEmail, Gender gender, 
			Nationality nationality, Date dateOfBirth, Role role, Permission permission, OnlineSecurityKey onlineSecurityKey, 
			Branch branch) {
		this.setPersonId(personId);
		this.setName(name);
		this.setAddress(address);
		this.setRegistrationDates(registrationDates);
		this.setPersonalEmail(personalEmail);
		this.setGender(gender);
		this.setNationality(nationality);
		this.setDateOfBirth(dateOfBirth);
		this.setRole(role);
		this.setPermission(permission);
		this.setOnlineSecurityKey(onlineSecurityKey);
		this.setBranch(branch);
	}
	
	//Secopnd overloaded constructor
/*	public Person() {
		
	}*/
	
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	
	public int getPersonId() {
		return personId;
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
	
	public OnlineSecurityKey getOnlineSecurityKey() {
		return onlineSecurityKey;
	}
	
	public Branch getBranch() {
		return branch;
	}
}
