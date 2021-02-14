package ma.fstt.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fstt.dao.MedcinRepository;
import ma.fstt.entities.Medcin;
import ma.fstt.entities.Tags;

@Service
public class SearchMedcinService {
	@Autowired
	MedcinRepository medcinRepository;
	
	@Autowired
	TagsServices tagsServices;
	
	public List<Medcin> findAllByVille(String ville){
		return medcinRepository.findAllByVille(ville);
	}
	
	public List<Medcin> findAllBySpeciality(String speciality){
		return medcinRepository.findAllBySpeciality(speciality);
	}
	
	public List<Medcin> findAllByVilleAndSpecality(String ville, String speciality){
		return medcinRepository.findAllByVilleAndSpeciality(ville ,speciality);
	}
	
	public List<String> tokenize(String texte){
		List<String> tokens = new ArrayList();
		String token  = "";
		for(int i = 0; i < texte.length(); i++) {
			char pos = texte.charAt(i);
			if(Character.isDigit(pos) || Character.isLetter(pos)) {
				token += pos;
			}else {
				if(!token.equals("") && !tokens.contains(token))
					tokens.add(token);
				token = "";
			}
		}
		tokens.add(token);
		return tokens;
	}
	
	public List<Medcin> findBySymptomes(String symptomes){
		List<String> tokens = tokenize(symptomes);
		List<Tags> tags = tagsServices.findAll();
		
		for(String token : tokens) {
			for(Tags tag: tags) {
				if(tag.getTags().contains(token)) {
					return findAllBySpeciality(tag.getSpeciality());
				}
			}
		}
		
		return new ArrayList();
	}

}
