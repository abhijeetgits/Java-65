package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableMySQL {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka", "root","");
		
		Statement st = con.createStatement();
		
		String sql = "create table emp(empno int(5) primary key, ename varchar(25), sal float(10,2))";
		
		try {
			st.execute(sql);
			System.out.println("DB Table created @ edureka");
		}
		catch(Exception ex) {
			System.out.println("ERROR: "+ ex.getMessage());
		}
		finally {
			st.close();
			con.close();
		}
	}

}
