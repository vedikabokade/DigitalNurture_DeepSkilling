public class TaskManagement {

    private Task head;
    // Add Task
    public void addTask(Task task) {
        if (head == null) {
            head = task;
        } else {
            Task temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = task;
        }
        System.out.println("Task Added Successfully.");
    }

    // Search Task
    public void searchTask(int id) {
        Task temp = head;
        while (temp != null) {
            if (temp.taskId == id) {
                System.out.println("Task Found:");
                System.out.println(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Task Not Found.");
    }

    // Traverse Tasks
    public void traverseTasks() {
        if (head == null) {
            System.out.println("No Tasks Available.");
            return;
        }
        Task temp = head;
        System.out.println("\nTask List:");
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    // Delete Task
    public void deleteTask(int id) {
        if (head == null) {
            System.out.println("Task List is Empty.");
            return;
        }
        if (head.taskId == id) {
            head = head.next;
            System.out.println("Task Deleted Successfully.");
            return;
        }
        Task current = head;
        while (current.next != null && current.next.taskId != id) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Task Not Found.");
        } else {
            current.next = current.next.next;
            System.out.println("Task Deleted Successfully.");
        }
    }

    public static void main(String[] args) {

        TaskManagement tm = new TaskManagement();

        tm.addTask(new Task(101, "Design Homepage", "Pending"));
        tm.addTask(new Task(102, "Develop Login", "Completed"));
        tm.addTask(new Task(103, "Test Payment", "Pending"));

        tm.traverseTasks();
        System.out.println();

        tm.searchTask(102);
        System.out.println();

        tm.deleteTask(103);
        System.out.println();

        tm.traverseTasks();
    }
}
