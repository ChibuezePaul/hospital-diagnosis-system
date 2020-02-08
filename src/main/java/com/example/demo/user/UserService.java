package com.example.demo.user;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.example.demo.diagnosis.Diagnosis;
import com.example.demo.person.Person;

public interface UserService {
	
//	Users Auth using User name and Password
//	String authenticateUser( String phoneNumber, String password, HttpServletRequest request);

	List<User> findAllUser(User user);
	
//	Get all the Columns in User table
	List<String> getColumns(String tblName);

//	Get Template for Users
	List<List<Map<String, String>>> getUserForTemplate(String tableDetails);

//	create new user
	String registerUser(String fName, String lName, String phoneNumber, String password);

	String registerPatient(Person person);

	List<Map<String, Object>> getRegForm();

	void deleteUser(Long id);

	List<Map<String, Object>> getStaffRegForm();
	
}
