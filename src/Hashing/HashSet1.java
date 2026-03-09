/*using Iterators and enhanced for loop on HashSet */
package Hashing;
import java.util.*;
public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("grape");
        System.out.println(set); //[banana, orange, apple, grape]
        //using enhanced for loop to iterate through the HashSet
        //Enhanced for loop internally uses an Iterator to iterate through the collection, but it provides a more concise and readable syntax compared to using an explicit Iterator.
        System.out.println("Using enhanced for loop:");
        for(String fruit : set){
            System.out.println(fruit);
        }
        //using iterator to iterate through the HashSet
        System.out.println("Using iterator:");
        //Syntax: Iterator<Type> iterator_name = collection.iterator();
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String fruit = it.next();
            System.out.println(fruit);
        }
    }
}
/*When should Iterator be used instead of for-each?
Answer:Use Iterator when you need to remove elements during iteration.
Iterator<String> it = set.iterator();
while(it.hasNext()){
    if(it.next().equals("apple")){
        it.remove();
    }
}
 */
