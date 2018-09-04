package pojo_model.user_management;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table (name="nationality",
		uniqueConstraints = {@UniqueConstraint ( columnNames = "nationality")})
public class Nationality {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int nationalityId;
	@Column(nullable=false)
	private String nationality;
	@OneToMany (mappedBy = "nationality")
//	@JoinTable (name="person_nationality",
//				joinColumns = @JoinColumn(name = "nationalityId"),
//				inverseJoinColumns = @JoinColumn(name = "personId"))
	private Collection<Person> person = new ArrayList<Person> ();
	
	public Nationality() {}
	
	public Nationality(String nationality) {
		this.setNationality(nationality);
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public void setPerson(Collection<Person> person) {
		this.person = person;
	}
	
	public int getNationalityId() {
		return nationalityId;
	}

	public String getNationality() {
		return this.nationality;
	}
	
	public Collection<Person> getPerson() {
		return person;
	}
	
	public void setSinglePerson(Person person) {
		person.setNationality(this);
	}
	
	public void setMultiplePersons(Person... persons) {
		for(Person person: persons) {
			person.setNationality(this);
		}
	}
}
