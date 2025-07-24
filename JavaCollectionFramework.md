The Java Collection Framework (JCF) is a unified architecture for representing and manipulating collections in Java. It provides interfaces, implementations (classes), and algorithms to store, retrieve, and manipulate data efficiently.

📚 Key Components of the Java Collection Framework
1. Interfaces (Abstract Data Types)
    Collection – root interface for all collections
        List – ordered collection (can contain duplicates)
        ⤷ e.g., ArrayList, LinkedList
        Set – unordered collection (no duplicates)
        ⤷ e.g., HashSet, TreeSet, LinkedHashSet
        Queue – elements processed in a specific order
        ⤷ e.g., PriorityQueue, ArrayDeque
        Map – key-value pairs (not a true child of Collection)
        ⤷ e.g., HashMap, TreeMap, LinkedHashMap

2. Classes (Implementations)
    List implementations: ArrayList, LinkedList, Vector, Stack
    Set implementations: HashSet, LinkedHashSet, TreeSet
    Queue implementations: PriorityQueue, ArrayDeque
    Map implementations: HashMap, TreeMap, LinkedHashMap, Hashtable, ConcurrentHashMap

3. Algorithms
    Provided via Collections utility class:
        Sorting: Collections.sort(list)
        Searching: Collections.binarySearch(list, key)
        Shuffling: Collections.shuffle(list)
        Reversing: Collections.reverse(list)

✅ Example Code
import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        // List example
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("List: " + fruits);

        // Set example (no duplicates)
        Set<String> uniqueFruits = new HashSet<>(fruits);
        uniqueFruits.add("Banana"); // Will not be added again
        System.out.println("Set: " + uniqueFruits);

        // Map example
        Map<String, Integer> fruitCount = new HashMap<>();
        fruitCount.put("Apple", 3);
        fruitCount.put("Banana", 5);
        fruitCount.put("Orange", 2);

        System.out.println("Map: " + fruitCount);

        // Queue example
        Queue<String> fruitQueue = new LinkedList<>();
        fruitQueue.add("Apple");
        fruitQueue.add("Banana");
        fruitQueue.add("Orange");

        System.out.println("Queue: " + fruitQueue);
        System.out.println("Removed from queue: " + fruitQueue.poll());
        System.out.println("Queue after poll: " + fruitQueue);
    }
}

🔑 Summary
JCF unifies how data is handled in Java.
Choose List for ordered collections, Set for uniqueness, Map for key-value pairs.
Use Collections for common operations like sorting/shuffling.