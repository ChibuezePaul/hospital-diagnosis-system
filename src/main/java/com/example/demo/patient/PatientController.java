package com.example.demo.patient;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.diagnosis.Diagnosis;

@Controller
public class PatientController {
	
	
	@Autowired
	private PatientService patientService;
	
//	List of all Registered User 
	@GetMapping("/patient/list")
	public String show(Model model, HttpSession session) {
		if (session.getAttribute("MY_SESSION_MESSAGES")==null) {
			return "redirect:/login";
		}
		String tableName = "patient";
	    model.addAttribute("tbl", "patient");
	    model.addAttribute("tableHead", patientService.getColumns(tableName));
	    model.addAttribute("data", patientService.findPatient());
	    return "admin/patientRecord";
    }
	
	@GetMapping(value="/patient/new")
    public String creatPatient(HttpSession session, Model model) {
		if (session.getAttribute("MY_SESSION_MESSAGES")==null) {
			return "redirect:/login";
		}
		model.addAttribute("form", patientService.getPatientForm(null));
	    model.addAttribute("title", "Register Patient");
	    model.addAttribute("route", "patient");
		return "admin/form";
    }
		
	@PostMapping(value="/patient")
    public String sendDiagonise(@ModelAttribute("patient") Patient patient) {
		patientService.registerPatient(patient);     
		return "redirect:/patient/list";
    }
	
	@GetMapping(value="/emergencyAccount/new")
    public String emergencyAccount(HttpSession session, Model model) {
		if (session.getAttribute("MY_SESSION_MESSAGES")==null) {
			return "redirect:/login";
		}
		model.addAttribute("form", patientService.getEmergencyPatientForm(null));
	    model.addAttribute("title", "Register Patient");
	    model.addAttribute("route", "patient");
		return "admin/form";
    }
		
//	@PostMapping(value="/createEmergencyAccount")
//    public String createEmergencyAccount(@ModelAttribute("patient") Patient patient) {
//		patientService.registerPatient(patient);     
//		return "redirect:/patient/list";
//    }
}