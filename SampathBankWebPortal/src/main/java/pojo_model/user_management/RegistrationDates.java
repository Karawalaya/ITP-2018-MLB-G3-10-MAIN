package pojo_model.user_management;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class RegistrationDates {
	@Temporal (TemporalType.DATE)
	@Column(nullable = false)
	private Date physicalRegistrationDate;
	@Temporal (TemporalType.DATE)
	private Date onlineRegistrationDate;
	
	public RegistrationDates() {}
	
	public RegistrationDates(Date phyRegDate, Date onlineRegDate) {
		this.setPhysicalRegistrationDate(phyRegDate);
		this.setOnlineRegistrationDate(onlineRegDate);
	}

	public Date getPhysicalRegistrationDate() {
		return physicalRegistrationDate;
	}

	public Date getOnlineRegistrationDate() {
		return onlineRegistrationDate;
	}

	public void setPhysicalRegistrationDate(Date physicalRegistrationDate) {
		this.physicalRegistrationDate = physicalRegistrationDate;
	}

	public void setOnlineRegistrationDate(Date onlineRegistrationDate) {
		this.onlineRegistrationDate = onlineRegistrationDate;
	}
}
