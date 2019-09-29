package co.edureka.jdbc;

import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception{
		EmployeeDAO dao = EmpDAOFactory.getEmployeeDAO();
		
		/*
		//insert a new employee
		Employee emp = new Employee(105,"Rahul",555.55f);
		dao.saveEmp(emp);
		*/
		
		/*
		//update Employee
		Employee emp = new Employee(101,"Sunil Joseph",999.99f);
		dao.updateEmp(emp);
		*/
		
		/*
		//Search for an Employee
		Scanner sc = new Scanner(System.in);
		System.out.print("enter empno to search: ");
		int empno = sc.nextInt();
		Employee emp = dao.searchEmp(empno);
		if(emp != null)
			System.out.println(emp); //toString()
		else
			System.out.println("No matching employee found");
		*/
		
		List<Employee> emps = dao.getEmployees();
		for(Employee emp : emps) {
			System.out.println(emp);
			Thread.sleep(1500);
		}
	}
}
