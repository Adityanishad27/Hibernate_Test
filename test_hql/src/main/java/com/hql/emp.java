package com.hql;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class emp {
	@Id
	private int empid;
	private String empname;
	private String empcity;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpcity() {
		return empcity;
	}
	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}
	
	
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public emp(int empid, String empname, String empcity) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empcity = empcity;
	}
	
	
	
	
	

}
