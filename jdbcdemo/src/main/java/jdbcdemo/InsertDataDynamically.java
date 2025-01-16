package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class InsertDataDynamically {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","N#@98wrft45");
		PreparedStatement ps = con.prepareStatement("insert into user(id,name,mobilenumber,email,password,age) values(?,?,?,?,?,?)");
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			
			System.out.println("Enter Name: ");
			String name = sc.next();
			
			System.out.println("Enter Mobilenumber: ");
			Long mobilenumber = sc.nextLong();
			
			System.out.println("Enter Email: ");
			String email = sc.next();
			
			System.out.println("Enter Password: ");
			String password = sc.next();
			
			System.out.println("Enter Age: ");
			int age = sc.nextInt();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setLong(3, mobilenumber);
			ps.setString(4,email);
			ps.setString(5, password);
			ps.setInt(6, age);
			
			ps.execute();
			
			System.out.println("Data Inserted Successfully");
			
		}
	}

}
