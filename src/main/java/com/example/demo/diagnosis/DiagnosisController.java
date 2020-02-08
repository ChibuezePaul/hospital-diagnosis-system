package com.example.demo.diagnosis;

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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.person.Person;


@Controller
public class DiagnosisController {
	
	
	@Autowired
	private DiagnosisService diagnosisService;
	
	@Autowired
	DiagnosisRepository diagnosisRepository;
	
//	Record Diagnosis
//	@GetMapping(value="/diagonise/new")
//    public String Diagnosis(HttpSession session, Model model) {
//		if (session.getAttribute("MY_SESSION_MESSAGES")==null) {
//			return "redirect:/login";
//		}
//		model.addAttribute("form", diagnosisService.getDiagnosisForm());
//	    model.addAttribute("title", "Diagonise Patient");
//	    model.addAttribute("route", "diagonize");
//		return "admin/form";
//    }
	
	@PostMapping(value="/diagonize")
    public String diagonize(@ModelAttribute("diagnosis") Diagnosis diagnosis, Model model) {
		String resp = diagnosisService.diagonisePatient(diagnosis); 
		if(resp.equalsIgnoreCase("Failed")){
			return "redirect:/patient/list";
		}
		 model.addAttribute("diagnosis", diagnosis);

		 model.addAttribute("title", "Diagnosis Result");
		 model.addAttribute("route", "testRslt");
		return "admin/report";
		
    }
	
//	List of all Diagonized Patients
	@GetMapping("/diagnosis/list")
	public String show(Model model) {
		String tableName = "diagnosis";
	    model.addAttribute("tbl", "diagnosis");
	    model.addAttribute("tableHead", diagnosisService.getColumns(tableName));
	    model.addAttribute("data", diagnosisService.findAllDiagnosis(null));
//	    model.addAttribute("data", diagnosisService.getDiagnosisForTemplate(tableName));
	    return "admin/diagnosisView";
    }

//	Doctor's Report
	@GetMapping(value="/diagnosis/{id}")
    public String docReport(@PathVariable("id") String id, Model model) {
	    model.addAttribute("title", "Diagonise Patient");
	    model.addAttribute("route", "diagonize");
		model.addAttribute("form", diagnosisService.getDiagnosisForm(id));

		return "admin/form";
    }
	

	@PostMapping(value="/docReport")
    public String report(WebRequest webRequest, HttpServletRequest request) {
	
		String fileNo = webRequest.getParameter("fileNo");
		String id = webRequest.getParameter("id");
		String diagRslt = webRequest.getParameter("docReport");

		System.out.println("THE ID IS "+ id);
		diagnosisService.docReport(fileNo, id, diagRslt);
		
		return "admin/report";
    }
	
//	Redirect to list of diagonized patient
	@GetMapping(value="/diagnosis/delete/{id}")
    public String delete(@PathVariable("id") Long id, Model model) {
		return "redirect:/diagnosis/list";
    }
	
	@GetMapping(value= "/testRslt")
    public String testRslt(Model model) {
		model.addAttribute("title", "Diagonise Patient");
	    model.addAttribute("route", "diagonize");
		return "admin/report";
    }

	@GetMapping(value="/testRslt/{id}")
    public String enterTestRslt(@PathVariable("id") Long id, Model model) {
		Diagnosis diagnosis = diagnosisService.getPatDiagForReport(id);
		model.addAttribute("diagnosis", diagnosis);
		model.addAttribute("title", "Diagnosis Result");
		model.addAttribute("route", "testRslt");
		return "admin/report";
    }
	
	@PostMapping(value="/testRslt")
    public String postRslt(@ModelAttribute("diagnosis") Diagnosis diagnosis, WebRequest webRequest) {
		System.out.println(" JESUS IS LORD "+diagnosis);
		diagnosisService.postRslt(diagnosis.getTestReslt(), diagnosis.getId(), "result");

		return "redirect:/diagnosis/list";
    }
	
	@GetMapping(value="/enterDocReport/{id}")
    public String enterDocReport(@PathVariable("id") Long id, Model model) {
		Diagnosis diagnosis = diagnosisService.getPatDiagForReport(id);
//		model.addAttribute("form", diagnosisService.getDocReportForm(diagnosis));
		model.addAttribute("diagnosis", diagnosis);
		model.addAttribute("title", "Doctor's Report");
		model.addAttribute("route", "postDocReport");
		return "admin/docReport";
    }
	
	@PostMapping(value="/postDocReport")
    public String postDocReport(@ModelAttribute("diagnosis") Diagnosis diagnosis, WebRequest webRequest) {
		System.out.println("I AM THE ONE HERE !! "+diagnosis.getDocPrescription());
		diagnosisService.postRslt(diagnosis.getDocPrescription(), diagnosis.getId(), "docPres");
		return "redirect:/diagnosis/list";
    }
	
}


