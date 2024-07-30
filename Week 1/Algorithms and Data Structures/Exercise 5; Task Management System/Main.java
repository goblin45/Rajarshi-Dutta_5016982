import java.util.*; // for List and LinkedList

class Task {
    protected int taskId;
    protected String taskName, status;

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }
}

class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new LinkedList<>();
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public Task searchTask(int taskId) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).taskId == taskId) {
                System.out.println("Task found: ");
                return tasks.get(i);
            }
        }
        return null;
    }

    public void printTask(Task task) {
        System.out.println("Task Id: " + task.taskId);
        System.out.println("Task Name: " + task.taskName);
        System.out.println("Task Status: " + task.status);
        System.out.println();
    }

    public void printAllTasks() {
        System.out.println("All tasks: ");
        for (int i = 0; i < tasks.size(); i++) {
            printTask(tasks.get(i));
        }
    }

    public void deleteTask(int taskId) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).taskId == taskId) {
                tasks.remove(i);
                System.out.println("Task with id " + taskId + " has been deleted");
                return;
            }
        }
        System.out.println("Task with id " + taskId + " does not exist");
    }
}

public class Main {
    // insert 5 tasks
    static void insertTasks(TaskManager tasks) {
        tasks.addTask(new Task(1, "Task 1", "Not Started"));
        tasks.addTask(new Task(2, "Task 2", "In Progress"));
        tasks.addTask(new Task(3, "Task 3", "Completed"));
        tasks.addTask(new Task(4, "Task 4", "Not Started"));
        tasks.addTask(new Task(5, "Task 5", "In Progress"));
    }
    public static void main(String[] args) {
        TaskManager tasks = new TaskManager();
        insertTasks(tasks);

        // add task
        tasks.addTask(new Task(6, "Task 6", "Not Started"));

        // print all tasks
        System.out.println("After addition: ");
        tasks.printAllTasks();

        // search task
        tasks.printTask(tasks.searchTask(5));
        
        // delete task
        tasks.deleteTask(6);

        System.out.println("After deletion: ");
        tasks.printAllTasks();
    }
}

/*

Output:

After addition: 
All tasks: 
Task Id: 1
Task Name: Task 1
Task Status: Not Started

Task Id: 2
Task Name: Task 2
Task Status: In Progress

Task Id: 3
Task Name: Task 3
Task Status: Completed

Task Id: 4
Task Name: Task 4
Task Status: Not Started

Task Id: 5
Task Name: Task 5
Task Status: In Progress

Task Id: 6
Task Name: Task 6
Task Status: Not Started

Task found: 
Task Id: 5
Task Name: Task 5
Task Status: In Progress

Task with id 6 has been deleted
After deletion: 
All tasks: 
Task Id: 1
Task Name: Task 1
Task Status: Not Started

Task Id: 2
Task Name: Task 2
Task Status: In Progress

Task Id: 3
Task Name: Task 3
Task Status: Completed

Task Id: 4
Task Name: Task 4
Task Status: Not Started

Task Id: 5
Task Name: Task 5
Task Status: In Progress

*/