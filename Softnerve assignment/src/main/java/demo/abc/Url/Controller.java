package demo.abc.Url;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import demo.abc.model.Patient;
import demo.abc.model.Repository.IMongoRepository;

@RestController
public class Controller {

	@Autowired
	IMongoRepository imongorepo;

	// FOR INSERT NEW DATA
	@PostMapping("/insert")
	public String setValue(@RequestBody Patient object) {
		imongorepo.insert(object);
		return "record saved in database successfully";
	}

	// FOR FIND DATA BY GIVEN ID WHICH IS EXIST IN DATABASE
	@GetMapping("/getbyid/{id}")
	public Optional<demo.abc.model.Patient> getValue(@PathVariable("id") int id) {
		Optional<demo.abc.model.Patient> findById = imongorepo.findById(id);
		// new ResponsePatient<>(findById, HttpStatus.OK);
		return findById;
	}

	// FOR DATA UPDATE WHICH IS EXIST IN DATABASE
	@PutMapping("/update")
	public String updateValue(@RequestBody Patient object) {
		imongorepo.save(object);
		return "record updated successfully in database";
	}

	// FOR DELETE DATA GIVEN BY ID WHICH IS EXIST IN DATABASE
	@DeleteMapping("/deletebyid/{id}")
	public String deleteValue(@PathVariable("id") int id) {
		imongorepo.deleteById(id);
		return "record deleted successfully from database of id : " + id;
	}

}
