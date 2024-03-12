package com.myhiber;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity
@Table(name="Student_Address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="address_id")
	private int addressid;
	
	
	@Column(name="STREET", length=100)
	private String street;
	
	@Column(name="add_CITY")
	private String city;
	
	@Column(name="is_open")
	private boolean isopen;
	
	
	// This is not added in Database  Using  of  @Transient
	@Transient
	private double x;
	
//	@Temporal(TemporalType.DATE)       //for Date 
//	private Date addeddate;
	
	@Lob                     //For Large Objects 
	private byte[] image;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addressid, String street, String city, boolean isopen, double x, Date addeddate, byte[] image) {
		super();
		this.addressid = addressid;
		this.street = street;
		this.city = city;
		this.isopen = isopen;
		this.x = x;
	//	this.addeddate = addeddate;
		this.image = image;
	}

	public int getAddressid() {
		return addressid;
	}

	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isIsopen() {
		return isopen;
	}

	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}


	

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	

}
