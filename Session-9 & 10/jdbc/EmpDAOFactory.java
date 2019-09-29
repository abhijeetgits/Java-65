package co.edureka.jdbc;

public class EmpDAOFactory {
 public static EmployeeDAO getEmployeeDAO() throws Exception{
	 EmployeeDAO dao = new EmployeeDAOImpl();
	 return dao;
 }
}
