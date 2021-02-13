package ma.fstt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fstt.dao.MedcinRepository;
import ma.fstt.entities.Medcin;

@Service
public class SearchMedcinService {
	@Autowired
	MedcinRepository medcinRepository;
	
	public List<Medcin> findAllByVille(String ville){
		return medcinRepository.findAllByVille(ville);
	}
	
	public List<Medcin> findAllBySpecality(String speciality){
		return medcinRepository.findAllBySpeciality(speciality);
	}
	
	public List<Medcin> findAllByVilleAndSpecality(String ville, String speciality){
		return medcinRepository.findAllByVilleAndSpeciality(ville ,speciality);
	}

}
