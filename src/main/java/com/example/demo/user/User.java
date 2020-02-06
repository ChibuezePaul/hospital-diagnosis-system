package com.example.demo.user;

import java.time.LocalDateTime;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity(name = "user")
public class User {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;
	
	protected LocalDateTime dateCreated = LocalDateTime.now();
	
	protected LocalDateTime dateModified = LocalDateTime.now();

	@Column(unique = true)
	private String phoneNumber;
	
	private String password;
	
	private String firstName;
	
	private String lastName;

	public User() {
	}

	

	public User(Long id, LocalDateTime dateCreated, LocalDateTime dateModified, String phoneNumber, String password,
			String firstName, String lastName) {
		super();
		this.id = id;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}

    public User(String phoneNumber, String encodedPassword) {
    }


    public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
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



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
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



	@Override
	public String toString() {
		return "User [id=" + id + ", dateCreated=" + dateCreated + ", dateModified=" + dateModified + ", phoneNumber="
				+ phoneNumber + ", password=" + password + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
