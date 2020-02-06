
package com.example.demo.user;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.activityLog.ActivityLog;
import com.example.demo.activityLog.ActivityLogRepository;
import com.example.demo.diagnosis.Diagnosis;
import com.example.demo.person.Person;
import com.example.demo.person.PersonRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PersonRepository personRepository;

	@Autowired
	private ActivityLogRepository activityLogRepository;
	
	@Autowired
	PasswordEncoder encode;
	
//	Authenticate Users login
	@Override
	public String authenticateUser(String phoneNumber, String password, HttpServletRequest request) {
	
		String checkPhoneNo = null;
		String checkUserPassword = null;
		List<User> userAuth= userRepository.findByPhoneNumber(phoneNumber);
		String loginAuth="";
//		Checks if user already exist
		if (userAuth.isEmpty()) {
//			If User doesn't  exists
			return "login";
		}
		else {
//			if phone number doesn't exist
			checkPhoneNo = userAuth.get(0).getPhoneNumber();
			checkUserPassword = userAuth.get(0).getPassword();

			if((phoneNumber.equalsIgnoreCase(checkPhoneNo)) && (encode.matches(password, checkUserPassword))) {				
				
//				Log The event
				ActivityLog activityLog = new ActivityLog(phoneNumber+" Logged in", LocalDateTime.now());
				activityLogRepository.save(activityLog);

				loginAuth ="success";
			}
			return loginAuth;
		}
	}

//	Returns a list of all registered user
	@Override
	public List<User> findAllUser(User user) {
		return userRepository.findAll();
	}

//	Get the User Table Column Names 
	@Override
	public List<String> getColumns(String tblName) {
		return userRepository.getColName(tblName);
	}

//	Get a list of all registered users and maps it with a key value pair 
//	For it to map appropriately to the right column on the front-end
	@Override
	public List<List<Map<String, String>>> getUserForTemplate(String tableDetails) {

		List <List<Map<String, String>>> returnList = new ArrayList<>();
		List<User> users = userRepository.findAll();
		for(User user:users) {
			List<Map<String, String>> _users = new ArrayList<>();
			Map<String, String> userMap = new HashMap<>();
			userMap.put("id", user.getId().toString());
			userMap.put("phone_number", user.getPhoneNumber());
			userMap.put("password", user.getPassword());			
		
			_users.add(userMap);
			returnList.add(_users);
		}
		return returnList;	
	}
	
