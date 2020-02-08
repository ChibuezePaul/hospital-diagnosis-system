package com.example.demo.user;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import com.example.demo.diagnosis.Diagnosis;
import com.example.demo.person.Person;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PasswordEncoder encoder;

//	Login Page, handled by spring-security
	@GetMapping(value= "/login")
    public String index() {
		if(userRepository.findAll ().isEmpty ()){
			userRepository.save ( new User ("su", encoder.encode ( "." ), "su", "su", Roles.ADMIN ) );
			System.out.println (userRepository.findAll ());
		}
		userRepository.findAll ();
		return "login";
    }
    
//	Registration for staff Page, directly accessible over the URL
	@GetMapping(value="/signup")
    public String signUp(Model model) {
		model.addAttribute("form", userService.getStaffRegForm());
	    model.addAttribute("title", "Add User");
	    model.addAttribute("route", "register");
		return "admin/form";
    }

//	Registration Authentication and implementation
	@PostMapping(value="/register")
    public String register(WebRequest webRequest) {
		String fName = webRequest.getParameter("firstName");
		String lName = webRequest.getParameter("lastName");
		String phoneNumber = webRequest.getParameter("phoneNumber");
		String password = webRequest.getParameter("password");
		System.out.println(fName +" The firstName "+ lName);
		return userService.registerUser(fName, lName, phoneNumber, password);     
    }
	
//	Registration for Patients, directly accessible over the URL
	@GetMapping(value="/reg")
    public String RegisterPatient(Model model) {
		model.addAttribute("form", userService.getRegForm());
	    model.addAttribute("title", "Register Patient");
	    model.addAttribute("route", "registerPatient");
		return "admin/form";
    }
//	Registration Authentication and implementation
	@PostMapping(value="/registerPatient")
    public String register(@ModelAttribute("person") Person person) {
		return userService.registerPatient(person);     
    }


//	List of all Registered User with their login Details
	@GetMapping("/user/list")
	public String show(Model model) {
		String tableName = "user";
	    model.addAttribute("tbl", "user");
	    model.addAttribute("tableHead", userService.getColumns(tableName));
	    model.addAttribute("data", userService.findAllUser(null));
	    return "admin/listUser";
    }
	
	@GetMapping(value="/user/{id}")
    public String docReport(@PathVariable("id") Long id, Model model) {
		return "redirect:/user/list";
    }
	
//	Delete User
	@GetMapping(value="/user/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id, Model model) {
		userService.deleteUser(id);
		return "redirect:/user/list";
    }
	
//	Logout, handled by spring-security
	@GetMapping(value="/logout")
    public String logOut() {
		return "login";
    }
	
//	View Admin Dashboard
	@GetMapping("/admin")
	public String adminHome() {
		return "admin/index";
	}
	
}