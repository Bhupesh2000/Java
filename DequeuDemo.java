// 🔍 What is a Deque?
// Deque stands for Double Ended Queue.
// You can add and remove elements from both front and rear.
// It is an interface, and the most common implementation is ArrayDeque.

// ✅ Why ArrayDeque?
// Faster than LinkedList for most stack/queue operations.
// No capacity restrictions like ArrayList (resizes dynamically).
// No thread-safety overhead (unlike ConcurrentLinkedDeque).

// Use Case in LLD
// | Scenario                     | Use `Deque` As |
// | ---------------------------- | -------------- |
// | Browser history              | Stack          |
// | Undo functionality           | Stack          |
// | Task processing (front/rear) | Queue or Deque |
// | Sliding window algorithms    | Deque          |

// | Method          | Description             |
// | --------------- | ----------------------- |
// | `addFirst(e)`   | Insert at the front     |
// | `addLast(e)`    | Insert at the rear      |
// | `removeFirst()` | Remove from front       |
// | `removeLast()`  | Remove from rear        |
// | `peekFirst()`   | View front element      |
// | `peekLast()`    | View last element       |
// | `isEmpty()`     | Check if deque is empty |

import java.util.ArrayDeque;
import java.util.Deque;

class BrowserHistory{

    Deque<String> tabs;
    Deque<String> forwardTabs;

    BrowserHistory(String homepage){
        tabs = new ArrayDeque<>();
        forwardTabs = new ArrayDeque<>();
        tabs.addLast(homepage);
    }

    void visitPage(String url){
        tabs.addLast(url);
        forwardTabs.clear();
    }
    String back(){
        if(tabs.size() == 1) return tabs.peekFirst();
        forwardTabs.addFirst(tabs.removeLast());
        return tabs.peekLast();
    }
    String forward(){
        if(forwardTabs.isEmpty()) return tabs.peekLast();
        tabs.addLast(forwardTabs.removeFirst());
        return tabs.peekLast();
    }
    String currentPage(){
        return tabs.getLast();
    }
}

public class DequeuDemo {
    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory("home.com");
        history.visitPage("a.com");
        history.visitPage("b.com");
        history.visitPage("c.com");

        System.out.println("Current: " + history.currentPage());  // c.com
        System.out.println("Back: " + history.back());            // b.com
        System.out.println("Back: " + history.back());            // a.com
        System.out.println("Forward: " + history.forward());      // b.com

        history.visitPage("d.com");
        System.out.println("Current: " + history.currentPage());  // d.com
        System.out.println("Forward: " + history.forward());      // d.com (no forward)
    }
}