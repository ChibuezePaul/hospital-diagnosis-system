package com.example.demo.patient;
import java.security.SecureRandom;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	private PatientRepository patientRepository;
	
//	Add record of Staff or Patience 
	@Override
	public String registerPatient(Patient patient) {
		System.out.println("before HOS");
		SecureRandom random = new SecureRandom();
		int num = random.nextInt(100000);
		String formatted = String.format("%05d", num);
		
		String fileNo =  "HOS_"+formatted;
//		String fileNo = "HOS_"+LocalDateTime.now();
		System.out.println("after HOS");
		patient.setFileNo(fileNo);
		patientRepository.save(patient);
		return "successful";

	}
	
	public List<Patient> findPatient(){
		return patientRepository.findAll();
	}

	@Override
	public String createPatient(Patient patient) {
		return null;
		// TODO Auto-generated method stub
		
	}

//	Maps the fields in the UI to the appropriate data for list of Person
	@Override
	public List<List<Map<String, String>>> getPatientForTemplate(String tableDetails) {
		List <List<Map<String, String>>> returnList = new ArrayList<>();
		List<Patient> patients = patientRepository.findAll();
		for(Patient patient:patients) {
			List<Map<String, String>> _patient = new ArrayList<>();
			Map<String, String> patientMap = new HashMap<>();
			patientMap.put("id", patient.getId().toString());
			patientMap.put("first_name", patient.getFirstName());
			patientMap.put("last_name", patient.getLastName());			
			patientMap.put("address", patient.getAddress());			
			patientMap.put("dob", patient.getDob());			
			patientMap.put("file_no", patient.getFileNo());			
			patientMap.put("state_of_origin", patient.getStateOfOrigin());			
			patientMap.put("nationality", patient.getNationality());			
			patientMap.put("phone_no", patient.getPhoneNo());			
			patientMap.put("gender", patient.getGender());			
			patientMap.put("age", patient.getAge());			
			patientMap.put("weight", patient.getWeight());			
			patientMap.put("guardian_name", patient.getGuardianName());			
			patientMap.put("guardian_address", patient.getGuardianAddress());			
			patientMap.put("guardian_ph_no", patient.getGuardianPhNo());			
		
			_patient.add(patientMap);
			returnList.add(_patient);
		}
		return returnList;	
	}

	@Override
	public List<String> getColumns(String tblName) {
		// TODO Auto-generated method stub
		return patientRepository.getColName(tblName);
	}

//	Contains the list of all the input field and passes it to the frontend for rendering
	@Override
	public List<Map<String, Object>> getPatientForm(Long id) {
	
	Patient patient = null;
	List<Map<String, Object>> returnObj = new ArrayList<>();
		if(id == null) {
			patient = new Patient();
		}else {
			try {
				patient = getPatientFromId(id);
			}catch(Exception e) {
				//
				System.out.println(e);
			}
		}
		
			
//			Map<String, Object> fileNo = new HashMap<>();
//			fileNo.put("fieldType", "text");
//			fileNo.put("name", "fileNo");
//			fileNo.put("placeholder", "File Number");
//			returnObj.add(fileNo);
			
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
			
			Map<String, Object> addr = new HashMap<>();
			addr.put("fieldType", "text");
			addr.put("name", "address");
			addr.put("placeholder", "Address");
			returnObj.add(addr);
			
			Map<String, Object> dob = new HashMap<>();
			dob.put("fieldType", "date");
			dob.put("name", "dob");
			dob.put("placeholder", "Date of Birth");
			returnObj.add(dob);
			
			List <String> option = new ArrayList<String>();
			option.add("State of Origin");
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
		sor.put("name", "stateOfOrigin");
		sor.put("option", option);
		sor.put("placeholder", "State of Origin");
		returnObj.add(sor);
	
			Map<String, Object> nationality = new HashMap<>();
			nationality.put("fieldType", "text");
			nationality.put("name", "nationality");
			nationality.put("placeholder", "Nationality");
			returnObj.add(nationality);
		
			Map<String, Object> pn = new HashMap<>();
			pn.put("fieldType", "number");
			pn.put("name", "phoneNo");
			pn.put("placeholder", "Phone Number");
			returnObj.add(pn);
			
			Map<String, Object> gender = new HashMap<>();
			gender.put("fieldType", "text");
			gender.put("name", "gender");
			gender.put("placeholder", "Gender");
			returnObj.add(gender);

			Map<String, Object> age = new HashMap<>();
			age.put("fieldType", "text");
			age.put("name", "age");
			age.put("placeholder", "Age");
			returnObj.add(age);

			Map<String, Object> weight = new HashMap<>();
			weight.put("fieldType", "text");
			weight.put("name", "weight");
			weight.put("placeholder", "Weight");
			returnObj.add(weight);

			Map<String, Object> gd = new HashMap<>();
			gd.put("fieldType", "text");
			gd.put("name", "guardianName");
			gd.put("placeholder", "Guardian Name");
			returnObj.add(gd);
			
			Map<String, Object> gdAddr = new HashMap<>();
			gdAddr.put("fieldType", "text");
			gdAddr.put("name", "guardianAddress");
			gdAddr.put("placeholder", "Guadian Address");
			returnObj.add(gdAddr);
			
			Map<String, Object> phn = new HashMap<>();
			phn.put("fieldType", "number");
			phn.put("name", "guardianPhNo");
			phn.put("placeholder", "Guardian Phone Number");
			returnObj.add(phn);
			
			return returnObj;
	}

	@Override
	public Patient getPatientFromId(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getEmergencyPatientForm(Long id) {
		Patient patient = null;
		List<Map<String, Object>> returnObj = new ArrayList<>();
			if(id == null) {
				patient = new Patient();
			}else {
				try {
					patient = getPatientFromId(id);
				}catch(Exception e) {
					//
					System.out.println(e);
				}
			}
			
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
		
		Map<String, Object> gender = new HashMap<>();
		gender.put("fieldType", "text");
		gender.put("name", "gender");
		gender.put("placeholder", "Gender");
		returnObj.add(gender);
		
		Map<String, Object> age = new HashMap<>();
		age.put("fieldType", "text");
		age.put("name", "age");
		age.put("placeholder", "Age Range");
		returnObj.add(age);
		
		Map<String, Object> bdShap = new HashMap<>();
		bdShap.put("fieldType", "text");
		bdShap.put("name", "bodyShape");
		bdShap.put("placeholder", "Body Shape");
		returnObj.add(bdShap);
		
		Map<String, Object> height = new HashMap<>();
		height.put("fieldType", "text");
		height.put("name", "height");
		height.put("placeholder", "Height");
		returnObj.add(height);
		
		Map<String, Object> comp = new HashMap<>();
		comp.put("fieldType", "text");
		comp.put("name", "complexion");
		comp.put("placeholder", "Complexion");
		returnObj.add(comp);
		
		Map<String, Object> da = new HashMap<>();
		da.put("fieldType", "date");
		da.put("name", "dateAdmitted");
		da.put("placeholder", "Date Admitted");
		returnObj.add(da);
		
		return returnObj;
	}
	

}
