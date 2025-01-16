package com.jsp.cacheing;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class UserDriver {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	User u = new User();
	
	u.setId(2);
	u.setName("B");
	u.setEmail("B123@gmail.com");
	u.setPassword("1234");
	
	et.begin();
	em.persist(u);
	et.commit();
	
}
}
