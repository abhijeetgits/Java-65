package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.domains.Student;

public class FirstLevelCache {

	public static void main(String[] args) throws InterruptedException {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session1 = sf.openSession();
		
		Student st1 = session1.get(Student.class, 101);
		System.out.println(st1);
		System.out.println("---------------------------");
		Thread.sleep(2000);

		Student st2 = session1.get(Student.class, 101);
		System.out.println(st2);		
		session1.close();
		sf.close();
	}
}
