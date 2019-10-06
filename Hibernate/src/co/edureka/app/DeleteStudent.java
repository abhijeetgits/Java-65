package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.domains.Student;

public class DeleteStudent {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		/*
		Student st = new Student(101,"Sunil Joseph","sunil@edureka.co","9898989898");
		session.delete(st);
		*/
		
		Student st = session.get(Student.class, Integer.valueOf(103));
		if(st != null) {
			System.out.println(st);
			session.delete(st);
		}
		else
			System.out.println("No Matching student found");
		
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}
