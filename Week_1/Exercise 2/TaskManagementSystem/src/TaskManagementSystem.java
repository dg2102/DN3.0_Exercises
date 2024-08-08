// Node.java
class Node {
    Task task;
    Node next;

    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
}

// TaskManagementSystem.java
public class TaskManagementSystem {
    private Node head;

    // Add task
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Search task by ID
    public Task searchTask(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null; // Not found
    }

    // Traverse tasks
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println("Task ID: " + current.task.getTaskId() +
                               ", Task Name: " + current.task.getTaskName() +
                               ", Status: " + current.task.getStatus());
            current = current.next;
        }
    }

    // Delete task by ID
    public boolean deleteTask(String taskId) {
        if (head == null) return false; // List is empty

        // Handle case for head
        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return true; // Deleted head
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.task.getTaskId().equals(taskId)) {
                current.next = current.next.next; // Bypass the node to be deleted
                return true; // Successfully deleted
            }
            current = current.next;
        }
        return false; // Not found
    }
}