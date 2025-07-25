// LinkedHashMap is a HashMap with a doubly linked list running through its entries.
// Maintains the insertion order or access order (configurable).
// Great for caches, tracking recently used items, preserving order of data entry.

// | Feature          | Behavior                         |
// | ---------------- | -------------------------------- |
// | Key Order        | ✅ Insertion order (default)      |
// | Access Order     | ✅ Optional (used in LRU Cache)   |
// | Key Uniqueness   | ✅ Yes                            |
// | Value Uniqueness | ❌ No                             |
// | Nulls Allowed    | ✅ One null key, many null values |
import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache{
    LinkedHashMap<Integer, Integer> cache;
    int capacity;

    public LRUCache(int capacity){
        cache = new LinkedHashMap<>(capacity, 0.75f, true); 
        // The true enables access-ordering: entries are reordered on get() or put().
        this.capacity = capacity;
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value){
        cache.put(key, value);
        if (cache.size() > capacity) {
            Integer eldestKey = cache.keySet().iterator().next();  // first = LRU
            cache.remove(eldestKey);
        }
    }

    public void printCache(){
        // Entry is a method of Map, not LinkedHashMap
        for(Map.Entry<Integer, Integer> entry : cache.entrySet()){
            System.out.print(entry.getKey() + ": " + entry.getValue() + "  ");
        }
        System.out.println("");
    }

}

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 10);
        cache.put(2, 20);
        cache.printCache();
        cache.get(1);     // returns 10
        cache.printCache();
        cache.put(3, 30);  // evicts key 2
        cache.printCache();
        System.out.println(cache.get(2));      // returns -1
        cache.printCache();
    }
}


