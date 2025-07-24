// LinkedList is a doubly linked list implementation of the List and Deque interfaces.
// Each element (node) holds a reference to the previous and next elements.
// It allows nulls, duplicates, and maintains insertion order.

// | Feature            | Behavior                   |
// | ------------------ | -------------------------- |
// | Ordered            | ✅ Yes (insertion order)    |
// | Duplicates Allowed | ✅ Yes                      |
// | Random Access      | ❌ Slower than `ArrayList`  |
// | Insert/Delete      | ✅ Fast at head/tail/middle |
// | Implements         | `List`, `Deque`, `Queue`   |

// | Category       | Methods                                       |
// | -------------- | --------------------------------------------- |
// | Basic          | `add()`, `remove()`, `get()`, `size()`        |
// | Queue-like     | `addFirst()`, `addLast()`, `poll()`, `peek()` |
// | Stack-like     | `push()`, `pop()`                             |
// | Deque-specific | `removeFirst()`, `removeLast()`               |

import java.util.LinkedList;

class TaskManager{
    LinkedList<String> tasks;

    public TaskManager(){
        this.tasks = new LinkedList<>();
    }

    // add at the front
    void addHighPriorityTask(String task){
        tasks.addFirst(task);
    }

    // add at the end
    void addNormalTask(String task){
        tasks.addLast(task);
    }
    
    String removeFirstTask(){
        // String firstTask = tasks.getFirst(); -> no need to get this because removeFirst() also return the element it deletes
        return tasks.removeFirst();
    }
    
    String removeLastTask(){
        // String lastTask = tasks.getLast(); -> not required
        return tasks.removeLast();
    }

    void printAllTasks(){
        for(String task : tasks){
            System.out.print(task + " ");
        }
        System.out.println("");
    }
}

public class LinkedListsDemo {
    public static void main(String[] args) {
        TaskManager tManager = new TaskManager();

        tManager.addNormalTask("Write report");
        tManager.addHighPriorityTask("Fix prod bug");
        tManager.addNormalTask("Attend meeting");
        tManager.addHighPriorityTask("Respond to client");

        System.out.println("All tasks:");
        tManager.printAllTasks();

        System.out.println("Removed first task: " + tManager.removeFirstTask());
        System.out.println("Removed last task: " + tManager.removeLastTask());

        System.out.println("Remaining tasks:");
        tManager.printAllTasks();
    }
}