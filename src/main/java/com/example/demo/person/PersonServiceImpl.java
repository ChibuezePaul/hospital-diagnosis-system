package com.example.demo.person;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	PasswordEncoder encode;
	
//	Add record of Staff or Patience 
	@Override
	public Person registerPerson(Person person) {
		String fName = person.getFirstName();
		String lName = person.getLastName();
		String address = person.getAddress();
		String email = person.getEmail();
		
		
		person.setFirstName(fName);
		person.setLastName(lName);
		person.setAddress(address);
		person.setEmail(email);
		
		return personRepository.save(person);
		
	}
	
	public List<Person> findPerson(){
		return personRepository.findAll();
	}

	@Override
	public void createPerson(Person person) {
		// TODO Auto-generated method stub
		
	}

//	Maps the fields in the UI to the appropriate data for list of Person
	@Override
	public List<List<Map<String, String>>> getPersonForTemplate(String tableDetails) {
		List <List<Map<String, String>>> returnList = new ArrayList<>();
		List<Person> persons = personRepository.findAll();
		for(Person person:persons) {
			List<Map<String, String>> _persons = new ArrayList<>();
			Map<String, String> personMap = new HashMap<>();
			personMap.put("id", person.getId().toString());
			personMap.put("first_name", person.getFirstName());
			personMap.put("last_name", person.getLastName());			
			personMap.put("address", person.getAddress());			
			personMap.put("email", person.getEmail());			
		
			_persons.add(personMap);
			returnList.add(_persons);
		}
		return returnList;	
	}

	@Override
	public List<String> getColumns(String tblName) {
		// TODO Auto-generated method stub
		return null;
	}

//	Contains the list of all the input field and passes it to the frontend for rendering
	@Override
	public List<Map<String, Object>> getPersonForm(Long id) {
	List<Map<String, Object>> returnObj = new ArrayList<>();
			
			Map<String, Object> fn = new HashMap<>();
			fn.put("fieldType", "text");
			fn.put("name", "firstName");
			fn.put("placeholder", "First Name");
			returnObj.add(fn);
			
			Map<String, Object> ln = new HashMap<>();
			ln.put("fieldType", "text");
			ln.put("name", "lastName");
			ln.put("placeholder", "Last Name");
			returnObj.add(ln);
			
			Map<String, Object> pn = new HashMap<>();
			pn.put("fieldType", "number");
			pn.put("name", "phoneNumber");
			pn.put("placeholder", "Phone Number");
			returnObj.add(pn);
			
			Map<String, Object> pw = new HashMap<>();
			pw.put("fieldType", "password");
			pw.put("name", "password");
			pw.put("placeholder", "Password");
			returnObj.add(pw);
	
			return returnObj;
	}

	@Override
	public Person getPersonFromId(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
