package demo.abc.model.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import demo.abc.model.Patient;

public interface IMongoRepository extends MongoRepository<Patient, Integer>{
	
}
