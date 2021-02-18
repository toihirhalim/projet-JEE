package ma.fstt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.fstt.entities.Admin;
import ma.fstt.entities.Tags;
import ma.fstt.services.GestionAdminService;
import ma.fstt.services.TagsServices;

@SpringBootApplication
public class ServerApplication implements CommandLineRunner{

	@Autowired
	TagsServices tagsServices;
	
	@Autowired 
	GestionAdminService gestionAdminService;

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		createDefaultAdmin();
		
		//initTags();

	}
	public void createDefaultAdmin() {
		if(gestionAdminService.getAllAdmin().size() <= 0) {
			gestionAdminService.saveAdmin(new Admin("default Admin", "admin@gmail.com", "admin"));
			System.out.println("default admin created ");
		}
			
	}
	

	public List<String> convertArrayToString(String [] strings){
		List<String> list = new ArrayList<String>();
		
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
		
		List<Tags> listTags = new ArrayList<Tags>();
		listTags.add(t1);
		listTags.add(t2);
		listTags.add(t3);
		listTags.add(t4);
		
		tagsServices.addAll(listTags);
		
	}
}
