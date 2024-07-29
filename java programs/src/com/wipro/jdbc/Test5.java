package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test5 {
	
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","reshma");
		
		Statement st = con.createStatement();
		
		st.addBatch("insert into student values(15,'Sneha')");
		st.addBatch("update student set stname = 'Anju' where stid = 12");
		st.addBatch("delete from student where stid = 14");
		
		int x[] = st.executeBatch();
		
		System.out.println(x[0] +"row inserted");
		System.out.println(x[1] +"row updated");
		System.out.println(x[2] +"row deleted");
		
		con.close();
	}

}
