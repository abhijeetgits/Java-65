package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveEmployees {

	public static void main(String[] args) throws Exception {
		/*
		Class.forName("com.mysql.jdbc.Driver");		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka", "root","");
		*/
		
		Connection con = ConnectionFactory.getConnection();
		
		Statement st = con.createStatement();
		
		String sql = "select * from emp";
		
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) 
		{
		 System.out.println(rs.getRow()+") "+rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getFloat("sal"));
		 Thread.sleep(2000);
		}
		
		rs.close();
		st.close();
		con.close();
	}
}