//	Returns the fields in the Create User form
	@Override
	public List<Map<String, Object>> getStaffRegForm() {
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
	

	
//	Returns the fields in the Create Patient form
	@Override
	public List<Map<String, Object>> getRegForm() {
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
		
		Map<String, Object> ra = new HashMap<>();
		ra.put("fieldType", "text");
		ra.put("name", "resAddress");
		ra.put("placeholder", "Residential Address");
		returnObj.add(ra);
		
		
			List <String> option = new ArrayList<String>();
			option.add("State of Residence");
			option.add("Abia State");
			option.add("Adamawa State");
			option.add("Akwa Ibom State");
			option.add("Anambra State");
			option.add("Bauchi State");
			option.add("Bayelsa State");
			option.add("Benue State");
			option.add("Borno State");
			option.add("Cross River State");
			option.add("Delta State");
			option.add("Ebonyi State");
			option.add("Edo State");
			option.add("Ekiti State");
			option.add("Enugu State");
			option.add("Federal Capital Territory");
			option.add("Gombe State");
			option.add("Imo State");
			option.add("Jigawa State");
			option.add("Kaduna State");
			option.add("Kano State");
			option.add("Katsina State");
			option.add("Kebbi State");
			option.add("Kogi State");
			option.add("Kwara State");
			option.add("Lagos State");
			option.add("Nasarawa State");
			option.add("Niger State");
			option.add("Ogun State");
			option.add("Ondo State");
			option.add("Osun State");
			option.add("Oyo State");
			option.add("Plateau State");
			option.add("Rivers State");
			option.add("Sokoto State");
			option.add("Taraba State");
			option.add("Yobe State");
			option.add("Zamfara State");
	
		
		Map<String, Object> sor = new HashMap<>();
		sor.put("fieldType", "select");
		sor.put("name", "stateOfResidence");
		sor.put("option", option);
		sor.put("placeholder", "State of Origin");
		returnObj.add(sor);
		
		
		Map<String, Object> lm = new HashMap<>();
		lm.put("fieldType", "text");
		lm.put("name", "landMark");
		lm.put("placeholder", "Land Mark");
		returnObj.add(lm);
		
		Map<String, Object> sex = new HashMap<>();
		sex.put("fieldType", "text");
		sex.put("name", "sex");
		sex.put("placeholder", "Sex");
		returnObj.add(sex);
		
		Map<String, Object> dob = new HashMap<>();
		dob.put("fieldType", "text");
		dob.put("name", "bloodGrp");
		dob.put("placeholder", "Blood Group");
		returnObj.add(dob);

		Map<String, Object> gt = new HashMap<>();
		gt.put("fieldType", "text");
		gt.put("name", "genotype");
		gt.put("placeholder", "Genotype");
		returnObj.add(gt);
		
		Map<String, Object> all = new HashMap<>();
		all.put("fieldType", "text");
		all.put("name", "allegies");
		all.put("placeholder", "Allegies");
		returnObj.add(all);
		
		Map<String, Object> gd = new HashMap<>();
		gd.put("fieldType", "text");
		gd.put("name", "guardian");
		gd.put("placeholder", "Guardian");
		returnObj.add(gd);
		
		Map<String, Object> rel = new HashMap<>();
		rel.put("fieldType", "text");
		rel.put("name", "relationship");
		rel.put("placeholder", "Relationship");
		
		Map<String, Object> addr = new HashMap<>();
		addr.put("fieldType", "text");
		addr.put("name", "guardianAddress");
		addr.put("placeholder", "Address");
		returnObj.add(addr);
		
		Map<String, Object> phn = new HashMap<>();
		phn.put("fieldType", "number");
		phn.put("name", "guardianPhNo");
		phn.put("placeholder", "Guardian Phone Number");
		returnObj.add(phn);
		return returnObj;
	}
	
//	Add new User
	@Override
	public String registerUser(String fName, String lName, String phoneNumber, String password) {
	
		List<User> userAuth= userRepository.findByPhoneNumber(phoneNumber);
//		checks if phone number exists
		if (!userAuth.isEmpty()) {
//			if phone number exists
			return "admin/form";
		}
		else {
			System.out.println(fName +" ============== The firstName ============="+ lName);

//			If phone number doesnt exist
			String phoneNoTrim = phoneNumber.trim();
			String encodedPassword = encode.encode(password);
			
			User user =new User(phoneNumber, encodedPassword);
			user.setPhoneNumber(phoneNoTrim);
			user.setPassword(encodedPassword);
			user.setFirstName(fName);
			user.setLastName(lName);
			
			Person person = new Person();
			person.setFirstName(fName);
			person.setLastName(lName);
			
			person.setUser(user);
			personRepository.save(person);
			
	//		Log The event
			ActivityLog activityLog = new ActivityLog("New User Created", LocalDateTime.now());
			activityLogRepository.save(activityLog);
			
			return "redirect:/home";
		}
	}
	
	
	@Override
	public String registerPatient(Person person) {
	
		List<Person> userAuth= personRepository.findByPhoneNumber(person.getPhoneNumber());
//		checks if phone number exists
		if (!userAuth.isEmpty()) {
//			if phone number exists
			return "redirect:/Reg";
		}
		else {
//			If phone number doesnt exist
			
			personRepository.save(person);
			
	//		Log The event
			ActivityLog activityLog = new ActivityLog("New User Created", LocalDateTime.now());
			activityLogRepository.save(activityLog);
			
			return "redirect:/home";
		}
	}

	@Override
	public User deleteUser(Long id) {
		personRepository.deleteById(id-1);
		return null;
	}
}

