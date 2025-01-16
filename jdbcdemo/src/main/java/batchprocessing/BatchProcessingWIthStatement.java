package batchprocessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessingWIthStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","N#@98wrft45");
		Statement st = con.createStatement();
		
		st.addBatch("insert into user(id,name,mobilenumber,email,password,age) values(1,'A',123,'A@gmail.com','Hello',12)");
		
		st.addBatch("insert into user(id,name,mobilenumber,email,password,age) values(3,'B',124,'B@gmail.com','Hii',20)");
		
		st.addBatch("update user set name='Lokesh',age=30 where id =3");
		
		st.addBatch("insert into user(id,name,mobilenumber,email,password,age) values(4,'D',126,'D@gmail.com','Hellohii',22)");
		
		st.executeBatch();
		
		System.out.println("Batch Executed....!!");
		
	}

}
