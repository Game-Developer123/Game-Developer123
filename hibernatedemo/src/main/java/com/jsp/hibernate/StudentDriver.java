package com.jsp.hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	System.out.println("1.Add The Student \n 2.View Student By Id \n 3.Update The Data \n 4.Delete the data");
	System.out.println("Enter the Choice");
	Scanner sc = new Scanner(System.in);
	int choice = sc.nextInt();
	switch(choice)
	{
	case 1:
		Student s = new Student();
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
