package ma.fstt.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ma.fstt.entities.Medcin;

@Repository
public interface MedcinRepository extends MongoRepository<Medcin, String>{

	List<Medcin> findAllByVille(String ville);

	List<Medcin> findAllBySpeciality(String speciality);

	List<Medcin> findAllByVilleAndSpeciality(String ville, String speciality);


}
