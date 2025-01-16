package com.jsp.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Lokesh");
		s1.setYop(2022);
		
		Student s2 = new Student();
		s2.setId(2);
		s2.setName("Chaitanya");
		s2.setYop(2023);
		
		Course c1 = new Course();
		c1.setId(1);
		c1.setName("Java");
		c1.setDuration("3 Months");
		
		Course c2 = new Course();
		c2.setId(2);
		c2.setName("J2EE");
		c2.setDuration("6 Months");
		
		List<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		
		List<Course> courses = new ArrayList<Course>();
		courses.add(c1);
		courses.add(c2);
		
		s1.setCourses(courses);
		s2.setCourses(courses);
		
		
		c1.setStudents(students);
		c2.setStudents(students);
		
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(c1);
		em.persist(c2);
		et.commit();
		
	}

}
