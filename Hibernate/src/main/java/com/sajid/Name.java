package com.sajid;

import javax.persistence.Embeddable;

@Embeddable
public class Name {
   public Name() {
		super();
		// TODO Auto-generated constructor stub
	}
private String fName;
   private String mName;
   private String lName;
   private String wName;
public String getfName() {
	return fName;
}
public Name(String fName, String mName, String lName, String wName) {
	super();
	this.fName = fName;
	this.mName = mName;
	this.lName = lName;
	this.wName = wName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getmName() {
	return mName;
}
public void setmName(String mName) {
	this.mName = mName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public String getwName() {
	return wName;
}
public void setwName(String wName) {
	this.wName = wName;
}
}
