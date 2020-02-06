package com.example.demo.person;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.example.demo.user.User;

@Entity(name = "person")
public class Person{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;
	
	 private String firstName;

	 private String lastName;
	 
	 private String address;

	 private String email;

	 private String phoneNumber;

	 private String age;
	 
	 private String sex;
	 
	 private String resAddress;
	 
	 private String stateOfResidence;
	 
	 private String landMark;
	 
	 private String bloodGrp;
	 
	 private String genotype;
	 
	 private String allegies;
	 
	 private String guardian;
	 
	 private String guardianAddress;
	 
	 private String guardianPhNo;
	 
	 protected LocalDateTime dateCreated = LocalDateTime.now();
	 
	 protected LocalDateTime dateModified = LocalDateTime.now();
	 
    @JoinColumn(name = "user_id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
	private User user;
    
    public Person() {
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getResAddress() {
		return resAddress;
	}

	public void setResAddress(String resAddress) {
		this.resAddress = resAddress;
	}

	public String getStateOfResidence() {
		return stateOfResidence;
	}

	public void setStateOfResidence(String stateOfResidence) {
		this.stateOfResidence = stateOfResidence;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getBloodGrp() {
		return bloodGrp;
	}

	public void setBloodGrp(String bloodGrp) {
		this.bloodGrp = bloodGrp;
	}

	public String getGenotype() {
		return genotype;
	}

	public void setGenotype(String genotype) {
		this.genotype = genotype;
	}

	public String getAllegies() {
		return allegies;
	}

	public void setAllegies(String allegies) {
		this.allegies = allegies;
	}

	public String getGuardian() {
		return guardian;
	}

	public void setGuardian(String guardian) {
		this.guardian = guardian;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", age=" + age + ", sex=" + sex
				+ ", resAddress=" + resAddress + ", stateOfResidence=" + stateOfResidence + ", landMark=" + landMark
				+ ", bloodGrp=" + bloodGrp + ", genotype=" + genotype + ", allegies=" + allegies + ", guardian="
				+ guardian + ", guardianAddress=" + guardianAddress + ", guardianPhNo=" + guardianPhNo
				+ ", dateCreated=" + dateCreated + ", dateModified=" + dateModified + ", user=" + user + "]";
	}
	
}
