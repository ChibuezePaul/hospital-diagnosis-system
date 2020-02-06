package com.example.demo.diagnosis;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.activityLog.ActivityLog;
import com.example.demo.activityLog.ActivityLogRepository;
import com.example.demo.patient.Patient;
import com.example.demo.patient.PatientRepository;

@Service
public class DiagnosisServiceImpl implements DiagnosisService{

	@Autowired
	private DiagnosisRepository diagnosisRepository;
	
	@Autowired
	private ActivityLogRepository activityLogRepository;

	@Autowired
	private PatientRepository patientRepository;
    
	Logger logger = LoggerFactory.getLogger(this.getClass());

	private String yes = "Yes";
	
	@Override
	public List<Diagnosis> findAllDiagnosis(Diagnosis user) {
		return diagnosisRepository.findAll();
	}

	@Override
	public List<String> getColumns(String tblName) {
		return diagnosisRepository.getColName(tblName);
	}

//	Maps the fields in the UI to the appropriate data for list of Diagnosis
	@Override
	public List<List<Map<String, String>>> getDiagnosisForTemplate(String tableDetails) {
		
		
		List <List<Map<String, String>>> returnList = new ArrayList<>();
		List<Diagnosis> diagnosis = diagnosisRepository.findAll();
		for(Diagnosis diagonize:diagnosis) {
			List<Map<String, String>> _diag = new ArrayList<>();
			Map<String, String> diagMap = new HashMap<>();
			diagMap.put("id", diagonize.getId().toString());
			diagMap.put("ache_duration", diagonize.getAcheDuration());			
			diagMap.put("appetite_loss", diagonize.getAppetiteLoss());			
			diagMap.put("bitter_tongue", diagonize.getBitterTongue());				
			diagMap.put("chest_pain", diagonize.getChestPain());			
			diagMap.put("cold", diagonize.getCold());			
			diagMap.put("cough", diagonize.getCough());			
//			diagMap.put("date_created", diagonize.getDateCreated());			
//			diagMap.put("date_modified", diagonize.getDateModified());			
			diagMap.put("dehydration", diagonize.getDehydration());			
			diagMap.put("fever", diagonize.getFever());			
			diagMap.put("head_ache", diagonize.getHeadAche());			
			diagMap.put("muscle_pain", diagonize.getMusclePain());			
			diagMap.put("nausea", diagonize.getNausea());			
			diagMap.put("others", diagonize.getOthers());			
			diagMap.put("file_no", diagonize.getFileNo());			
			diagMap.put("rash", diagonize.getRash());			
			diagMap.put("red_eye", diagonize.getRedEye());			
			diagMap.put("stomach_pain", diagonize.getStomachPain());			
			diagMap.put("stooling", diagonize.getStooling());			
			diagMap.put("stress", diagonize.getStress());			
			diagMap.put("sweating", diagonize.getSweating());			
			diagMap.put("tiredness", diagonize.getTiredness());			
			diagMap.put("ulcer_pat", diagonize.getUlcerPat());			
			diagMap.put("vomitting", diagonize.getVomitting());			
			diagMap.put("wieght_loss", diagonize.getWieghtLoss());				
			diagMap.put("doc_prescription", diagonize.getDocPrescription());				
			_diag.add(diagMap);
			returnList.add(_diag);
			System.out.println("OK "+_diag);
		}
		return returnList;	
	}

//	Contains the list of all the input field and passes it to the frontend for rendering
	@Override
	public List<Map<String, Object>> getDiagnosisForm(String id) {
		
		List<Map<String, Object>> returnObj = new ArrayList<>();	
		
		Map<String, Object> pn = new HashMap<>();
		pn.put("fieldType", "text");
		pn.put("name", "fileNo");
		pn.put("value", id);
		pn.put("placeholder", "File Number");
		returnObj.add(pn);
		
			List <String> ache = new ArrayList<String>();
			ache.add("Head Ache?");
			ache.add(yes);
			ache.add("No");
			ache.add("Not Sure");
		
		Map<String, Object> ha = new HashMap<>();
		ha.put("fieldType", "select");
		ha.put("name", "headAche");
		ha.put("option", ache);
		returnObj.add(ha);
			
		Map<String, Object> ht = new HashMap<>();
		ht.put("fieldType", "text");
		ht.put("name", "acheDuration");
		ht.put("placeholder", "Duration?");
		returnObj.add(ht);
			
			List <String> stomachPain = new ArrayList<String>();
			stomachPain.add("Stomach Pain?");
			stomachPain.add(yes);
			stomachPain.add("No");
			stomachPain.add("Not Sure");
		Map<String, Object> sp = new HashMap<>();
		sp.put("fieldType", "select");
		sp.put("name", "stomachPain");
		sp.put("option", stomachPain);
		returnObj.add(sp);
		
			List <String> fever = new ArrayList<String>();
			fever.add("Feverish?");
			fever.add(yes);
			fever.add("No");
			fever.add("Not Sure");		
		Map<String, Object> fv = new HashMap<>();
		fv.put("fieldType", "select");
		fv.put("name", "fever");
		fv.put("option", fever);
		returnObj.add(fv);
			
			List <String> cold = new ArrayList<String>();
			cold.add("Cold?");
			cold.add(yes);
			cold.add("No");
			cold.add("Not Sure");	
		Map<String, Object> co = new HashMap<>();
		co.put("fieldType", "select");
		co.put("name", "cold");
		co.put("option", cold);
		returnObj.add(co);
		
			List <String> bitterTongue = new ArrayList<String>();
			bitterTongue.add("Bitter Tongue?");
			bitterTongue.add(yes);
			bitterTongue.add("No");
			bitterTongue.add("Not Sure");	
		Map<String, Object> bt = new HashMap<>();
		bt.put("fieldType", "select");
		bt.put("name", "bitterTongue");
		bt.put("option", bitterTongue);
		returnObj.add(bt);
		
			List <String> vomiting = new ArrayList<String>();
			vomiting.add("Vomiting?");
			vomiting.add(yes);
			vomiting.add("No");
			vomiting.add("Not Sure");	
		Map<String, Object> vo = new HashMap<>();
		vo.put("fieldType", "select");
		vo.put("name", "vomitting");
		vo.put("option", vomiting);
		returnObj.add(vo);
		
			List <String> redEye = new ArrayList<String>();
			redEye.add("Red Eye?");
			redEye.add(yes);
			redEye.add("No");
			redEye.add("Not Sure");	
		Map<String, Object> re = new HashMap<>();
		re.put("fieldType", "select");
		re.put("name", "redEye");
		re.put("option", redEye);
		returnObj.add(re);

			List <String> appetiteLoss = new ArrayList<String>();
			appetiteLoss.add("Loss of Appetite?");
			appetiteLoss.add(yes);
			appetiteLoss.add("No");
			appetiteLoss.add("Not Sure");	
		Map<String, Object> al = new HashMap<>();
		al.put("fieldType", "select");
		al.put("name", "appetiteLoss");
		al.put("option", appetiteLoss);
		returnObj.add(al);
	
			List <String> wieghtLoss = new ArrayList<String>();
			wieghtLoss.add("Weight Loss?");
			wieghtLoss.add(yes);
			wieghtLoss.add("No");
			wieghtLoss.add("Not Sure");	
		Map<String, Object> wl = new HashMap<>();
		wl.put("fieldType", "select");
		wl.put("name", "wieghtLoss");
		wl.put("option", wieghtLoss);
		returnObj.add(wl);
		
			List <String> dehydration = new ArrayList<String>();
			dehydration.add("Dehydraion?");
			dehydration.add(yes);
			dehydration.add("No");
			dehydration.add("Not Sure");	
		Map<String, Object> dh = new HashMap<>();
		dh.put("fieldType", "select");
		dh.put("name", "dehydration");
		dh.put("option", dehydration);
		returnObj.add(dh);
		
			List <String> stress = new ArrayList<String>();
			stress.add("Stress?");
			stress.add(yes);
			stress.add("No");
			stress.add("Not Sure");	
		Map<String, Object> st = new HashMap<>();
		st.put("fieldType", "select");
		st.put("name", "stress");
		st.put("option", stress);
		returnObj.add(st);
		
			List <String> ulcerPat = new ArrayList<String>();
			ulcerPat.add("Ulcer Patient?");
			ulcerPat.add(yes);
			ulcerPat.add("No");
			ulcerPat.add("Not Sure");	
		Map<String, Object> str = new HashMap<>();
		str.put("fieldType", "select");
		str.put("name", "ulcerPat");
		str.put("option", ulcerPat);
		returnObj.add(str);
		
			List <String> stooling = new ArrayList<String>();
			stooling.add("Stooling?");
			stooling.add(yes);
			stooling.add("No");
			stooling.add("Not Sure");	
		Map<String, Object> sto = new HashMap<>();
		sto.put("fieldType", "select");
		sto.put("name", "stooling");
		sto.put("option", stooling);
		returnObj.add(sto);
		
			List <String> rash = new ArrayList<String>();
			rash.add("Rashes?");
			rash.add(yes);
			rash.add("No");
			rash.add("Not Sure");	
		Map<String, Object> rs = new HashMap<>();
		rs.put("fieldType", "select");
		rs.put("name", "rash");
		rs.put("option", rash);
		returnObj.add(rs);
			
			List <String> cough = new ArrayList<String>();
			cough.add("Coughing?");
			cough.add(yes);
			cough.add("No");
			cough.add("Not Sure");	
		Map<String, Object> cou = new HashMap<>();
		cou.put("fieldType", "select");
		cou.put("name", "cough");
		cou.put("option", cough);
		returnObj.add(cou);
		
			List <String> sweating = new ArrayList<String>();
			sweating.add("Sweating?");
			sweating.add(yes);
			sweating.add("No");
			sweating.add("Not Sure");	
		Map<String, Object> sw = new HashMap<>();
		sw.put("fieldType", "select");
		sw.put("name", "sweating");
		sw.put("option", sweating);
		returnObj.add(sw);
			
			List <String> musclePain = new ArrayList<String>();
			musclePain.add("Muscle Pain?");
			musclePain.add(yes);
			musclePain.add("No");
			musclePain.add("Not Sure");	
		Map<String, Object> mp = new HashMap<>();
		mp.put("fieldType", "select");
		mp.put("name", "musclePain");
		mp.put("option", musclePain);
		returnObj.add(mp);
		
			List <String> chestPain = new ArrayList<String>();
			chestPain.add("Chest Pain?");
			chestPain.add(yes);
			chestPain.add("No");
			chestPain.add("Not Sure");	
		Map<String, Object> cp = new HashMap<>();
		cp.put("fieldType", "select");
		cp.put("name", "chestPain");
		cp.put("option", chestPain);
		returnObj.add(cp);
		
			List <String> tiredness = new ArrayList<String>();
			tiredness.add("Tiredness?");
			tiredness.add(yes);
			tiredness.add("No");
			tiredness.add("Not Sure");	
		Map<String, Object> tr = new HashMap<>();
		tr.put("fieldType", "select");
		tr.put("name", "tiredness");
		tr.put("option", tiredness);
		returnObj.add(tr);
			
			List <String> nausea = new ArrayList<String>();
			nausea.add("Nausea?");
			nausea.add(yes);
			nausea.add("No");
			nausea.add("Not Sure");	
		Map<String, Object> na = new HashMap<>();
		na.put("fieldType", "select");
		na.put("name", "nausea");
		na.put("option", nausea);
		returnObj.add(na);

		Map<String, Object> ot = new HashMap<>();
		ot.put("fieldType", "text");
		ot.put("name", "others");
		ot.put("placeholder", "Other");
		returnObj.add(ot);
		
			List <String> weakness = new ArrayList<String>();
			weakness.add("Weakness?");
			weakness.add(yes);
			weakness.add("No");
			weakness.add("Not Sure");	
		Map<String, Object> wk = new HashMap<>();
		wk.put("fieldType", "select");
		wk.put("name", "Weakness");
		wk.put("option", weakness);
		returnObj.add(wk);
			
			List <String> fatigue = new ArrayList<String>();
			fatigue.add("Are you Fatigued?");
			fatigue.add(yes);
			fatigue.add("No");
			fatigue.add("Not Sure");	
		Map<String, Object> ft = new HashMap<>();
		ft.put("fieldType", "select");
		ft.put("name", "fatigue");
		ft.put("option", fatigue);
		returnObj.add(ft);
		
		
			List <String> abdominalPain = new ArrayList<String>();
			abdominalPain.add("Do you have Abdominal Pain?");
			abdominalPain.add(yes);
			abdominalPain.add("No");
			abdominalPain.add("Not Sure");	
		Map<String, Object> ap = new HashMap<>();
		ap.put("fieldType", "select");
		ap.put("name", "abdominalPain");
		ap.put("option", abdominalPain);
		returnObj.add(ap);
			
			List <String> diarrhea = new ArrayList<String>();
			diarrhea.add("Do you have Diarrhea?");
			diarrhea.add(yes);
			diarrhea.add("No");
			diarrhea.add("Not Sure");	
		Map<String, Object> diar = new HashMap<>();
		diar.put("fieldType", "select");
		diar.put("name", "diarrhea");
		diar.put("option", diarrhea);
		returnObj.add(diar);
		
			List <String> extremelySwollenAbdomen = new ArrayList<String>();
			extremelySwollenAbdomen.add("Do you have Extremely Swollen Abdomen?");
			extremelySwollenAbdomen.add(yes);
			extremelySwollenAbdomen.add("No");
			extremelySwollenAbdomen.add("Not Sure");	
		Map<String, Object> esa = new HashMap<>();
		esa.put("fieldType", "select");
		esa.put("name", "extremelySwollenAbdomen");
		esa.put("option", extremelySwollenAbdomen);
		returnObj.add(esa);
			
			List <String> dryCough = new ArrayList<String>();
			dryCough.add("Do you have Dry Cough?");
			dryCough.add(yes);
			dryCough.add("No");
			dryCough.add("Not Sure");	
		Map<String, Object> dc = new HashMap<>();
		dc.put("fieldType", "select");
		dc.put("name", "dryCough");
		dc.put("option", dryCough);
		returnObj.add(dc);
		return returnObj;

	}

//	Diagonize patient and save to db
	@Override
	public String diagonisePatient(Diagnosis diagnosis) {
		 
		 String fileNo = diagnosis.getFileNo();
		 String headAche = diagnosis.getHeadAche();
		 String acheDuration = diagnosis.getAcheDuration();
		 String stomachPain = diagnosis.getStomachPain();
		 String fever = diagnosis.getFever();
		 String cold = diagnosis.getCold();
		 String bitterTongue = diagnosis.getBitterTongue();
		 String vomitting = diagnosis.getVomitting();
		 String redEye = diagnosis.getRedEye();
		 String appetiteLoss = diagnosis.getAppetiteLoss();
		 String wieghtLoss = diagnosis.getWieghtLoss();
		 String dehydration = diagnosis.getDehydration();
		 String stress = diagnosis.getStress();
		 String ulcerPat = diagnosis.getUlcerPat();
		 String stooling = diagnosis.getStooling();
		 String rash = diagnosis.getRash();
		 String cough = diagnosis.getCough();
		 String sweating = diagnosis.getSweating();
		 String musclePain = diagnosis.getMusclePain();
		 String chestPain = diagnosis.getChestPain();
		 String tiredness = diagnosis.getTiredness();
		 String nausea = diagnosis.getNausea();
		 String others = diagnosis.getOthers();
		 String diagnosisRslt = diagnosis.getDiagnosisRslt();
		 String weakness = diagnosis.getWeakness();
		 String fatigue = diagnosis.getFatigue();
		 String dryCough = diagnosis.getDryCough();
		 String diarrhea= diagnosis.getDiarrhea();
		 String extremelySwollenAbdomen = diagnosis.getExtremelySwollenAbdomen();
		 String abdominalPain = diagnosis.getAbdominalPain();
		 int age;
		 
		 
//		 System.out.println("The AGe is "+age);
		 if(fever.equalsIgnoreCase(yes)) {
			 System.out.println("Got Here ! ");

		 }
		 
		 if(fever.equalsIgnoreCase(yes) && sweating.equalsIgnoreCase(yes) && abdominalPain.equalsIgnoreCase(yes) && sweating.equals(yes) && dryCough.equalsIgnoreCase(yes) && wieghtLoss.equalsIgnoreCase(yes) && appetiteLoss.equalsIgnoreCase(yes) && diarrhea.equalsIgnoreCase(yes) && rash.equalsIgnoreCase(yes) && extremelySwollenAbdomen.equalsIgnoreCase(yes) && cough.equalsIgnoreCase(yes) && headAche.equalsIgnoreCase(yes) && bitterTongue.equalsIgnoreCase(yes) && redEye.equalsIgnoreCase(yes) &&  weakness.equalsIgnoreCase(yes) && fatigue.equalsIgnoreCase(yes)  && dehydration.equalsIgnoreCase(yes) && musclePain.equals(yes)) {
			  logger.info("Typhoid and Malaria! ");
			 diagnosisRslt = "Treat for TYPHOID & MALARIA, If there is a danger sign, Hospitalize Patient.. Also consider Confirmatoory Test.";
			 diagnosis.setDiagnosisRslt(diagnosisRslt);
		 }
		 else if(fever.equalsIgnoreCase(yes) && sweating.equalsIgnoreCase(yes) && wieghtLoss.equalsIgnoreCase(yes) && appetiteLoss.equalsIgnoreCase(yes) && cough.equalsIgnoreCase(yes) && headAche.equalsIgnoreCase(yes) && bitterTongue.equalsIgnoreCase(yes) && redEye.equalsIgnoreCase(yes) &&  weakness.equalsIgnoreCase(yes) && fatigue.equalsIgnoreCase(yes)  && dehydration.equalsIgnoreCase(yes)) {
			 logger.info("Severe Malaria! ");
			 diagnosisRslt = "Treat for SEVERE MALARIA, Also consider Confirmatoory Test";
			 diagnosis.setDiagnosisRslt(diagnosisRslt);
		 }
		 else if(fever.equalsIgnoreCase(yes) && sweating.equalsIgnoreCase(yes) && wieghtLoss.equalsIgnoreCase(yes) && appetiteLoss.equalsIgnoreCase(yes) && cough.equalsIgnoreCase(yes) && nausea.equalsIgnoreCase(yes)) {
			 logger.info("Normal Malaria!");
			 diagnosisRslt = "Treat for NORMAL MALARIA, If there is a danger sign, Hospitalize Patient.. Also consider Confirmatoory Test";
			 diagnosis.setDiagnosisRslt(diagnosisRslt);
		 }
				 
		 else {
			 logger.info("Niether Malaria nor Typhoid detected!");
			 diagnosisRslt = "Niether Malaria nor Typhoid has been detected";
			 diagnosis.setDiagnosisRslt(diagnosisRslt);
		 }
		 List<Patient> patient = patientRepository.findByFileNo(fileNo);
		 
//		 age = Integer.parseInt(patient.get(0).getAge());
		 System.out.println("+++======================================"+patient);
		 if(patient.isEmpty()) {
			 return "Failed";
		 }
		 Long userId = patient.get(0).getId();

//		 List<Diagnosis> updateDiagnosis = diagnosisRepository.findByFileNo(fileNo);
		
//		 if(updateDiagnosis.isEmpty() ) {
			System.out.println("============ NEW DIAGNOSIS ==============");
			diagnosisRepository.save(diagnosis);
//		 }
//		 else {
//			System.out.println("============ INSIDE ELSE ==============");
//		
//		//	updateDiagnosis.get(0).setFileNo(fileNo);
//			updateDiagnosis.get(0).setHeadAche(headAche);
//			updateDiagnosis.get(0).setAcheDuration(acheDuration);
//			updateDiagnosis.get(0).setStomachPain(stomachPain);
//			updateDiagnosis.get(0).setFever(fever);
//			updateDiagnosis.get(0).setCold(cold);
//			updateDiagnosis.get(0).setBitterTongue(bitterTongue);
//			updateDiagnosis.get(0).setVomitting(vomitting);
//			updateDiagnosis.get(0).setRedEye(redEye);
//			updateDiagnosis.get(0).setAppetiteLoss(appetiteLoss);
//			updateDiagnosis.get(0).setWieghtLoss(wieghtLoss);
//			updateDiagnosis.get(0).setDehydration(dehydration);
//			updateDiagnosis.get(0).setStress(stress);
//			updateDiagnosis.get(0).setUlcerPat(ulcerPat);
//			updateDiagnosis.get(0).setStooling(stooling);
//			updateDiagnosis.get(0).setRash(rash);
//			updateDiagnosis.get(0).setCough(cough);
//			updateDiagnosis.get(0).setSweating(sweating);
//			updateDiagnosis.get(0).setMusclePain(musclePain);
//			updateDiagnosis.get(0).setChestPain(chestPain);
//			updateDiagnosis.get(0).setTiredness(tiredness);
//			updateDiagnosis.get(0).setNausea(nausea);
//			updateDiagnosis.get(0).setOthers(others);
//			updateDiagnosis.get(0).setDiagnosisRslt(diagnosisRslt);
//			updateDiagnosis.get(0).setWeakness(weakness);
//			updateDiagnosis.get(0).setFatigue(fatigue);
//			updateDiagnosis.get(0).setDryCough(dryCough);
//			updateDiagnosis.get(0).setDiarrhea(diarrhea);
//			updateDiagnosis.get(0).setExtremelySwollenAbdomen(extremelySwollenAbdomen);
//			updateDiagnosis.get(0).setAbdominalPain(abdominalPain);
//		 
//			diagnosisRepository.saveAll(updateDiagnosis);
//		 }
//		Log The event
		ActivityLog activityLog = new ActivityLog("New Patient Diagonized", LocalDateTime.now());
		activityLogRepository.save(activityLog);
		return "Successful";
	}
	
//	Give a particular diagnosis based on the id passed
	@Override
	public Diagnosis getPatDiagForReport(Long id) {
		Diagnosis diagnosis = null;
		if(id == null) {
			diagnosis = new Diagnosis();
		}else {
			try {
				diagnosis = getDiagnosisFromId(id);
			}catch(Exception e) {
				//
				System.out.println(e);
			}
		}
		System.out.println("DIAGNOSIS"+ diagnosis);
		return diagnosis;
	}

//	Text field for doctor's report
	@Override
	public List<Map<String, Object>> getDocReportForm(Diagnosis diagnosis) {
		
		List<Map<String, Object>> returnObj = new ArrayList<>();
		
		Map<String, Object> ot = new HashMap<>();
		ot.put("fieldType", "text");
		ot.put("name", "others");
		ot.put("value", diagnosis.id);
		ot.put("placeholder", "Other");
		ot.put("readonly", "readonly");
		returnObj.add(ot);
		
		Map<String, Object> dp = new HashMap<>();
		dp.put("fieldType", "textarea");
		dp.put("name", "docPrescription");
		dp.put("placeholder", "Doctor's Prescription and Recomendation");
		returnObj.add(dp);
		return returnObj;
	}

//	Gets a particular diagnosis based on the id passed
	private Diagnosis getDiagnosisFromId(Long id) {
		System.out.println("I reach here oooo");
		return diagnosisRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
	}

//	private Diagnosis getDiagnosisUsingFileNo(String fileNo) {
//		System.out.println("I reach here oooo");
//		return diagnosisRepository.findByFileNo(fileNo).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + fileNo));
//	}
	
//	Save doctor's report to db
	@Override
	public Diagnosis docReport(String fileNo, String id, String diagnosisRslt) {
		
		Diagnosis diagRslt = diagnosisRepository.getOne(Long.parseLong(id));
		diagRslt.setDiagnosisRslt(diagnosisRslt);
		return diagnosisRepository.save(diagRslt);
	}

	@Override
	public Diagnosis getOnePatDiagnosis(String fileNo) {
		Diagnosis diagnosis = null;
//		if(fileNo == null) {
//
//			diagnosis = new Diagnosis();
//		}else {
//			System.out.println("EXCEPtion NOT NULL PRECIOUS "+ fileNo);
//
//			try {
//				diagnosis = getDiagnosisUsingFileNo(fileNo);
//				System.out.println("NOT NULL PRECIOUS");
//
//			}catch(Exception e) {
//
//				//
//				System.out.println(e);
//			}
//		}
//		System.out.println("DIAGNOSIS"+ diagnosis);
		return diagnosis;
	}

	@Override
	public Diagnosis postRslt(String rsltOrDocRep, Long id, String tranType) {
		Diagnosis pstRslt = diagnosisRepository.getOne(id);
		if(tranType =="result") {
		pstRslt.setTestReslt(rsltOrDocRep);
		}
		if(tranType =="docPres") {
			pstRslt.setDocPrescription(rsltOrDocRep);
		}
		return diagnosisRepository.save(pstRslt);
	}

}
