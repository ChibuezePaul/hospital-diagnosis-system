package com.example.demo.diagnosis;

import java.util.List;
import java.util.Map;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;


public interface DiagnosisService {
	
	List<Diagnosis> findAllDiagnosis(Diagnosis user);
	
	List<String> getColumns(String tblName);

	List<List<Map<String, String>>> getDiagnosisForTemplate(String tableDetails);

	List<Map<String, Object>> getDiagnosisForm(String id);

	List<Map<String, Object>> getDocReportForm(Diagnosis diagnosis);
	
	public Diagnosis getPatDiagForReport(Long id);
	
	public Diagnosis getOnePatDiagnosis(String fileNo);
	
	public Diagnosis docReport(String fileNo, String id, String docPresc);

	String diagonisePatient(Diagnosis diagnosis);

	Diagnosis postRslt(String resultReport, Long id, String tranType);

	
}