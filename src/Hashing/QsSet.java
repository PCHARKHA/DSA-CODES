//Qs- Union and Intersection of two arrays
package Hashing;
import java.util.*;
class QsSet {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        HashSet<Integer> set = new HashSet<>();
        // Union
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }
        System.out.println("Union: " +set.size()+" [ "+set +" ]");

        // Intersection
        int count = 0;
        System.out.println("Intersection: " + count);
        //to print elements of intersection
        set.clear(); // clear the set for intersection
        for (int num : arr1) {
            set.add(num);
        }
        System.out.print("Intersection elements: [ ");
        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.print(num + ",");
                count++;
            }
        }        System.out.println("]");
        System.out.println("Intersection count: " + count);
    }
}