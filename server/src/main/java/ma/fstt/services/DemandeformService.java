package ma.fstt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fstt.dao.DemandeFormRepository;
import ma.fstt.entities.DemandeForm;
import ma.fstt.sequences.SequenceGenerator;

@Service
public class DemandeformService {
	@Autowired
	DemandeFormRepository demandeFormRepository;
	
	@Autowired
	SequenceGenerator Sequencesenerator;
	
	public DemandeForm saveDemandeForm(DemandeForm form) {
		if(form == null) return null;
				
		if(form.getId() == null) {
			form.setId("" + Sequencesenerator.generateSequence(DemandeForm.SEQUENCE_NAME));
		}
			
		return demandeFormRepository.save(form);
	}
	
	public DemandeForm addForm(DemandeForm form) {
		return saveDemandeForm(form);
	}
}
