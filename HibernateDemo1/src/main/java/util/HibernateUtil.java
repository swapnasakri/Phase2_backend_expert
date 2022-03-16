package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



import entity.EProduct5;


public class HibernateUtil {

	static SessionFactory sessionFactory;

	public static SessionFactory buildSessionFactory() {

		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			cfg.configure("Hibernate.cfg.xml");
			cfg.addAnnotatedClass(EProduct5.class);
			
			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}
}