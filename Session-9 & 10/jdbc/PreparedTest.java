package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PreparedTest {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getConnection(); 		
		PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?)");
		
		pst.setInt(1, 106);
		pst.setString(2, "User-1");
		pst.setFloat(3, 111.11f);
		int n = pst.executeUpdate();
		System.out.println("Employee Saved : "+n);
		
		pst.clearParameters();
		pst.setInt(1, 107);
		pst.setString(2, "User-2");
		pst.setFloat(3, 222.2f);
		n = pst.executeUpdate();
		System.out.println("Employee Saved : "+n);
		
		pst.close();
		con.close();
	}
}
