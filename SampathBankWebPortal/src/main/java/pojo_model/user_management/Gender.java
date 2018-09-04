package pojo_model.user_management;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table (name="gender",
		uniqueConstraints = {@UniqueConstraint ( columnNames = "gender")})
public class Gender {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int genderId;
	@Column(nullable=false)
	private String gender;
	@OneToMany(mappedBy = "gender") //, cascade = CascadeType.PERSIST
//	@JoinTable( name="person_gender_extra",
//				joinColumns=@JoinColumn(name = "genderId"),
//				inverseJoinColumns=@JoinColumn(name = "personId"))
	private Collection<Person> person = new ArrayList<Person>();

	public Gender() {}
	
	public Gender(String gender) {
		this.setGender(gender);
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}

//	public void setPerson(Collection<Person> person) {
//		this.person = person;
//	}
	
	public int getGenderId() {
		return this.genderId;
	}
	
	public String getGender() {
		return this.gender;
	}

	public Collection<Person> getPerson() {
		return this.person;
	}
	
	public void setSinglePerson(Person person) {
		person.setGender(this);
	}
	
	public void setMultiplePersons(Person... persons) {
		for(Person person: persons) {
			person.setGender(this);
		}
	}
}
