package com.jsp.hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchAllData {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		System.out.println("Enter the Id: ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		Student s = em.find(Student.class, id);
		if(s!=null)
		{
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getYop());
		}
		else
			System.out.println("Invalid Id.....!!!");

	}

}
