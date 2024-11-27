import java.util.Scanner;

public class Menu {
	private ToDoListManager toDoListManager;
	private Scanner scanner;
	
	
	public Menu() {
		this.toDoListManager = new ToDoListManager();
		this.scanner = new Scanner(System.in);
	}
	
	/**
	 * it shows start menu
	 */
	public void start() {
		while (true) {
			System.out.println("-----Welcome to Your ToDoListManager-----");
			System.out.println("Please enter your choice ");
			System.out.println("""
					                   1.Add new Task
					                   2.Remove a Task
					                   3.Mark a Task as completed
					                   4.List all Tasks
					                   5.Exit
					                   
					                   """);
			try {
				int choice = scanner.nextInt();
				scanner.nextLine();
				switch (choice) {
					case 1:
						addTask();
						break;
					case 2:
						removeTask();
						break;
					case 3:
						markAsCompleted();
						break;
					case 4:
						listTasks();
						break;
					case 5:
						System.out.println("Exit is in progress...");
						return;
					default:
						System.out.println(" Please enter a valid choice!");
				}
				
				
			}
			catch (Exception e) {
				System.out.println("Invalid input, please select valid  number.");
				scanner.nextLine();
			}
		}
	}
	
	
	private void listTasks() {
		System.out.println("Listed tasks are");
		toDoListManager.listTask();
	}
	
	
	private void markAsCompleted() {
		System.out.println("Please enter task id to mark it as completed: ");
		int markTaskAsCompletedid = scanner.nextInt();
		toDoListManager.markTaskAsCompleted(markTaskAsCompletedid);
	}
	
	
	private void removeTask() {
		System.out.println("Please enter id to remove task : ");
		int removeId = scanner.nextInt();
		toDoListManager.removeTask(removeId);
	}
	
	
	private void addTask() {
		System.out.println("Enter task description: ");
		String description = scanner.nextLine();
		toDoListManager.addTask(description);
		System.out.println("Task is added!");
	}
	
}