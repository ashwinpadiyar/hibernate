package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();

		Student student = (Student) session.get(Student.class, 1);
		System.out.println(student);
		
		Student sameStudent = (Student) session.get(Student.class, 1);
		System.out.println(sameStudent);
		// In the second instance, the objects are the same as the first one and will be in the session cache.
		System.out.println("The select query will be fired only once to fetch student object!");
		
		Address address = (Address) session.load(Address.class, 1);
		System.out.println("Proxy object till this point for address object, Lazy loading");
			
		System.out.println("Actual object will be created, database call will be fired. Lazy loading: "+address.getCity());
		
		session.close();
		factory.close();
	}
}
