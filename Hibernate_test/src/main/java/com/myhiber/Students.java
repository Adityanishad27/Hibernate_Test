package com.myhiber;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {
	
	@Id
	 private int id;
	 private String name;
	 private String city;
	 
	 
	 private Certificate certi;
	 
	 
	 
	
	
	public Students(int id, String name, String city, Certificate certi) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.certi = certi;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	
	
	 

}
