package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","N#@98wrft45");
	Statement st = con.createStatement();
	st.execute("update student set name='Lokesh' where id=1");
	st.execute("update student set age=25 where name='Lokesh'");
	System.out.println("Data Updated Successfully");
}
}