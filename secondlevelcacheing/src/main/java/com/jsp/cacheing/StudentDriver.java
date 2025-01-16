package com.jsp.cacheing;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import secondlevelcacheing.Student;

public class StudentDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Query query = em.createQuery("select u from Student u");
		
		List<Student> users = query.getResultList();
		
		for(Student u : users)
		{
			System.out.println(u.getId());
			System.out.println(u.getName());
			System.out.println(u.getAge());
			System.out.println("===============");
		}
		
		
	}
}
