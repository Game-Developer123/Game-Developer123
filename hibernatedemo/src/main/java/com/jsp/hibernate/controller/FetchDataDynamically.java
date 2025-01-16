package com.jsp.hibernate.controller;

import java.util.Scanner;

import com.jsp.hibernate.Student;
import com.jsp.hibernate.dao.Studentdao;

public class FetchDataDynamically {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id = sc.nextInt();
		
		Studentdao dao = new Studentdao();
		Student s = dao.fetchStudentById(id);
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getYop());
		
	}
}
