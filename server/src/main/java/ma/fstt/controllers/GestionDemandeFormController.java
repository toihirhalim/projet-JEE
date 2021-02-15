package ma.fstt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.fstt.entities.DemandeForm;
import ma.fstt.services.GestionDemandeFormService;

@RestController
@RequestMapping("form")
@CrossOrigin(origins="http://localhost:3000")
public class GestionDemandeFormController {
	
	@Autowired
	GestionDemandeFormService gestionDemandeForm;

	@PostMapping("/add")
	public DemandeForm getAllByDouleurs(@RequestBody DemandeForm form){
		
		return gestionDemandeForm.addForm(form);
	}
}
