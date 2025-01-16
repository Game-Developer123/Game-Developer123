package com.jsp.hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateDataDynamically {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	System.out.println("Enter id to update ");
	Scanner sc = new Scanner(System.in);
	int id = sc.nextInt();
	
	System.out.println("Enter id to update ");
	String name = sc.next();
	
	Student s = em.find(Student.class, id);
	s.setName(name);
	
	et.begin();
	em.merge(s);
	et.commit();
}
}
