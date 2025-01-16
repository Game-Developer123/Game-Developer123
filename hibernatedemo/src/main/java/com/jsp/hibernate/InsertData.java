package com.jsp.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertData {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Student st = new Student();
	st.setId(1);
	st.setName("A");
	st.setAge(20);
	st.setYop(2024);
	
	et.begin();
	em.persist(st);
	et.commit();
	
}
}
