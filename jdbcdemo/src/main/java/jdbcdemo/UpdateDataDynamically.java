package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDataDynamically {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","N#@98wrft45");
		PreparedStatement ps = con.prepareStatement("update user set name=? where id=?");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = sc.next();
		
		System.out.println("Enter id to update");
		int id = sc.nextInt();
		
		ps.setString(1, name);
		ps.setInt(2, id);
		
		ps.execute();
		System.out.println("Values Updated");

	}

}
