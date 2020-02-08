package com.example.demo.dashboard;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DashboardController {
	
	@Autowired
	private DashboardService iconService;
	
//	Route to Admin HomePage
	@GetMapping({"/home","/"})
	public String home(Model model) {
		model.addAttribute("icon", new Dashboard());
		model.addAttribute("dashboard1", iconService.fetchIcon());
		return "admin/index";
	}

//	Add new item to dashboard
	@PostMapping(value="/save")
	public String redirect(@ModelAttribute("icon") Dashboard icon) {
		System.out.println("Print Val: "+icon.toString());
		iconService.addIcon(icon);
		return "redirect:/home";
	}
	 
//	Delete Items on dashboard
	@GetMapping("/delete")
	public String redirect(@RequestParam Long id) {
		iconService.removeIcon(id);
		return "redirect:/home";
	}

}
