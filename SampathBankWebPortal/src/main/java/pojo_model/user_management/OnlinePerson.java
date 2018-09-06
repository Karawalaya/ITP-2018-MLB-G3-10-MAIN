package pojo_model.user_management;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

@Entity
@Table( name = "online_person",
uniqueConstraints = {	@UniqueConstraint(	columnNames = {"username", "password"}),
						@UniqueConstraint(	columnNames = {"username"})})
public class OnlinePerson {
	@Id
	private String username;
	@Column(nullable=false)
	private String password;
	@OneToOne
	@JoinColumn(name="personId", nullable = false)
	private Person person;
	@Transient
	private boolean abc;
	
	public OnlinePerson() {}
	
	public OnlinePerson(String username, String password, Person person) {
		this.username = username;
		this.password = password;
		this.setPerson(person);
	}
	
	public boolean isAbc() {
		return abc;
	}

	public void setAbc(boolean abc) {
		this.abc = abc;
	}

	//	public int getOnlineUserId() {
//		return onlineUserId;
//	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
//	public void setOnlineUserId(int onlineUserId) {
//		this.onlineUserId = onlineUserId;
//	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}
