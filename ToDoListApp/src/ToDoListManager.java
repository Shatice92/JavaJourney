import java.util.ArrayList;
import java.util.List;

public class ToDoListManager {
	private List<Task> tasks;
	
	public ToDoListManager() {
		this.tasks = new ArrayList<>();
	}
	
	/**
	 * this method add new tasks into your todoList
	 *
	 * @param description the definiton of the tasks
	 */
	public void addTask(String description) {
		int id = tasks.size() + 1;
		Task newTask = new Task(id, description);
		tasks.add(newTask);
		System.out.println("New task is added to your list!" + newTask);
	}
	
	/**
	 * this method remove tasks with related id from your todoList
	 *
	 * @param removedId the id that belongs to task
	 */
	public void removeTask(int removedId) {
		Task taskToRemove = findTaskById(removedId);
		if (taskToRemove != null) {
			tasks.remove(taskToRemove);
			System.out.println("Task removed successfully" + taskToRemove);
		}
		else {
			System.out.println("Task with this id" + removedId + " is not found!");
		}
		
		
	}
	
	/**
	 * this method marks tasks as a completed
	 *
	 * @param id the id that belongs the task
	 */
	public void markTaskAsCompleted(int id) {
		Task taskToComplete = findTaskById(id);
		if (taskToComplete != null) {
			taskToComplete.setCompleted(true);
			System.out.println("The task is marked as completed" + taskToComplete);
		}
		else {
			System.out.println("The task with id" + id + " is not found");
		}
	}
	
	/**
	 * it lists all tasks in your todoList
	 */
	public void listTask() {
		if (tasks.isEmpty()) {
			throw new IllegalArgumentException("The task list is empty");
		}
		else {
			System.out.println("ToDo List: ");
			for (Task task : tasks) {
				System.out.println(task);
			}
		}
	}
	
	/**
	 * @param id the id that belongs to related task
	 * @return Task to search for related id
	 */
	public Task findTaskById(int id) {
		for (Task task : tasks) {
			if (task.getId() == id) {
				return task;
			}
		}
		return null;
	}
}