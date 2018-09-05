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
@Table (name="permission",
		uniqueConstraints = {@UniqueConstraint ( columnNames = "permissionType")})
public class Permission {
	@Id @GeneratedValue
	private int permissionLevel;
	@Column(nullable=false)
	private String permissionType;
	@OneToMany (mappedBy = "permission")
//	@JoinTable (name = "person_permission_extra",
//				joinColumns = @JoinColumn(name = "permissionId"),
//				inverseJoinColumns = @JoinColumn(name = "personId"))
	private Collection<Person> person = new ArrayList<Person> ();
	
	public Permission() {}
	
	public Permission(String permissionType) {
		this.setPermissionType(permissionType);
	}

	public void setPermissionLevel(int permissionLevel) {
		this.permissionLevel = permissionLevel;
	}

	public void setPermissionType(String permissionType) {
		this.permissionType = permissionType;
	}
	
	public void setPerson(Collection<Person> person) {
		this.person = person;
	}

	public int getPermissionLevel() {
		return this.permissionLevel;
	}

	public String getPermissionType() {
		return this.permissionType;
	}
	
	public Collection<Person> getPerson() {
		return person;
	}

	public void setSinglePerson(Person person) {
		person.setPermission(this);
	}
	
	public void setMultiplePersons(Person... persons) {
		for(Person person: persons) {
			person.setPermission(this);
		}
	}
}
