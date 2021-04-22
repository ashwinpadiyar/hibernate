package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Project Started");
		// A SessionFactory is similar to the Connection class in JDBC; it is a
		// threadsafe object that provides a session through which we can save data.
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		// Creating student
		Student student = new Student();
		student.setId(1);
		student.setName("Ashwin");
		student.setCity("Bengaluru");
		System.out.println(student); 

		// process to store data to database using hibernate
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();
		session.close();
	}
}
