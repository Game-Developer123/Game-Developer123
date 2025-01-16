package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","N#@98wrft45");
		Statement st = con.createStatement();
		st.execute("insert into student(id,name,age) values(1,'A',10)");
		st.execute("insert into student(id,name,age) values(2,'B',20)");
		System.out.println("Data inserted successfully");

	}

}
