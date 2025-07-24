// HashMap stores key-value pairs.
// Uses hashing for fast lookup, insertion, and deletion.
// Allows:
//     One null key, multiple null values.
//     Duplicate values, but unique keys only.

// | Feature          | Behavior                             |
// | ---------------- | ------------------------------------ |
// | Lookup Time      | O(1) average case                    |
// | Key Uniqueness   | ✅ Yes                                |
// | Value Uniqueness | ❌ No                                 |
// | Maintains Order  | ❌ No (use `LinkedHashMap` if needed) |
// | Allows null?     | ✅ One null key, many null values     |

// | Method             | Description                            |
// | ------------------ | -------------------------------------- |
// | `put(key, value)`  | Inserts or updates value for the key   |
// | `get(key)`         | Gets value for a key                   |
// | `containsKey(key)` | Checks if key exists                   |
// | `remove(key)`      | Deletes a key-value pair               |
// | `keySet()`         | Returns all keys                       |
// | `values()`         | Returns all values                     |
// | `entrySet()`       | Returns set of `Map.Entry<key, value>` |

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class CharCounter{
    Map<Character, Integer> freq;

    public CharCounter(String str){
        freq = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            Character c = str.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
    }

    int countCharacters(String str){
        Set<Character> keys = freq.keySet();
        return keys.size();
    }
    void printFrequencies(){
        for(Map.Entry<Character, Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    int getFrequency(char c){
        return freq.getOrDefault(c, 0);
    }
}

public class HashMapDemo {
    public static void main(String[] args) {
        String input = "hello world";
        CharCounter counter = new CharCounter(input);

        System.out.println("Frequencies:");
        counter.printFrequencies();

        System.out.println("\nUnique characters: " + counter.countCharacters(input));

        char query = 'l';
        System.out.println("Frequency of '" + query + "': " + counter.getFrequency(query));
    }
}

// LinkedHashMap is an ordered HashMap
// It keeps the insertion order intact unlike HashMap which is unordered 