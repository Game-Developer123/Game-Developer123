package com.jsp.compositeket;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;


public class AccountComposite implements Serializable{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (accountnumber ^ (accountnumber >>> 32));
		result = prime * result + pincode;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountComposite other = (AccountComposite) obj;
		if (accountnumber != other.accountnumber)
			return false;
		if (pincode != other.pincode)
			return false;
		return true;
	}
	private long accountnumber;
	private int pincode;

	public AccountComposite()
	{
		
	}
	public AccountComposite(long accountnumber, int pincode) {
		super();
		this.accountnumber = accountnumber;
		this.pincode = pincode;
	}
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	}
