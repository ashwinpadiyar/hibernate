package hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException {
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

		// creating studend address object
		Address address = new Address();
		address.setStreet("18th Cross");
		address.setCity("Bengaluru");
		address.setOpen(true);
		address.setAddedDate(new Date());
		address.setX(10.3);

		// Read and store image into the database
		FileInputStream fileRead = new FileInputStream("src/main/java/Test.png");
		byte[] imageData = new byte[fileRead.available()];
		fileRead.read(imageData);
		address.setImage(imageData);

		// process to store data to database using hibernate
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(student);
		session.save(address);
		transaction.commit();
		session.close();
	}
}
