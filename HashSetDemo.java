// HashSet implements the Set interface and is backed by a HashMap.
// It stores unique elements — no duplicates allowed.
// It does not maintain any order (use LinkedHashSet or TreeSet if you want order).

// | Feature       | Behavior                     |
// | ------------- | ---------------------------- |
// | Duplicates    | ❌ Not allowed                |
// | Null Elements | ✅ One allowed                |
// | Ordering      | ❌ No guarantees              |
// | Lookup Time   | ✅ O(1) average (via hashing) |
// | Backed by     | `HashMap` internally         |

// | Method              | Purpose                                |
// | ------------------- | -------------------------------------- |
// | `add(element)`      | Adds an element if not already present |
// | `contains(element)` | Checks if element exists               |
// | `remove(element)`   | Removes the element                    |
// | `size()`            | Returns number of elements             |
// | `isEmpty()`         | Checks if the set is empty             |
// | `clear()`           | Removes all elements                   |

import java.util.Set;
import java.util.HashSet;

class UniqueWords{
    Set<String> words;

    UniqueWords(){
        words = new HashSet<>();
    }

    void addSentences(String sentence){
        sentence = sentence.replaceAll("[^a-zA-Z ]", " ").toLowerCase();
        // sentence.replaceAll("[^a-zA-Z ]", " ")
        // This uses a regular expression to replace all non-letter characters (except space) with a space.
        // 🧪 What it does:
        // "This is a test." → "This is a test "
        // "Hello, world!" → "Hello world "
        // "Java123 & C++" → "Java C "
        // 📌 Explanation of the regex:
        //     [^a-zA-Z ] means:
        //     ^ inside [] means "not"
        //     a-z and A-Z are all letters
        //     ' ' is a space
        // So this matches everything except letters and spaces → replaces them with a space.

        String[] wordsArray = sentence.trim().split("\\s+"); // split on one or more spaces
        for(String word : wordsArray){
            words.add(word.toLowerCase());
        }
    }

    void printWords(){
        for(String word : words){
            System.out.print(word + " ");
        }
        System.out.println("");
    }

    boolean containsWord(String word){
        return words.contains(word.toLowerCase());
    }
}


public class HashSetDemo {
    public static void main(String[] args) {
        UniqueWords uWords = new UniqueWords();
        uWords.addSentences("This is a test. This test is simple!");

        System.out.print("Unique words: ");
        uWords.printWords();

        System.out.println("Contains 'simple': " + uWords.containsWord("simple")); // true
        System.out.println("Contains 'hard': " + uWords.containsWord("hard"));     // false
    }
}

