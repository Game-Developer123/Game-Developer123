package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LoadAndRegisterDriver {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver registered successfully");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306","root","N#@98wrft45");
		System.out.println("Connection established");
		Statement st = con.createStatement();
		System.out.println("Statement is created successfully");
	}

}
