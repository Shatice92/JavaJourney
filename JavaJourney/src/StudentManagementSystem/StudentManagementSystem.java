package StudentManagementSystem;

import java.io.*;
import java.util.ArrayList;
import java.util.SortedMap;

public class StudentManagementSystem {
	
	public ArrayList<Student> students;
	
	public StudentManagementSystem() {
		this.students = new ArrayList<>();
	}
	
	
	public void addStudent(Student student) {
		students.add(student);
		System.out.println("Student added  " + student.getName());
		
	}
	
	public void displayAllStudent() {
		if (students.isEmpty()) {
			System.out.println("No students found");
		}
		else {
			System.out.println("List of all students: ");
			for (Student student : students) {
				student.toString();
				System.out.println();
			}
		}
		
		
	}
	
	
	public void writeStudentInfoToFile() {
		try (FileWriter fileWriter = new FileWriter("student.txt")) {
			for (Student student : students) {
				fileWriter.write("Name " + student.getName() + "\n");
				fileWriter.write("Id " + student.getId() + "\n");
				fileWriter.write("Course " + student.getCourse() + "\n");
				fileWriter.write("\n");
			}
			System.out.println("Student data saved to file.");
			
			
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void deleteStudent(String id) {
		boolean isRemoved = false;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId().equals(id)) {
				students.remove(i);
				isRemoved = true;
				break;
			}
		}
		
		
	}
	
	public void updateStudentInfo(String id,String newName,String newCourse){
		boolean isUpdated=false;
		for (Student student : students) {
			if (student.getId().equals(id)){
				student.setName(newName);
				student.setCourse(newCourse);
				System.out.println("student with id"+id+ "is updated");
				isUpdated=true;
				break;
			}
		}
		
		if (!isUpdated){
			System.out.println("student with id"+id+" is not found");
		}
		
	}
	
	public void readFile(){
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("students.txt"))) {
			String line;
			while ((line= bufferedReader.readLine())!=null){
				String[] parts=line.split(",");
				if (parts.length==3){
					String id=parts[0];
					String name=parts[1];
					String course=parts[2];
					students.add(new Student(name,id,course));
				}
			}
			System.out.println("student data loaded from  a file.");
		}
		catch (FileNotFoundException e) {
			e.getMessage();
		}
		catch (IOException e) {
			e.getMessage();
		}
		
		
	}
	
	
}