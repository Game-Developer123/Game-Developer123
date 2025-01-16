package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306","root","N#@98wrft45");
		Statement st = con.createStatement();
		st.execute("create database hospital");
		System.out.println("Database created successfully");
		st.execute("create database school");
		System.out.println("Database created successfully");
	}

}
