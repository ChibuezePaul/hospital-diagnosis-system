package com.example.demo.activityLog;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "activityLog")
public class ActivityLog implements Serializable{
	
	public ActivityLog() {
		
	}
	
	public ActivityLog(String message, LocalDateTime timestamp) {
		this.message = message;
		this.timestamp = timestamp;
	}

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
		
	private String message;
	
	private LocalDateTime timestamp;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ActivityLog [id=" + id + ", timestamp=" + timestamp + ", message=" + message + "]";
	}

}
