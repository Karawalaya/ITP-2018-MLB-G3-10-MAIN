package pojo_model.user_management;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Embeddable
public class Contact {
	private String personalEmail;
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable (name="person_contact",
				joinColumns = @JoinColumn(name = "personId"))
	@GenericGenerator(name = "id_generator_person_contact", strategy="sequence")
	@CollectionId(columns = { @Column(name="person_contactId")}, generator = "id_generator_person_contact", type = @Type(type="long"))
	private Collection<ContactNumber> contactNumberList = new ArrayList<ContactNumber>(); //Entity?
	
	public Contact() {}
	
	public Contact(String personalEmail, String contactNumberHome, String contactNumberMobile) {
		this.setPersonalEmail(personalEmail);
		this.setContactNumber(contactNumberHome, contactNumberMobile);
	}
	
	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
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
			if(number != null || !number.equals("") || !number.equals(" ")) {
				contactNumber = new ContactNumber(number, type);
				this.insertContactNumberList(contactNumber);
			}
			
			number = contactNumberMobile;
			type="Mobile";
		}
		
	}
	
	public String getPersonalEmail() {
		return this.personalEmail;
	}
	
	public Collection<ContactNumber> getContactNumberList() {
		return this.contactNumberList;
	}
	
	public void insertContactNumberList(ContactNumber contactNumber) {
		this.contactNumberList.add(contactNumber);
	}
}
