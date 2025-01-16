package com.jsp.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate.Student;


public class Studentdao {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public void saveStudent(Student s)
	{
		et.begin();
		em.persist(s);
		et.commit();
	}
	
	public Student fetchStudentById(int id)
	{
		Student s = em.find(Student.class, id);
		return s;
	}
	
	public Student deleteStudentById(int id)
	{
		Student s = em.find(Student.class, id);
		et.begin();
		em.remove(s);
		et.commit();
		return s;
	}
	
	
}
