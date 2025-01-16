package com.jsp.hibernate.controller;

import java.util.Scanner;
import com.jsp.hibernate.Student;
import com.jsp.hibernate.dao.Studentdao;

public class StudentController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		
		System.out.println("Enter Name: ");
		String name = sc.next();
		
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		

		System.out.println("Enter yop: ");
		int yop = sc.nextInt();
		
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setYop(yop);
		
		
		Studentdao dao = new Studentdao();
		dao.saveStudent(s);
	}
}
