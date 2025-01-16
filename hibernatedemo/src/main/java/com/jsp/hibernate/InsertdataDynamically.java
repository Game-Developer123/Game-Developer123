package com.jsp.hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertdataDynamically {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Scanner sc = new Scanner(System.in);
	Student s = new Student();
	for(int i =0; i<2;i++)
	{
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		
		System.out.println("Enter Name: ");
		String name = sc.next();
		
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter YOP: c");
		int yop = sc.nextInt();
		
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setYop(yop);
		
		et.begin();
		em.persist(s);
		et.commit();
		
	}
}
}
