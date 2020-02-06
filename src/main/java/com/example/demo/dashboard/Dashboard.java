package com.example.demo.dashboard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dashboard {
	@Id
	@GeneratedValue
	private long id;
	
	private String Name;
	
	private String link;
	
	public Dashboard() {
		
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "icon [id=" + id + ", Name=" + Name + ", link=" + link + "]";
	}
	
}
