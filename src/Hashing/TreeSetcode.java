/*
TreeSet Properties
1. Stores unique elements only
2. Elements are stored in sorted order
3. Uses Red-Black Tree internally
4. Does NOT allow null elements
5. Operations add/remove/contains → O(log n)
6. Implements NavigableSet and SortedSet
*/

package Hashing;
import java.util.*;

public class TreeSetcode {

    public static void main(String[] args) {

        // creating TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // add elements
        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(30); // duplicate ignored

        // elements automatically sorted
        System.out.println("TreeSet elements: " + set);

        // contains method
        System.out.println("Contains 20? " + set.contains(20));

        // remove method
        set.remove(10);
        System.out.println("After removing 10: " + set);

        // size method
        System.out.println("Size: " + set.size());

        // important TreeSet methods
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        System.out.println("Floor of 25: " + set.floor(25));   // largest ≤ 25
        System.out.println("Ceiling of 25: " + set.ceiling(25)); // smallest ≥ 25

        // iteration using enhanced for loop
        System.out.println("Iterating using for-each:");
        for(Integer num : set){
            System.out.println(num);
        }

        // iteration using iterator
        System.out.println("Iterating using iterator:");
        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}