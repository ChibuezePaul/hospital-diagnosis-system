package com.example.demo.patient;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "patient")
public class Patient{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;
	
	 private String firstName;

	 private String lastName;
	 
	 private String address;

	 private String dob;

	 private String stateOfOrigin;

	 private String nationality;
	 
	 private String phoneNo;
	 
	 private String gender;
	 
	 private String age;
	 
	 private String weight;
	 
	 private String guardianName;
	 
	 private String guardianAddress;
	 
	 private String guardianPhNo;
	 
	 private String fileNo;
	 
	 private String complexion;
	 
	 private String bodyShape;
	 
	 private String height;
	 
	 private String dateAdmitted;
	 
	 public Patient() {
			
	 }
	 
	 public Patient(String firstName, String lastName, String gender, String age, String fileNo,
			String complexion, String bodyShape, String height, String dateAdmitted) {
		
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			this.age = age;
			this.fileNo = fileNo;
			this.complexion = complexion;
			this.bodyShape = bodyShape;
			this.height = height;
			this.dateAdmitted = dateAdmitted;
		}
	
	public Patient(String firstName, String lastName, String address, String dob, String stateOfOrigin,
			String nationality, String phoneNo, String gender, String age, String weight, String guardianName,
			String guardianAddress, String guardianPhNo, String fileNo, String complexion, String bodyShape,
			String height, String dateAdmitted) {
		
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.dob = dob;
			this.stateOfOrigin = stateOfOrigin;
			this.nationality = nationality;
			this.phoneNo = phoneNo;
			this.gender = gender;
			this.age = age;
			this.weight = weight;
			this.guardianName = guardianName;
			this.guardianAddress = guardianAddress;
			this.guardianPhNo = guardianPhNo;
			this.fileNo = fileNo;
			this.complexion = complexion;
			this.bodyShape = bodyShape;
			this.height = height;
			this.dateAdmitted = dateAdmitted;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getStateOfOrigin() {
		return stateOfOrigin;
	}

	public void setStateOfOrigin(String stateOfOrigin) {
		this.stateOfOrigin = stateOfOrigin;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public String getGuardianAddress() {
		return guardianAddress;
	}

	public void setGuardianAddress(String guardianAddress) {
		this.guardianAddress = guardianAddress;
	}

	public String getGuardianPhNo() {
		return guardianPhNo;
	}

	public void setGuardianPhNo(String guardianPhNo) {
		this.guardianPhNo = guardianPhNo;
	}

	public String getFileNo() {
		return fileNo;
	}

	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
	}

	public String getComplexion() {
		return complexion;
	}

	public void setComplexion(String complexion) {
		this.complexion = complexion;
	}

	public String getBodyShape() {
		return bodyShape;
	}

	public void setBodyShape(String bodyShape) {
		this.bodyShape = bodyShape;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getDateAdmitted() {
		return dateAdmitted;
	}

	public void setDateAdmitted(String dateAdmitted) {
		this.dateAdmitted = dateAdmitted;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", dob=" + dob + ", stateOfOrigin=" + stateOfOrigin + ", nationality=" + nationality + ", phoneNo="
				+ phoneNo + ", gender=" + gender + ", age=" + age + ", weight=" + weight + ", guardianName="
				+ guardianName + ", guardianAddress=" + guardianAddress + ", guardianPhNo=" + guardianPhNo + ", fileNo="
				+ fileNo + ", complexion=" + complexion + ", bodyShape=" + bodyShape + ", height=" + height
				+ ", dateAdmitted=" + dateAdmitted + "]";
	}
	 	
}
