
/*
LinkedHashSet Properties
1. Stores only unique elements (duplicates ignored)
2. Maintains insertion order
3. Allows one null element
4. Internally uses LinkedHashMap
5. Average time complexity of add/remove/contains → O(1)
6. Not synchronized (not thread-safe)
*/

package Hashing;
import java.util.*;

public class LinkedHS {

    public static void main(String[] args) {

        // creating LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // add elements
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("banana"); // duplicate ignored
        set.add(null);

        System.out.println("LinkedHashSet elements: " + set);

        // contains method
        System.out.println("Contains apple? " + set.contains("apple"));

        // remove method
        set.remove("banana");
        System.out.println("After removing banana: " + set);

        // size method
        System.out.println("Size: " + set.size());

        // iteration using enhanced for loop
        System.out.println("Iterating using for-each:");
        for(String fruit : set){
            System.out.println(fruit);
        }

        // iteration using iterator
        System.out.println("Iterating using iterator:");
        Iterator<String> it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}