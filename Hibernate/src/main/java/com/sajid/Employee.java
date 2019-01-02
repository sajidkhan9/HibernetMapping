package com.sajid;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	
	private Name name ;
	@Id
	private int id;
	private String email;
	/*public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}*/
	public Employee(Name name, int id, String email) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
