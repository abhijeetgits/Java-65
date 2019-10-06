package co.edureka.app;

import java.util.Scanner;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.domains.Student;

public class InsertStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		String req="Y";
		while(req.equalsIgnoreCase("Y"))
		{
		 System.out.println("enter student name, email, mobile:");
		 String name = sc.nextLine();
		 String email = sc.nextLine();
		 String mobile = sc.nextLine();
		 
		 Student st = new Student(name,email,mobile);
		 session.save(st);
		 System.out.print("do you want to add more students[Y/N]: ");
		 req=sc.next();
		}
		
		tx.commit();
		sc.close();
		session.close();
		sf.close();
	}

}
