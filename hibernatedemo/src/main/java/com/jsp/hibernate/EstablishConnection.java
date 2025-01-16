package com.jsp.hibernate;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EstablishConnection {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	System.out.println("Connection established");
}
}
