import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String name) {
        tasks.add(new Task(name));
    }

    public void updateTask(int id, String newName) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setName(newName);
                break;
            }
        }
    }

    public void deleteTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }

    public List<Task> listTasks() {
        return new ArrayList<>(tasks);
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Task 1");
        taskManager.addTask("Task 2");
        taskManager.addTask("Task 3");

        System.out.println("Tasks after addition:");
        taskManager.listTasks().forEach(System.out::println);

        taskManager.updateTask(2, "Updated Task 2");

        System.out.println("Tasks after update:");
        taskManager.listTasks().forEach(System.out::println);

        taskManager.deleteTask(1);

        System.out.println("Tasks after deletion:");
        taskManager.listTasks().forEach(System.out::println);
    }
}
