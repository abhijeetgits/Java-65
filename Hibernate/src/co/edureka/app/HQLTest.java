package co.edureka.app;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.domains.Student;

public class HQLTest {

	public static void main(String[] args) throws Exception{
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		/*
		String hql = "from co.edureka.domains.Student";
		TypedQuery<Student> q = session.createQuery(hql);
		List<Student> students = q.getResultList();
		*/
		
		/*
		String hql = "from co.edureka.domains.Student where sname='Anil'";
		TypedQuery<Student> q = session.createQuery(hql);
		List<Student> students = q.getResultList();
		*/
		
		/*
		//Positional Parameters
		String hql = "from co.edureka.domains.Student where studid between ? and ?";
		TypedQuery<Student> q = session.createQuery(hql);
		q.setParameter(0, Integer.valueOf(101));
		q.setParameter(1, Integer.valueOf(104));
		List<Student> students = q.getResultList();
		*/

		//named Parameters
		String hql = "from co.edureka.domains.Student where studid between :minsid and :maxsid";
		TypedQuery<Student> q = session.createQuery(hql);
		q.setParameter("minsid", Integer.valueOf(104));
		q.setParameter("maxsid", Integer.valueOf(1400));
		List<Student> students = q.getResultList();		
		for(Student st : students)
		{
			System.out.println(st);
			Thread.sleep(1000);
		}
		
		session.beginTransaction();
		q = session.createQuery("update co.edureka.domains.Student set email='sagar@hotmail.com' where studid = 110");
		int n = q.executeUpdate();
		if(n>0)
			System.out.println("Student Updated");
		
		session.getTransaction().commit();
		session.close();
		sf.close();	
	}
}
