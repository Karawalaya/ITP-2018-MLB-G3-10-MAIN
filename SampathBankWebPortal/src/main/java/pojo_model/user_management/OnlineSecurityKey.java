package pojo_model.user_management;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="online_security")
public class OnlineSecurityKey {
	@Id @GeneratedValue
	private int onlineSecurityId;
	private String onlineSecurityKey;

	public OnlineSecurityKey() {}
	
	public OnlineSecurityKey(int onlineSecurityId, String onlineSecurityKey) {
		this.setOnlineSecurityId(onlineSecurityId);
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
