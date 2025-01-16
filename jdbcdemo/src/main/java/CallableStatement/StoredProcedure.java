package CallableStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StoredProcedure {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","N#@98wrft45");
		Statement st = con.createStatement();
		st.execute("create procedure fetch_ALL()"
				 + "begin "
				 + "select * from student;"
				 + "end");
		System.out.println("procedure created");
	}

}
