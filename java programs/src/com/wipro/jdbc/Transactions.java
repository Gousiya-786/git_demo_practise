package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Transactions {
	
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","reshma");
		
		con.setAutoCommit(false);
		
		Statement st = con.createStatement();
		
		st.addBatch("update ramya set bal=bal-5000 where accno=1003005");
		st.addBatch("update rahul set bal=bal+5000 where accno=1003006");
		
		int x[] = st.executeBatch();
		
		if(x[0]>0 & x[1]>0)
		{
			con.commit();
			System.out.println("Transcation Successful , Thankyou");
		}
		else
		{
			con.rollback();
			System.out.println("Something went wrong , check account number");
		}
	}

}
