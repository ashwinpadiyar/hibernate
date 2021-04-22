 # hibernate
1. This java framework makes it easy for Java applications to interact with databases.
2. It's an Object Relational Mapping tool. 
3. Hibernate is also a non-invasive framework, meaning it doesn't force the developer to extend or implement any classes or interfaces.

- Traditionally,When Java applications wanted to interact with a database, they used the JDBC API. JDBC loaded database-specific drivers and we manually wrote queries and specified every specific column and row.

#### Functioning of ORM
- Here, Hibernate simplifies matters, so we need to create a class representing a database table and create similar fields in the class.
    - Mapping can be achieved in two ways
        1. Using XML
        2.Using Annotation
- We will have to create an object of that class and hand it to the library/framework of Hibernate to save it into the database.
- Hibernate will write CRUD queries for us internally, and communicate with the JDBC APIs on our behalf, to save the data into the database

