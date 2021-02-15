package ma.fstt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.fstt.entities.Admin;
import ma.fstt.entities.Medcin;
import ma.fstt.services.GestionAdminService;
import ma.fstt.services.GestionMedcinService;

@RestController
@RequestMapping("admin")
@CrossOrigin(origins="http://localhost:3000")
public class AdminController {
	
	@Autowired
	GestionAdminService gestionAdminService;
	
	@Autowired
	GestionMedcinService gestionMedcinService;

	@PostMapping("/login")
	public Admin getAllByDouleurs(@RequestBody Admin admin){
		
		return gestionAdminService.login(admin);
	}
	
	@PostMapping("/all")
	public List<Admin> listAdmin(@RequestBody Admin admin){
		return gestionAdminService.listAdmin(admin);
	}
	
	@PostMapping("/medcin/all")
	public List<Medcin> listAllMedcin(@RequestBody Admin admin){
		return gestionMedcinService.getAll();
	}
	
	@PostMapping("/delete/{id}")
	public String deleteAdmin(@RequestBody Admin admin, @PathVariable("id") String id){
		gestionAdminService.delete(admin, id);
		return "succes";
	}
	
	@PostMapping("/add/name/{name}/email/{email}")
	public Admin ajouterAdmin(@RequestBody Admin admin, @PathVariable("name") String name,
			@PathVariable("email") String email){
			return gestionAdminService.addAdmin(admin, name, email);
	}
	
	
}
