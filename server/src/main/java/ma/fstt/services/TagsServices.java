package ma.fstt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fstt.dao.TagsRepository;
import ma.fstt.entities.Tags;

@Service
public class TagsServices {

	@Autowired
	TagsRepository tagsRepository;
	
	public Tags addTag(Tags tags) {
		return tagsRepository.save(tags);
	}
	
	public List<Tags> addAll(List<Tags> listTags){
		return tagsRepository.saveAll(listTags);
	}
	
	public List<Tags> findAll(){
		return tagsRepository.findAll();
	}
}
