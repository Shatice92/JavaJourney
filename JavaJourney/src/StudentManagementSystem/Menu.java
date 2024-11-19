package StudentManagementSystem;

import java.util.List;
import java.util.Scanner;

public class Menu {
	static Scanner scanner = new Scanner(System.in);
	StudentManagementSystem studentManagementSystem = new StudentManagementSystem();
	
	public void Menu() {
		while (true) {
			System.out.println("\n=== Student Management System ===");
			System.out.println("1. Add a new student");
			System.out.println("2. Display all students");
			System.out.println("3. Delete a student");
			System.out.println("4. Update a student");
			System.out.println("5. Save students to file");
			System.out.println("6. Load students from file");
			System.out.println("0. Exit");
			System.out.print("Choose an option: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
				case 1:
					System.out.println("enter student name: ");
					String name = scanner.nextLine();
					System.out.println("enter student id: ");
					String id = scanner.nextLine();
					System.out.println("enter the course :");
					String course = scanner.nextLine();
					studentManagementSystem.addStudent(new Student(name, id, course));
					break;
				case 2:
					studentManagementSystem.displayAllStudent();
					break;
				case 3:
					try {
						System.out.println("enter the student id to delete: ");
						String idToDelete = scanner.nextLine();
						idChecker(idToDelete, studentManagementSystem.students);
						studentManagementSystem.deleteStudent(idToDelete);
						System.out.println("the student with this id is deleted");
					}
					catch (IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}
					
					break;
				case 4:
					System.out.println("please enter student id to update: ");
					String idToUpdate = scanner.nextLine();
					System.out.println("please enter name to update : ");
					String nameToUpdate = scanner.nextLine();
					System.out.println("please enter the new course: ");
					String newCourse = scanner.nextLine();
					studentManagementSystem.updateStudentInfo(idToUpdate, nameToUpdate, newCourse);
					break;
				case 5:
					studentManagementSystem.writeStudentInfoToFile();
					break;
				case 6:
					studentManagementSystem.readFile();
					break;
				
				case 0:
					System.out.println("exit is in the progress...");
					return;
				default:
					System.out.println("please make a valid choice");
				
			}
		}
	}
	
	public void idChecker(String id, List<Student> students) {
		if (id == null || id.isEmpty()) {
			throw new IllegalArgumentException("id cannot be empty");
		}
		
		if (!id.matches("\\w+")) {
			throw new IllegalArgumentException("id must contain only alphanumeric characters..");
		}
		boolean idExists = students.stream().anyMatch(student -> student.getId().equals(id));
		if (!idExists) {
			throw new IllegalArgumentException(" no student found with this id" + id);
		}
	}
}