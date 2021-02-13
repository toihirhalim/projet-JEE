package ma.fstt.entities;

import org.springframework.data.annotation.Id;

public class Clinique {
	@Id
	private String id;
	private String name;
	private String oppenAt;
	private String closeAt;
	private String number;
	private String email;
	private String webSite;
	
	private Adress adress;
	
	public Clinique() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Clinique(String id, String name, String oppenAt, String closeAt, String number, String email,
			String webSite) {
		super();
		this.id = id;
		this.name = name;
		this.oppenAt = oppenAt;
		this.closeAt = closeAt;
		this.number = number;
		this.email = email;
		this.webSite = webSite;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOppenAt() {
		return oppenAt;
	}

	public void setOppenAt(String oppenAt) {
		this.oppenAt = oppenAt;
	}

	public String getCloseAt() {
		return closeAt;
	}

	public void setCloseAt(String closeAt) {
		this.closeAt = closeAt;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Clinique [id=" + id + ", name=" + name + ", oppenAt=" + oppenAt + ", closeAt=" + closeAt + ", number="
				+ number + ", email=" + email + ", webSite=" + webSite + "]";
	}
}
