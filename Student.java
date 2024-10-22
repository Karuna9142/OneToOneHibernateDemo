package com.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private int studid;
	private String studname;
	private int stuage;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	private Subject sub;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studid, String studname, int stuage, Subject sub) {
		super();
		this.studid = studid;
		this.studname = studname;
		this.stuage = stuage;
		this.sub = sub;
	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}

	public int getStuage() {
		return stuage;
	}

	public void setStuage(int stuage) {
		this.stuage = stuage;
	}

	public Subject getSub() {
		return sub;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}
	
}
