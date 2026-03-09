/*Properties of HashSet
Stores all unique elements only.If duplicate element is added,they get ignored
HashSet does not maintain any order of elements
HashSet allows null values but only one null value(no duplicate allowed)
Implemented using HashMap internally, where the elements of the HashSet are stored as keys in the HashMap and 
the values are a constant dummy object.
-------------------------------------
Operation:add()-O(1),remove()-O(1),contains()-O(1),isEmpty()-O(1),size()-O(1),
clear()-O(1),toString()-O(n),toArray()-O(n)
*/
package Hashing;
import java.util.*;
public class HashSetcode {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); //duplicate element, will be ignored
        set.add(null);
        set.add(null); // duplicate ignored

        System.out.println(set); //[10, 20, 30]
        System.out.println(set.contains(20)); //true
        set.remove(20);
        System.out.println(set); //[10, 30]
        System.out.println("Size of the set is:" + set.size()); //2
    }
    
}
