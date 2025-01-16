package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class DeleteDataDynamically {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","N#@98wrft45");
		PreparedStatement ps = con.prepareStatement("delete from user where id=?");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter id ");
		int id = sc.nextInt();
		ps.setInt(1, id);
		ps.execute();
		System.out.println("Value Deleted");
		}

}
