package com.jsp.cascade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Persondriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person person = new Person();
		person.setId(1);
		person.setName("A");
		
		Pan pan = new Pan();
		pan.setId(1);
		pan.setPanNumber("ABC123");
		pan.setAddress("Bangalore");
		
		person.setPan(pan);
		
		et.begin();
		em.persist(person);
		et.commit();
	}
}
