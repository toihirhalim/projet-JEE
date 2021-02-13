package ma.fstt.entities;

import org.springframework.data.annotation.Id;

public class Adress {
	@Id
	private String id;
	private String location;
	private float longitude;
	private float latitude;
	
	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adress(String id, String location, float longitude, float latitude) {
		super();
		this.id = id;
		this.location = location;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	@Override
	public String toString() {
		return "Adress [id=" + id + ", location=" + location + ", longitude=" + longitude + ", latitude=" + latitude
				+ "]";
	}
	
	

}
