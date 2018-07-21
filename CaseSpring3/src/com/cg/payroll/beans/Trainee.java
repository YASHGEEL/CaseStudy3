package com.cg.payroll.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	String domain;
	String location;
	
	
	
	
	public Trainee(int id, String name, String domain, String location) {
		super();
		this.id = id;
		this.name = name;
		this.domain = domain;
		this.location = location;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", domain=" + domain + ", location=" + location + "]";
	}




	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Trainee(String name, String domain, String location) {
		super();
		this.name = name;
		this.domain = domain;
		this.location = location;
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
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
