package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test1 {

	public static void main(String[] args)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver class loaded");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "reshma");
			System.out.println("i got the connection");
			
			Statement st = con.createStatement();
			
			int x = st.executeUpdate("insert into student values(13,'madhu')");
			System.out.println(x+ "row inserted");
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
