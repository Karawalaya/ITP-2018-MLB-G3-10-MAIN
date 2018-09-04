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
@Table (name="role",
		uniqueConstraints = {@UniqueConstraint ( columnNames = {"role", "roleGroup"})})
public class Role {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int roleId;
	@Column(nullable=false, unique=false)
	private String role;
	@Column(nullable=false, unique=false)
	private String roleGroup;
	@OneToMany(mappedBy = "role")
//	@JoinTable (name = "person_role_extra",
//				joinColumns = @JoinColumn(name = "roleId"),
//				inverseJoinColumns = @JoinColumn(name = "personId"))
	private Collection<Person> person = new ArrayList<Person>();

	public Role() {}
	
	public Role(String role, String roleGroup) {
		this.setRole(role);
		this.setRoleGroup(roleGroup);
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setRoleGroup(String roleGroup) {
		this.roleGroup = roleGroup;
	}
	
	public void setPerson(Collection<Person> person) {
		this.person = person;
	}
	
	public String getRole() {
		return this.role;
	}

	public String getRoleGroup() {
		return this.roleGroup;
	}
	
	public Collection<Person> getPerson() {
		return person;
	}
	
	public void setSinglePerson(Person person) {
		person.setRole(this);
	}
	
	public void setMultiplePersons(Person... persons) {
		for(Person person: persons) {
			person.setRole(this);
		}
	}
}
