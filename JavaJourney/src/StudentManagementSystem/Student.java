package StudentManagementSystem;

import java.util.Properties;

public class Student {
	private String name;
	private String id;
	private String course;
	
	public Student(String name, String id, String course) {
		this.name = name;
		this.id = id;
		this.course = course;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getCourse() {
		return course;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	@Override
	public String toString() {
		return "Student{" + "name='" + getName() + '\'' + ", id='" + getId() + '\'' + ", course='" + getCourse() + '\'' + '}';
	}
}