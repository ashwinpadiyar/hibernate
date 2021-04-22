package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Project Started");
		// A SessionFactory is similar to the Connection class in JDBC; it is a
		// threadsafe object that provides a session through which we can save data.
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println(factory);
		System.out.println(factory.isClosed());
	}
}
