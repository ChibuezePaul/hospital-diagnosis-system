package com.example.demo.user;

import java.time.LocalDateTime;
import javax.persistence.*;


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
	
	@Enumerated(EnumType.STRING)
	private Roles role;
	
	public User() {
	}

	

	public User( String phoneNumber, String password, String firstName, String lastName, Roles role) {
		this.dateCreated = LocalDateTime.now ();
		this.dateModified = LocalDateTime.now ();
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
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
	
	
	
	public Roles getRole () {
		return role;
	}
	
	
	
	public void setRole(Roles role) {
		this.role = role;
	}
	
	
	@Override
	public String toString () {
		return "User{" +
			  "id=" + id +
			  ", dateCreated=" + dateCreated +
			  ", dateModified=" + dateModified +
			  ", phoneNumber='" + phoneNumber + '\'' +
			  ", password='" + password + '\'' +
			  ", firstName='" + firstName + '\'' +
			  ", lastName='" + lastName + '\'' +
			  ", role=" + role +
			  '}';
	}
	
}
