package com.jsp.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateData {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s= new Student();
		s.setId(1);
		s.setName("Hello");
		s.setAge(21);
		s.setYop(2023);
		
		et.begin();
		em.merge(s);
		et.commit();

	}

}
