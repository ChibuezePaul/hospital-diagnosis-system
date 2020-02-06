package com.example.demo.diagnosis;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.example.demo.user.User;

@Entity(name = "diagnosis")
public class Diagnosis{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;
	
	 private String fileNo;
	 
	 private String headAche;
	 
	 private String acheDuration;

	 private String stomachPain;
	 
	 private String fever;

	 private String cold;

	 private String bitterTongue;
	 
	 private String vomitting;
	 
	 private String redEye;
	 
	 private String appetiteLoss;
	 
	 private String wieghtLoss;
	 
	 private String dehydration;
	 
	 private String stress;
	 
	 private String ulcerPat;
	 
	 private String stooling;
	 
	 private String rash;
	 
	 private String cough;
	 
	 private String sweating;
	 
	 private String musclePain;
	 
	 private String chestPain;
	 
	 private String tiredness;
	 
	 private String nausea;
	 
	 private String others;

	 private String docPrescription;
    
	 protected LocalDateTime dateCreated = LocalDateTime.now();
		
	 protected LocalDateTime dateModified = LocalDateTime.now();

	 private String weakness;
	 
	 private String fatigue;

	 private String abdominalPain;

	 private String diarrhea;
	 
	 private String extremelySwollenAbdomen;
	 
	 private String dryCough;
	 
	 private String testReslt;
	 
	 private String diagnosisRslt;

	public Diagnosis() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFileNo() {
		return fileNo;
	}

	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
	}

	public String getHeadAche() {
		return headAche;
	}

	public void setHeadAche(String headAche) {
		this.headAche = headAche;
	}

	public String getAcheDuration() {
		return acheDuration;
	}

	public void setAcheDuration(String acheDuration) {
		this.acheDuration = acheDuration;
	}

	public String getStomachPain() {
		return stomachPain;
	}

	public void setStomachPain(String stomachPain) {
		this.stomachPain = stomachPain;
	}

	public String getFever() {
		return fever;
	}

	public void setFever(String fever) {
		this.fever = fever;
	}

	public String getCold() {
		return cold;
	}

	public void setCold(String cold) {
		this.cold = cold;
	}

	public String getBitterTongue() {
		return bitterTongue;
	}

	public void setBitterTongue(String bitterTongue) {
		this.bitterTongue = bitterTongue;
	}

	public String getVomitting() {
		return vomitting;
	}

	public void setVomitting(String vomitting) {
		this.vomitting = vomitting;
	}

	public String getRedEye() {
		return redEye;
	}

	public void setRedEye(String redEye) {
		this.redEye = redEye;
	}

	public String getAppetiteLoss() {
		return appetiteLoss;
	}

	public void setAppetiteLoss(String appetiteLoss) {
		this.appetiteLoss = appetiteLoss;
	}

	public String getWieghtLoss() {
		return wieghtLoss;
	}

	public void setWieghtLoss(String wieghtLoss) {
		this.wieghtLoss = wieghtLoss;
	}

	public String getDehydration() {
		return dehydration;
	}

	public void setDehydration(String dehydration) {
		this.dehydration = dehydration;
	}

	public String getStress() {
		return stress;
	}

	public void setStress(String stress) {
		this.stress = stress;
	}

	public String getUlcerPat() {
		return ulcerPat;
	}

	public void setUlcerPat(String ulcerPat) {
		this.ulcerPat = ulcerPat;
	}

	public String getStooling() {
		return stooling;
	}

	public void setStooling(String stooling) {
		this.stooling = stooling;
	}

	public String getRash() {
		return rash;
	}

	public void setRash(String rash) {
		this.rash = rash;
	}

	public String getCough() {
		return cough;
	}

	public void setCough(String cough) {
		this.cough = cough;
	}

	public String getSweating() {
		return sweating;
	}

	public void setSweating(String sweating) {
		this.sweating = sweating;
	}

	public String getMusclePain() {
		return musclePain;
	}

	public void setMusclePain(String musclePain) {
		this.musclePain = musclePain;
	}

	public String getChestPain() {
		return chestPain;
	}

	public void setChestPain(String chestPain) {
		this.chestPain = chestPain;
	}

	public String getTiredness() {
		return tiredness;
	}

	public void setTiredness(String tiredness) {
		this.tiredness = tiredness;
	}

	public String getNausea() {
		return nausea;
	}

	public void setNausea(String nausea) {
		this.nausea = nausea;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public String getDocPrescription() {
		return docPrescription;
	}

	public void setDocPrescription(String docPrescription) {
		this.docPrescription = docPrescription;
	}

	public LocalDateTime getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}

	public LocalDateTime getDateModified() {
		return dateModified;
	}

	public void setDateModified(LocalDateTime dateModified) {
		this.dateModified = dateModified;
	}

	public String getWeakness() {
		return weakness;
	}

	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}

	public String getFatigue() {
		return fatigue;
	}

	public void setFatigue(String fatigue) {
		this.fatigue = fatigue;
	}

	public String getAbdominalPain() {
		return abdominalPain;
	}

	public void setAbdominalPain(String abdominalPain) {
		this.abdominalPain = abdominalPain;
	}

	public String getDiarrhea() {
		return diarrhea;
	}

	public void setDiarrhea(String diarrhea) {
		this.diarrhea = diarrhea;
	}

	public String getExtremelySwollenAbdomen() {
		return extremelySwollenAbdomen;
	}

	public void setExtremelySwollenAbdomen(String extremelySwollenAbdomen) {
		this.extremelySwollenAbdomen = extremelySwollenAbdomen;
	}
	
	public String getDryCough() {
		return dryCough;
	}

	public void setDryCough(String dryCough) {
		this.dryCough = dryCough;
	}

	public String getTestReslt() {
		return testReslt;
	}

	public void setTestReslt(String testReslt) {
		this.testReslt = testReslt;
	}

	public String getDiagnosisRslt() {
		return diagnosisRslt;
	}

	public void setDiagnosisRslt(String diagnosisRslt) {
		this.diagnosisRslt = diagnosisRslt;
	}

	@Override
	public String toString() {
		return "Diagnosis [id=" + id + ", fileNo=" + fileNo + ", headAche=" + headAche + ", acheDuration="
				+ acheDuration + ", stomachPain=" + stomachPain + ", fever=" + fever + ", cold=" + cold
				+ ", bitterTongue=" + bitterTongue + ", vomitting=" + vomitting + ", redEye=" + redEye
				+ ", appetiteLoss=" + appetiteLoss + ", wieghtLoss=" + wieghtLoss + ", dehydration=" + dehydration
				+ ", stress=" + stress + ", ulcerPat=" + ulcerPat + ", stooling=" + stooling + ", rash=" + rash
				+ ", cough=" + cough + ", sweating=" + sweating + ", musclePain=" + musclePain + ", chestPain="
				+ chestPain + ", tiredness=" + tiredness + ", nausea=" + nausea + ", others=" + others
				+ ", docPrescription=" + docPrescription + ", dateCreated=" + dateCreated + ", dateModified="
				+ dateModified + ", weakness=" + weakness + ", fatigue=" + fatigue + ", abdominalPain=" + abdominalPain
				+ ", diarrhea=" + diarrhea + ", extremelySwollenAbdomen=" + extremelySwollenAbdomen + ", dryCough="
				+ dryCough + ", testReslt=" + testReslt + ", diagnosisRslt=" + diagnosisRslt + "]";
	}

}
