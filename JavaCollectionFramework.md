📚 What is JCF?
The Java Collections Framework is a set of interfaces and classes in the java.util package that provides standardized ways to store, access, and manipulate groups of objects.

Think of it as:
Built-in containers for data (like Python’s list, set, dict)
Includes lists, sets, maps, queues, etc.


🔑 Core Interfaces in JCF
| Interface | Description                                 | Example Classes                       |
| --------- | ------------------------------------------- | ------------------------------------- |
| `List`    | Ordered collection (can contain duplicates) | `ArrayList`, `LinkedList`             |
| `Set`     | Unordered, **no duplicates** allowed        | `HashSet`, `TreeSet`, `LinkedHashSet` |
| `Map`     | Key-value pairs (like a dictionary)         | `HashMap`, `TreeMap`, `LinkedHashMap` |
| `Queue`   | FIFO structure                              | `PriorityQueue`, `ArrayDeque`         |


📦 Key Implementations
| Class        | Description                                         |
| ------------ | --------------------------------------------------- |
| `ArrayList`  | Dynamic array, fast random access                   |
| `LinkedList` | Doubly-linked list, good for frequent insert/delete |
| `HashSet`    | No duplicates, unordered                            |
| `TreeSet`    | Sorted set                                          |
| `HashMap`    | Key-value map, fast lookup                          |
| `TreeMap`    | Sorted key-value map                                |

