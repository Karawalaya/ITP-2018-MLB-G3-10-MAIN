package pojo_model.user_management;

import javax.persistence.Embeddable;

@Embeddable
public class ContactNumber {
	private String number;
	private String type;
	
	public ContactNumber() {}
	
	public ContactNumber(String number, String type) {
		this.setNumber(number);
		this.setType(type);
	}
	
	public void setNumber(String number) {
		this.number = number.trim();
	}
	
	public void setType(String type) {
		this.type = type.trim();
	}
	
	public String getNumber() {
		return this.number;
	}
	
	public String getType() {
		return this.type;
	}
}
