// TreeMap is a Red-Black Tree-based implementation of the NavigableMap interface.
// Stores key-value pairs, like HashMap, but keeps keys sorted.
// Sorting is based on:
//     Natural ordering (e.g., Integer, String)
//     Or a custom Comparator

// | Feature             | Behavior                             |
// | ------------------- | ------------------------------------ |
// | Key Order           | ✅ Sorted (natural or custom)         |
// | Null Key Allowed    | ❌ No (throws `NullPointerException`) |
// | Null Values Allowed | ✅ Yes                                |
// | Lookup Time         | O(log n)                             |
// | Implements          | `SortedMap`, `NavigableMap`          |

// | Method            | Purpose                        |
// | ----------------- | ------------------------------ |
// | `put(key, value)` | Insert/update a key-value pair |
// | `get(key)`        | Get value for a key            |
// | `remove(key)`     | Delete entry by key            |
// | `firstKey()`      | Get smallest key               |
// | `lastKey()`       | Get largest key                |
// | `ceilingKey(k)`   | Smallest key ≥ `k`             |
// | `floorKey(k)`     | Largest key ≤ `k`              |
// | `higherKey(k)`    | Strictly greater key           |
// | `lowerKey(k)`     | Strictly smaller key           |

import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;

class StudentRegistry {
    // TreeMap<Score, List of Students with that score>
    private TreeMap<Integer, List<String>> scoreMap;

    public StudentRegistry() {
        this.scoreMap = new TreeMap<>(); // Sorted in ascending order
    }

    // Add student and their score
    public void addStudent(String name, int score) {
        // If score is already present, add name to list
        scoreMap.putIfAbsent(score, new ArrayList<>());
        scoreMap.get(score).add(name);
    }

    // Print students by score in sorted order
    public void printStudentsByScore() {
        for (Map.Entry<Integer, List<String>> entry : scoreMap.entrySet()) {
            int score = entry.getKey();
            List<String> students = entry.getValue();
            for (String name : students) {
                System.out.println(score + ": " + name);
            }
        }
    }
}

public class TreeMapDemo {
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();

        registry.addStudent("Alice", 92);
        registry.addStudent("Bob", 78);
        registry.addStudent("Tom", 85);
        registry.addStudent("John", 92); // Same score as Alice

        System.out.println("Students by score:");
        registry.printStudentsByScore();
    }
}
