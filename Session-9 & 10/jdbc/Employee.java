//DTO - POJO
package co.edureka.jdbc;

public class Employee {
 private int empno;
 private String ename;
 private float sal;
 
 public Employee() {}
 
 public Employee(int empno, String ename, float sal) {
	 this.empno = empno;
	 this.ename = ename;
	 this.sal = sal;
 }

public int getEmpno() {
	return empno;
}

public void setEmpno(int empno) {
	this.empno = empno;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public float getSal() {
	return sal;
}

public void setSal(float sal) {
	this.sal = sal;
}
public String toString() {
	return "Employee ["+this.empno+" | "+this.ename+" | "+this.sal+"]";
}
}
