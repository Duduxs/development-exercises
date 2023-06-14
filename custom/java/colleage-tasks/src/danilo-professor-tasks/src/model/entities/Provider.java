package model.entities;

public class Provider {

	private String cnjp, phone, email, name;

	public Provider() {

	}

	public Provider(String cnjp, String phone, String email, String name) {
		this.cnjp = cnjp;
		this.phone = phone;
		this.email = email;
		this.name = name;
	}

	public String getCnjp() {
		return cnjp;
	}

	public void setCnjp(String cnjp) {
		this.cnjp = cnjp;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Provider [ cnjp=" + cnjp + ", phone=" + phone + ", email=" + email + ", name=" + name + " ] ";
	}
	
	

}
