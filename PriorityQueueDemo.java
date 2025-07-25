// A priority queue is a special type of queue where:
// Elements are ordered by priority, not insertion order.
// By default, it's a min-heap (smallest element first).
// You can make it a max-heap by providing a custom comparator.

// ➤ Min-Heap (default):
// PriorityQueue<Integer> pq = new PriorityQueue<>();
// ➤ Max-Heap:
// PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
// ➤ Custom comparator (e.g., for objects):
// PriorityQueue<Task> pq = new PriorityQueue<>((a, b) -> a.deadline - b.deadline);

// | Method         | Purpose                                   |
// | -------------- | ----------------------------------------- |
// | `add(element)` | Add element to queue                      |
// | `poll()`       | Remove and return highest priority (head) |
// | `peek()`       | View head without removing                |
// | `isEmpty()`    | Check if queue is empty                   |
// | `size()`       | Number of elements                        |

import java.util.PriorityQueue;

class Task {
    String name;
    int priority;
    
    Task(String name, int priority){
        this.name = name;
        this.priority = priority;
    }
}

class TaskScheduler {

    PriorityQueue<Task> tasks;

    TaskScheduler(){
        tasks = new PriorityQueue<>((a, b) -> a.priority - b.priority);
    }

    void addTask(String name, int priority){
        Task t = new Task(name, priority);
        tasks.add(t);
    }

    String getNextTask(){
        Task next = tasks.poll();
        return next != null ? next.name : "No tasks remaining";
    }

    void printAllTasks(){
        PriorityQueue<Task> copy = new PriorityQueue<>(tasks);
        while(!copy.isEmpty()){
            String taskName = copy.poll().name;
            System.out.print(taskName + " ");
        }
        System.out.println("");
    }
}

public class PriorityQueueDemo {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask("Write Report", 3);
        scheduler.addTask("Fix Bug", 1);
        scheduler.addTask("Update Docs", 2);

        System.out.println("All tasks by priority:");
        scheduler.printAllTasks(); // Fix Bug Update Docs Write Report

        System.out.println("\nNext task: " + scheduler.getNextTask()); // Fix Bug
        System.out.println("Next task: " + scheduler.getNextTask()); // Update Docs
        System.out.println("Next task: " + scheduler.getNextTask()); // Write Report
        System.out.println("Next task: " + scheduler.getNextTask()); // No tasks remaining
    }
}
