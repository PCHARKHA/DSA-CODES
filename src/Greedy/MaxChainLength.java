// Given a set of pairs, 
// find the length of the longest chain which can be formed.
//  A pair (c, d) can follow another pair (a, b) if b < c.
package Greedy;
public class MaxChainLength {
    public static void main(String[] args) {
        int pairs[][] = {{5, 24}, {15, 25}, {27, 40}, {50, 60}};
        int n = pairs.length;
        //sort the pairs based on the second element
        java.util.Arrays.sort(pairs, (a, b) -> a[1] - b[1]);

        int maxlength = 1; //count variable
        int lastEnd = pairs[0][1]; //to store the end of last selected pair

        for (int i = 1; i < n; i++) {
            if (pairs[i][0] > lastEnd) {
                maxlength++;
                lastEnd = pairs[i][1]; //update the last end
            }
        }

        System.out.println("Length of longest chain: " + maxlength);
    }
    
}
