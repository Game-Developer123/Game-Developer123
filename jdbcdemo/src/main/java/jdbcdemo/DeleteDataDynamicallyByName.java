package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDataDynamicallyByName {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","N#@98wrft45");
		PreparedStatement ps = con.prepareStatement("delete from user where name=?");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Name ");
		String name = sc.next();
		ps.setString(1, name);
		ps.execute();
		System.out.println("Value Deleted");
		}
	}
