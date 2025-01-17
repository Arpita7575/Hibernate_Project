package com.oneToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FacultySubject {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int subid;
	String subname;
	
	
	public FacultySubject(String subname) {
		super();
		this.subname = subname;
	}
	
	public FacultySubject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	@Override
	public String toString() {
		return "FacultySubject [subname=" + subname + "]";
	}
	
	

}
