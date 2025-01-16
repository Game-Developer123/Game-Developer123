package com.jsp.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  //@Entity annotation is used to mark a class as entity class.
public class Student {
	@Id 	//@Id annotation is used to specify primary key.
		private int id;
		private String name;
		private int age;
		private int yop;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getYop() {
			return yop;
		}
		public void setYop(int yop) {
			this.yop = yop;
		}
		
}
