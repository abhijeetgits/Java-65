package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchExecTest {

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "java65", "password");
		
		Statement st = con.createStatement();
		
		con.setAutoCommit(false);
		
		st.addBatch("insert into emp values(101,'Sunil',123.45)");
		st.addBatch("insert into emp values(102,'Anil',123.45)");
		//st.addBatch("insert into emp values(101,'Sanjay',123.45)");
		st.addBatch("insert into emp values(103,'Sanjay',123.45)");
		st.addBatch("update emp set sal=999.99");
		
		try {
		  int[] n = st.executeBatch();
		  for(int x : n) {
			  System.out.println("Records Affected: "+x);
		  }
		  con.commit();
		}
		catch(Exception e) {
			System.out.println(e);
			con.rollback();
		}
		
		st.close();
		con.close();
	}
}
