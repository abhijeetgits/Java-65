package co.edureka.configs;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	public static SessionFactory getSessionFactory() {
		Configuration config = new Configuration();
		config.configure("co/edureka/configs/hibernate.cfg.xml"); 

		SessionFactory sfactory = config.buildSessionFactory();
		return sfactory;
	}
}
