 # hibernate
1. This java framework makes it easy for Java applications to interact with databases.
2. It's an Object Relational Mapping tool. 
3. Hibernate is also a non-invasive framework, meaning it doesn't force the developer to extend or implement any classes or interfaces.

- Traditionally,When Java applications wanted to interact with a database, they used the JDBC API. JDBC loaded database-specific drivers and we manually wrote queries and specified every specific column and row.


#### Functioning of ORM
- Here, Hibernate simplifies matters, so we need to create a class representing a database table and create similar fields in the class.
    - Mapping can be achieved in two ways
        - Using XML
        - Using Annotation
- We will have to create an object of that class and hand it to the library/framework of Hibernate to save it into the database.
- Hibernate will write CRUD queries for us internally, and communicate with the JDBC APIs on our behalf, to save the data into the database

## Configuring hibernate 
- In the Hibernate configuration, we have to know about the type of database, the username, and the password.
- Standard practice is to create config file with the name : hibernate.cfg.xml
- A SessionFactory is similar to the Connection class in JDBC; it is a threadsafe object that provides a session through which we can save data.
- Using the session factory reference we can load the configuration file created for Hibernate with database details.
    ```
    SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    ```

## Create entity and map it database table

- An Entity and Table will be created with the same class name by default. If the user wishes to change it, we need to use the @Table annotation 
``` 
	example: @Table(name="students") 
``` 
- As a result, the entity name will be "Student" and the database table will be "students".

```
	@Entity
	public class Student {
		@Id
		private int id;
```
- [Commonly used hibernate annotations](https://dzone.com/articles/all-hibernate-annotations-mapping-annotations)

## Fetch data from database
-   Hibernate framework provides methods to get data from the database.
    -   get() 
			- If the object cannot be found, it returns null.
			- Tries to fetch from session cache, if not found, hits the database.
    -   load()
            - ObjectsNotFoundException is thrown if they do not exist when we retrieve them.
            - Whenever load() is called, it creates a dummy or proxy object. 
            - If any method is called on entity object other than getID(), then initialization or obtaining data from the database will occur.
            - This concept is lazy loading. 
