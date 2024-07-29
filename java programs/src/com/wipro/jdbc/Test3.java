package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "reshma");
		
		PreparedStatement pst = con.prepareStatement("insert into student values(?,?)");
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter student id : ");
		int stid = s.nextInt();
		
		System.out.println("Enter student name : ");
		String stname = s.next();
		
		pst.setInt(1,  stid);
		pst.setString(2, stname);
		
		int x = pst.executeUpdate();
		System.out.println(x + "row inserted");
		
		con.close();
		
	}
}
