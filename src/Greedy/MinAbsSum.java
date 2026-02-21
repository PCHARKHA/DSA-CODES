/*Question:Given two  array of integers, A&B, of size N . Your task is to
pair each element of A with an element of B such that 
the sum of absolute differences of all pairs is minimum.
*/
package Greedy;
import java.util.Arrays;
public class MinAbsSum {
    public static void main(String[] args) {
        int A[] = {4, 1, 8};
        int B[] = {2, 3, 6};
        int n = A.length;
        //sort both arrays
        Arrays.sort(A);
        Arrays.sort(B);

        int minSum = 0;
        for (int i = 0; i < n; i++) {
            minSum += Math.abs(A[i] - B[i]);
        }

        System.out.println("Minimum sum of absolute differences: " + minSum);

    }
    
}
