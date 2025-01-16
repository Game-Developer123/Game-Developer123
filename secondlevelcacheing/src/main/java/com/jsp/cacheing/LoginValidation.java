package com.jsp.cacheing;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class LoginValidation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Email: ");
		String Email=sc.next();
		
		System.out.println("Enter Password: ");
		String password = sc.next();
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Query query =  em.createQuery("select u from User u where u.Email=?1 and u.password=?2");
		query.setParameter(1, Email);
		query.setParameter(2, password);
		
		List<User> user = query.getResultList();
		
		if(user.size()>0)
		{
			System.out.println("Welcome");
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
		
		
	}
}
