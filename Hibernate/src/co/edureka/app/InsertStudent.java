package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.domains.Student;

public class InsertStudent {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("co/edureka/configs/hibernate.cfg.xml"); //XML parsing
		
		SessionFactory sfactory = config.buildSessionFactory();		
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student st = new Student(101,"Sunil","sunil@hotmail.com","9848586878");
		
		session.save(st);
		System.out.println("------------------------------");		
		
		tx.commit();
		
		session.close();
		sfactory.close();
	}
}
