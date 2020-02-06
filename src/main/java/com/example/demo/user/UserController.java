package com.example.demo.user;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
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

//	Login Page, directly accessible over the URL
	@GetMapping(value= "/login")
    public String index(Model model, HttpSession session) {
		if (session.getAttribute("MY_SESSION_MESSAGES")==null) {
			return "login";
		}
		return "redirect:/home";
    }

//	Login Authentication
	@PostMapping(value="/auth")
    public String auth(WebRequest webRequest, HttpServletRequest request) {
		String phoneNumber = webRequest.getParameter("phoneNumber");
		String password = webRequest.getParameter("password");
		String response=  userService.authenticateUser(phoneNumber, password, null);
		
		if (response.equals("success")) {
			@SuppressWarnings("unchecked")
			List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
			if (messages == null) {
				messages = new ArrayList<>();
				messages.add(phoneNumber);
				request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
				System.out.println("MY MESSAGE"+ messages);
			}		
			return "redirect:/home";
		}
		
		return "login";
		
    }
	
//	Registration for staff Page, directly accessible over the URL
	@GetMapping(value="/signup")
    public String signUp(HttpSession session, Model model) {
		if (session.getAttribute("MY_SESSION_MESSAGES")==null) {
			return "redirect:/login";
		}
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
    public String RegisterPatient(HttpSession session, Model model) {
		if (session.getAttribute("MY_SESSION_MESSAGES")==null) {
			return "redirect:/login";
		}
		
		model.addAttribute("form", userService.getRegForm());
	    model.addAttribute("title", "Register Patient");
	    model.addAttribute("route", "registerPatient");
		return "admin/form";
    }
//	Registration Authentication and implementation
	@PostMapping(value="/registerPatient")
    public String register(@ModelAttribute("person") Person person, WebRequest webRequest) {
		return userService.registerPatient(person);     
    }


//	List of all Registered User with their login Details
	@GetMapping("/user/list")
	public String show(Model model, HttpSession session) {
		if (session.getAttribute("MY_SESSION_MESSAGES")==null) {
			return "redirect:/login";
		}
		String tableName = "user";
	    model.addAttribute("tbl", "user");
	    model.addAttribute("tableHead", userService.getColumns(tableName));
	    model.addAttribute("data", userService.findAllUser(null));
	    return "admin/listUser";
    }
	
	@GetMapping(value="/user/{id}")
    public String docReport(@PathVariable("id") Long id, HttpSession session, Model model) {
		if (session.getAttribute("MY_SESSION_MESSAGES")==null) {
			return "redirect:/login";
		}

		return "redirect:/user/list";
    }
	
//	Delete User
	@GetMapping(value="/user/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id, HttpSession session, Model model) {
		if (session.getAttribute("MY_SESSION_MESSAGES")==null) {
			return "redirect:/login";
		}
		User user = userService.deleteUser(id);
		return "redirect:/user/list";
    }
	
//	Logout, directly accessible over the URL
	@GetMapping(value="/logout")
    public String logOut(Model model, HttpServletRequest request) {
		request.getSession().invalidate();
		return "login";
    }
	
//	View Admin Dashboard
	@GetMapping("/admin")
	public String adminHome() {
		return "admin/index";
	}
	
}