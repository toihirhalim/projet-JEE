package ma.fstt.entities;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Medcin {
	@Id
	private String id;
	private String name;
	private String ville;
	private String speciality;
	@JsonIgnore
	private String idTags;
	private double rating;
	
	private Clinique clinique;
	
	public Medcin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medcin(String id, String name, String ville, String speciality) {
		super();
		this.id = id;
		this.name = name;
		this.ville = ville;
		this.speciality = speciality;
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

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	public String getIdTags() {
		return idTags;
	}

	public void setIdTags(String tagId) {
		this.idTags = tagId;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Clinique getClinique() {
		return clinique;
	}

	public void setClinique(Clinique clinique) {
		this.clinique = clinique;
	}

	@Override
	public String toString() {
		return "Medcin [id=" + id + ", name=" + name + ", ville=" + ville + ", speciality=" + speciality + "]";
	}

}
