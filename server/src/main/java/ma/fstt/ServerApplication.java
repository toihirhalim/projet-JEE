package ma.fstt;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.fstt.entities.Admin;
import ma.fstt.entities.Adress;
import ma.fstt.entities.Clinique;
import ma.fstt.entities.Medcin;
import ma.fstt.entities.Tags;
import ma.fstt.entities.WebSite;
import ma.fstt.services.GestionAdminService;
import ma.fstt.services.GestionMedcinService;
import ma.fstt.services.SearchMedcinService;
import ma.fstt.services.TagsServices;

@SpringBootApplication
public class ServerApplication implements CommandLineRunner{
	/*@Autowired
	GestionMedcinService gestionMedcinService;
	
	@Autowired
	SearchMedcinService searchMedcinService;
	
	@Autowired
	TagsServices tagsServices;
	
	@Autowired 
	GestionAdminService gestionAdminService;
	
	Random rd = new Random();*/
	
	
	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//initMedcins();
		//initTags();
		//affectTags();
		
		//createDefaultAdmin();

		//affiche();
	}
	/*public void createDefaultAdmin() {
		gestionAdminService.saveAdmin(new Admin("admin@gmail.com", "admin"));
	}
	public void addWebSitesAndEmail(Clinique clinique) {
		
		String name = "";
		String url = "http://";
		
		for(int i = 0; i < clinique.getName().length(); i++) {
			char ch = clinique.getName().charAt(i);
			if(ch != ' ') {
				name += ch;
				url +=  ch;
			}
		}

		clinique.setEmail(name +".contact.gmail.com");
		name += ".com";
		url += ".com";
		clinique.setWebSite(new WebSite(name, url));

	}

	public List<String> convertArrayToString(String [] strings){
		List<String> list = new ArrayList();
		
		for(int i = 0; i < strings.length; i++) 
			list.add(strings[i]);
		
		return list;
	}
	public void initTags() {
		Tags t1 = new Tags("Ophtalmologue");
		Tags t2 = new Tags("Dermatologue");
		Tags t3 = new Tags("Cardiologue");
		Tags t4 = new Tags("Chirurgien");

		String [] ophta = {"yeux", "yeu", "oeuil", "vision", "lunette"};
		String [] derma = {"peau", "button", "acne", "point", "points", "brulure", "brulures"};
		String [] cardio = {"coeur", "poitrine"};
		String [] chirur = {"operation", "ventre", "operations"};
		
		t1.setTags(convertArrayToString(ophta));	
		t2.setTags(convertArrayToString(derma));
		t3.setTags(convertArrayToString(cardio));
		t4.setTags(convertArrayToString(chirur));
		
		List<Tags> listTags = new ArrayList();
		listTags.add(t1);
		listTags.add(t2);
		listTags.add(t3);
		listTags.add(t4);
		
		tagsServices.addAll(listTags);
		
	}
	
	public void affectTags() {
		for(Tags tags : tagsServices.findAll()) {
			List<Medcin> medcins = searchMedcinService.findAllBySpeciality(tags.getSpeciality());
			
			for(Medcin m : medcins)
				m.setIdTags(tags.getId());
			
			gestionMedcinService.saveAll(medcins);
			System.out.println("medcins saved");
		}
	}
	public String randomNumber() {
		return "06" + rd.nextInt(99999999);
	}
	public void initMedcins() {
		List<Medcin> medcins = new ArrayList();

		Medcin m1 = new Medcin("Ali Abdalah", "Tanger", "Ophtalmologue");
		Medcin m2 = new Medcin("Omar Moussa", "Tanger", "Dermatologue");
		Medcin m3 = new Medcin("Mehdi Fatima", "Rabat", "Ophtalmologue");
		Medcin m4 = new Medcin("Bouchra Ben", "Rabat", "Cardiologue");
		Medcin m5 = new Medcin("Yassyn Mubarak", "Tanger", "Chirurgien");

		Clinique cl1 = new Clinique("Ali Clinique", "8h", "16h", randomNumber(), null);
		Clinique cl2 = new Clinique("Omar Clinique", "8h", "16h",  randomNumber(), null);
		Clinique cl3 = new Clinique("Mehdi Clinique", "8h", "16h",  randomNumber(), null);
		Clinique cl4 = new Clinique("Bouchra Clinique", "8h", "16h", randomNumber(), null);
		Clinique cl5 = new Clinique("Yassyn Clinique", "8h", "16h", randomNumber(), null);

		cl1.setAdress(new Adress("Boukhalef", 0,0));
		cl2.setAdress(new Adress("Dradeb", 0,0));
		cl3.setAdress(new Adress("G5", 0,0));
		cl4.setAdress(new Adress("Gare Agdal", 0,0));
		cl5.setAdress(new Adress("Castilla", 0,0));

		addWebSitesAndEmail(cl1);
		addWebSitesAndEmail(cl2);
		addWebSitesAndEmail(cl3);
		addWebSitesAndEmail(cl4);
		addWebSitesAndEmail(cl5);

		m1.setClinique(cl1);
		m2.setClinique(cl2);
		m3.setClinique(cl3);
		m4.setClinique(cl4);
		m5.setClinique(cl5);
		
		medcins.add(m1);
		medcins.add(m2);
		medcins.add(m3);
		medcins.add(m4);
		medcins.add(m5);
		
		gestionMedcinService.saveAll(medcins);
		System.out.println("medcins saved");
		
	}
	
	public void affiche() {
		System.out.println("all medcins");
		for(Medcin medcin : gestionMedcinService.getAll())
			System.out.println(medcin);
		
		System.out.println("all medcins of Tanger");
		for(Medcin medcin : searchMedcinService.findAllByVille("Tanger"))
			System.out.println(medcin);
		
		System.out.println("all Chirurgien");
		for(Medcin medcin : searchMedcinService.findAllBySpeciality("Chirurgien"))
			System.out.println(medcin);
		
		System.out.println("all Ophtalmologue of tanger");
		for(Medcin medcin : searchMedcinService.findAllByVilleAndSpecality("Tanger", "Ophtalmologue"))
			System.out.println(medcin);
	}*/

}
