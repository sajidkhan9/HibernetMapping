package com.sajid;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Technology {
	@Id
   private int tid;
   private String name;

public Technology(int tid, String name) {
	super();
	this.tid = tid;
	this.name = name;
}

public int getTid() {
	return tid;
}

public void setTid(int tid) {
	this.tid = tid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Technology() {
	super();
	// TODO Auto-generated constructor stub
}
}
