package co.edureka.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.configs.HibernateUtils;
import co.edureka.domains.Account;

public class CreateAccount {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a/c no: ");
		String acno = sc.next();
		sc.nextLine();
		
		System.out.print("enter name: ");
		String name = sc.nextLine();
		
		System.out.print("enter initial deposit: ");
		float amt = sc.nextFloat();
		
		Account acc = new Account(acno,name,amt);
		
		session.save(acc);
		System.out.println("A/C Created!");
		
		tx.commit();
		sc.close();
		session.close();
		sf.close();
	}

}
