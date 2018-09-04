package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory = buildSessionFactory();
	private static Session session = null;
	
	static SessionFactory buildSessionFactory()
	{
		try {
			if (sessionFactory == null) {
	        	 sessionFactory = new Configuration().configure().buildSessionFactory();
	        	 }
	         return sessionFactory;
	         } catch (Throwable e) {
	            System.err.println("Initial SessionFactory creation failed." + e);
	            throw new ExceptionInInitializerError(e);
	         }
	}
	 
	public static SessionFactory getSessionFactory() {
	      return sessionFactory;
	}
	 
	public static void shutdown() {
	      getSessionFactory().close();
	}
	
	public static Session openSession() {
		session = sessionFactory.openSession();	
	return session;
	}
	
	public static void closeSession() {
		session.close();
	}
}
