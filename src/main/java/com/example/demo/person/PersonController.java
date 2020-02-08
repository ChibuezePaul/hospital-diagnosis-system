package com.example.demo.person;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {
	
	
	@Autowired
	private PersonService personService;
	
//	List of all Registered User 
	@GetMapping("/registered/list")
	public String show(Model model) {
		String tableName = "user";
	    model.addAttribute("tbl", "user");
	    model.addAttribute("tableHead", personService.getColumns(tableName));
	    model.addAttribute("data", personService.getPersonForTemplate(tableName));
	    return "admin/record";
    }
}