package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","N#@98wrft45");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from student where id=2");
		rs.next();
		
//		System.out.println(rs.getInt("id"));
//		System.out.println(rs.getString("name"));
//		System.out.println(rs.getInt("age"));
		
		System.out.println(rs.getInt(1));//1-->id
		System.out.println(rs.getString(2)); //2-->name
		System.out.println(rs.getInt(3)); //3-->age
		
	}
}
