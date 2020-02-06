package com.example.demo.patient;

import java.util.List;
import java.util.Map;

public interface PatientService {

	String createPatient(Patient patient);
	
	List<List<Map<String, String>>> getPatientForTemplate(String tableDetails);

	List<String> getColumns(String tblName);
	
	List<Map<String, Object>> getPatientForm(Long id);
	
	List<Map<String, Object>> getEmergencyPatientForm(Long id);
	
	Patient getPatientFromId(Long Id);
	
	String registerPatient(Patient patient);
	
	List<Patient> findPatient();	
	
}