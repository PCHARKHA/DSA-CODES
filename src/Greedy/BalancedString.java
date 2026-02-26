//Noye : the code maximizes the number of balanced partitions in the given string. 
// A balanced partition is defined as a substring that contains an equal number of 'R' and 'L' characters. 
/*
 This algorithm does NOT find all balanced substrings.
 It finds the MAXIMUM number of NON-OVERLAPPING balanced substrings.

 A substring is considered balanced when the count of 'L' equals the count of 'R'.

 Even though longer balanced substrings like "LLRRRL" are valid,
 the greedy approach splits the string as soon as balance is reached.
 This guarantees the maximum possible number of balanced partitions.
 */
package Greedy;
public class BalancedString {
    static int BalancedPartition(String str, int n){
        if (n == 0)
            return 0
        ;int r = 0, l = 0;
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(str.charAt(i) == 'R'){
                r++;
            }else if (str.charAt(i) == 'L'){
                l++;
            }
            if (r == l)
                {ans++;}
        }
        return ans;
    }
    public static void main(String[] args){
        String str = "LLRRRLLRRL";
        int n = str.length();
        System.out.print(BalancedPartition(str, n) + "\n");
    }
}

