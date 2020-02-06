package com.example.demo.person;

import java.util.List;
import java.util.Map;

public interface PersonService {

	void createPerson(Person person);
	
	List<List<Map<String, String>>> getPersonForTemplate(String tableDetails);

	List<String> getColumns(String tblName);
	
	List<Map<String, Object>> getPersonForm(Long id);
	
	Person getPersonFromId(Long Id);
	
	Person registerPerson(Person person);
	
	List<Person> findPerson();	
	
}