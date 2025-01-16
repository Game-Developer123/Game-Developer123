package com.jsp.compositeket;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(AccountComposite.class)
public class Account {
private int id;
private String name;
@Id
private long accountnumber;
@Id
private int pincode;


}
