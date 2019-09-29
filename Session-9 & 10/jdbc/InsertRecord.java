package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka", "root","");
		
		Statement st = con.createStatement();
		
		//String sql = "insert into emp values(101,'Sunil',123.45)";
		String sql = "insert into emp(empno,ename,sal) values(102,'Anil',223.45),(103,'Sanjay',345.12),(104,'Naveen',897.50)";
		try {
			int n = st.executeUpdate(sql);
			System.out.println("Employes Saved - "+ n);
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
