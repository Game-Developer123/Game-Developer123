package com.jsp.cascade;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="pan_table")
public class Pan {

	@Id
	private int id;
	private String panNumber;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
