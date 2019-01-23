package com.sajid;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;

@Entity
public class TechName {
	@Id
    private int id;
    private String name;
    private String email;
    
    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="tid")
    private Technology technology;
    
	public Technology getTechnology() {
		return technology;
	}
	public void setTechnology(Technology technology) {
		this.technology = technology;
	}
	public TechName() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TechName(int id, String name, String email, Technology technology) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.technology = technology;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
