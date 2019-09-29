package co.edureka.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class ProcedureCall {

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "java65", "password");
		
		CallableStatement cst = con.prepareCall("{call addNum(?,?,?)}");
		
		int x=12,y=45;
		cst.setInt(1, x);
		cst.setInt(2, y);
		cst.registerOutParameter(3, Types.INTEGER);
		
		cst.execute();
		System.out.println(x+" + "+y+" = "+ cst.getInt(3));
		
		cst.close();
		con.close();
	}
}
