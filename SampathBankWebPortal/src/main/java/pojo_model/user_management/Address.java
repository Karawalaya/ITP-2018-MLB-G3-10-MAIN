package pojo_model.user_management;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(length = 100, nullable = false)
	private String addressStreet01;
	@Column(length = 100)
	private String addressStreet02;
	@Column(length = 100, nullable = false)
	private String addressCity;
	@Column(length = 100, nullable = false)
	private String addressProvince;
	@Column(length = 100, nullable = false)
	private int addressZipCode;
	
	public Address() {}

	public Address(String addressStreet01, String addressStreet02, String addressCity, String addressProvince, int addressZipCode) {
		this.setAddressStreet01(addressStreet01);
		
		if(addressStreet02 == null || addressStreet02.trim().length() == 0)
			this.setAddressStreet02(null);
		else
			this.setAddressStreet02(addressStreet02);
		
		this.setAddressCity(addressCity);
		this.setAddressProvince(addressProvince);
		this.setAddressZipCode(addressZipCode);
	}

	public String getAddressStreet01() {
		return addressStreet01;
	}

	public String getAddressStreet02() {
		return addressStreet02;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public String getAddressProvince() {
		return addressProvince;
	}

	public int getAddressZipCode() {
		return addressZipCode;
	}

	public void setAddressStreet01(String addressStreet01) {
		this.addressStreet01 = addressStreet01.trim();
	}

	public void setAddressStreet02(String addressStreet02) {
		this.addressStreet02 = addressStreet02.trim();
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity.trim();
	}

	public void setAddressProvince(String addressProvince) {
		this.addressProvince = addressProvince.trim();
	}

	public void setAddressZipCode(int addressZipCode) {
		this.addressZipCode = addressZipCode;
	}
}