package ma.fstt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fstt.dao.MedcinRepository;
import ma.fstt.entities.Medcin;

@Service
public class GestionMedcinService {
	@Autowired
	MedcinRepository medcinRepository;
	
	public List<Medcin> saveAll(List<Medcin> medcins){
		return medcinRepository.saveAll(medcins);
	}
	
	public List<Medcin> getAll(){
		return medcinRepository.findAll();
	}
	
	public Medcin addMedcin(Medcin medcin) {
		return medcinRepository.save(medcin);
	}
}
