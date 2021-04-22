package hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
// An Entity and Table will be created with the same class name by default. If the user wishes to change it, we need to use the @Table annotation 
// example: @Table(name="students"). 
// As a result, the entity name will be "Student" and the database table will be "students".
public class Student {
	@Id
	private int id;
	
	private String name;
	
	private String city;

	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	

}
