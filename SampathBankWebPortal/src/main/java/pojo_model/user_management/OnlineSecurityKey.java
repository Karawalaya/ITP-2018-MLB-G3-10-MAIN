package pojo_model.user_management;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="online_security")
public class OnlineSecurityKey {
	@Id @GeneratedValue
	private int onlineSecurityId;
	@Column(length = 10, nullable = false)
	private String onlineSecurityKey;

	public OnlineSecurityKey() {}
	
	public OnlineSecurityKey(String onlineSecurityKey) {
		this.setOnlineSecurityKey(onlineSecurityKey);
	}

	public void setOnlineSecurityId(int onlineSecurityId) {
		this.onlineSecurityId = onlineSecurityId;
	}

	public void setOnlineSecurityKey(String onlineSecurityKey) {
		this.onlineSecurityKey = onlineSecurityKey;
	}
	
	public int getOnlineSecurityId() {
		return onlineSecurityId;
	}
	
	public String getOnlineSecurityKey() {
		return onlineSecurityKey;
	}
}
