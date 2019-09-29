package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception{
		//Initialize JDBC Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//connect to DB server
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","java65","password");
		System.out.println("Connected to DB");
		
		//create an object for passing SQL queries to connected DB
		Statement st = con.createStatement();
		
		//prepare SQL
		String sql = "create table emp(empno number(5), ename varchar(25), sal number(10,2), primary key(empno))";
		
		try {
			//pass SQL query
			st.execute(sql);
			System.out.println("DB Table created - ");
		}
		catch(Exception ex) {
		 System.out.println(ex.toString()+"\n");	
		}
		finally {
			st.close();
			con.close();
		}
	}
}
