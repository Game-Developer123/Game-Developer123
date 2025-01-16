package com.jsp.cascade;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity(name="person_table")
public class Person {
	@Id
	private int id;
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

	public Pan getPan() {
		return pan;
	}

	public void setPan(Pan pan) {
		this.pan = pan;
	}

	private String name;
	
	@OneToOne
	@Cascade(CascadeType.ALL)
	private Pan pan;
	
}  
