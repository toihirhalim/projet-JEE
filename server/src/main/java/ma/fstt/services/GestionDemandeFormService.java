package ma.fstt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fstt.dao.AdminRepository;
import ma.fstt.dao.DemandeFormRepository;
import ma.fstt.entities.Admin;
import ma.fstt.entities.Adress;
import ma.fstt.entities.Clinique;
import ma.fstt.entities.DemandeForm;
import ma.fstt.entities.Medcin;
import ma.fstt.entities.WebSite;

@Service
public class GestionDemandeFormService {
	
	@Autowired
	DemandeFormRepository demandeFormRepository;
	
	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	GestionMedcinService gestionMedcinService;
	
	public Admin loginAdmin(Admin admin) {
		return adminRepository.findByEmailAndPassword(admin.getEmail(), admin.getPassword());
	}

	public List<DemandeForm> listDemandesForm(Admin admin) {
		// TODO Auto-generated method stub
		if(loginAdmin(admin) != null)
			return demandeFormRepository.findAll();
		return null;
	}
	
	
	public void deleteForm(Admin admin, String idForm) {
		demandeFormRepository.deleteById(idForm);
		//send email
	}

	public Medcin acceptForm(Admin admin, String idForm) {
		if(loginAdmin(admin) == null) return null;
		
		DemandeForm form = demandeFormRepository.findById(idForm).orElse(null);
		
		if(form != null) {
			//create medcin profile && send email
			Medcin medcin = formToMedcin(form);
			//medcin = gestionMedcinService.saveMedcin(medcin);
			return medcin;
		}
		return null;
	}
	
	public Medcin formToMedcin(DemandeForm form) {
		Medcin medcin = new Medcin();
		medcin.setName(form.getName());
		medcin.setVille(form.getVille());
		medcin.setSpeciality(form.getSpeciality());
		
		Clinique clinique = new Clinique();	
		clinique.setName(form.getCliniqueName());
		clinique.setOppenAt(form.getOppenAt());
		clinique.setCloseAt(form.getCloseAt());
		clinique.setNumber(form.getNumber());
		clinique.setEmail(form.getPublicEmail());
		
		Adress adress = new Adress();
		adress.setLocation(form.getAdress());
		
		WebSite webSite = new WebSite();
		webSite.setName(form.getWebSiteName());
		webSite.setUrl(form.getWebSiteUrl());
		
		clinique.setAdress(adress);
		clinique.setWebSite(webSite);
		
		medcin.setClinique(clinique);
		
		return medcin;
	}
	
	
	
	
	
	
}
