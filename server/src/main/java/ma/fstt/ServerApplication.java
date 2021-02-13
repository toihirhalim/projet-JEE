package ma.fstt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.fstt.entities.Adress;
import ma.fstt.entities.Clinique;
import ma.fstt.entities.Medcin;
import ma.fstt.entities.Tags;
import ma.fstt.services.GestionMedcinService;
import ma.fstt.services.SearchMedcinService;
import ma.fstt.services.TagsServices;

@SpringBootApplication
public class ServerApplication implements CommandLineRunner{
	@Autowired
	GestionMedcinService gestionMedcinService;
	
	@Autowired
	SearchMedcinService searchMedcinService;
	
	@Autowired
	TagsServices tagsServices;
	
	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//init();
		//initTags();
		//affectTags();
		//affiche();
		//test();
	}

	public List<String> convertArrayToString(String [] strings){
		List<String> list = new ArrayList();
		
		for(int i = 0; i < strings.length; i++) 
			list.add(strings[i]);
		
		return list;
	}
	public void initTags() {
		Tags t1 = new Tags("16", "Ophtalmologue");
		Tags t2 = new Tags("17", "Dermatologue");
		Tags t3 = new Tags("18", "Cardiologue");
		Tags t4 = new Tags("19", "Chirurgien");

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
			List<Medcin> medcins = searchMedcinService.findAllBySpecality(tags.getSpeciality());
			
			for(Medcin m : medcins)
				m.setIdTags(tags.getId());
			
			gestionMedcinService.saveAll(medcins);
			System.out.println("medcins saved");
		}
	}
	public void init() {
		List<Medcin> medcins = new ArrayList();

		Medcin m1 = new Medcin("1", "Ali Abdalah", "Tanger", "Ophtalmologue");
		Medcin m2 = new Medcin("2", "Omar Moussa", "Tanger", "Dermatologue");
		Medcin m3 = new Medcin("3", "Mehdi Fatima", "Rabat", "Ophtalmologue");
		Medcin m4 = new Medcin("4", "Bouchra Ben", "Rabat", "Cardiologue");
		Medcin m5 = new Medcin("5", "Yassyn Mubarak", "Tanger", "Chirurgien");

		Clinique cl1 = new Clinique("6","Ali Clinique", "8h", "16h", null,null, null);
		Clinique cl2 = new Clinique("7","Omar Clinique", "8h", "16h", null,null, null);
		Clinique cl3 = new Clinique("8","Mehdi Clinique", "8h", "16h", null,null, null);
		Clinique cl4 = new Clinique("9","Bouchra Clinique", "8h", "16h", null,null, null);
		Clinique cl5 = new Clinique("10","Yassyn Clinique", "8h", "16h", null,null, null);

		cl1.setAdress(new Adress("11", null, 0,0));
		cl2.setAdress(new Adress("12", null, 0,0));
		cl3.setAdress(new Adress("13", null, 0,0));
		cl4.setAdress(new Adress("14", null, 0,0));
		cl5.setAdress(new Adress("15", null, 0,0));

		m1.setClinique(cl1);
		m2.setClinique(cl2);
		m3.setClinique(cl3);
		m4.setClinique(cl4);
		m5.setClinique(cl5);
		
		medcins.add(m1);
		medcins.add(m2);
		medcins.add(m3);
		medcins.add(m4);
		medcins.add(m4);
		
		gestionMedcinService.saveAll(medcins);
		System.out.println("medcins saved");
		
	}
	
	public void affiche() {
		System.out.println("all medcins");
		for(Medcin medcin : gestionMedcinService.getAll())
			System.out.println(medcin);
	}
	
	public void test() {
		System.out.println("all medcins of Tanger");
		for(Medcin medcin : searchMedcinService.findAllByVille("Tanger"))
			System.out.println(medcin);
		
		System.out.println("all Chirurgien");
		for(Medcin medcin : searchMedcinService.findAllBySpecality("Chirurgien"))
			System.out.println(medcin);
		
		System.out.println("all Ophtalmologue of tanger");
		for(Medcin medcin : searchMedcinService.findAllByVilleAndSpecality("Tanger", "Ophtalmologue"))
			System.out.println(medcin);
		
	}

}