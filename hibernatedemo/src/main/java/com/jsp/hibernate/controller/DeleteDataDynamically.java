package com.jsp.hibernate.controller;

import java.util.Scanner;

import com.jsp.hibernate.dao.Studentdao;

public class DeleteDataDynamically {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id = sc.nextInt();
		
		Studentdao dao = new Studentdao();
		dao.deleteStudentById(id);
		

	}

}
