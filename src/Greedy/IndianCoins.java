/*Question: Given an infinite supply of Indian coins of denominations 1, 2, 5, 10, 20, 50, 100, 200, 500 and 2000. 
Find the minimum number of coins needed to make a given value

*/
package Greedy;

import java.util.ArrayList;

public class IndianCoins {
    public static void main(String[] args) {
        int coins[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        int value = 590;
        int count = 0; //to count the number of coins
        int n = coins.length;
        ArrayList<Integer> ans = new ArrayList<>(); //to store the coins used

        //start from the largest coin and keep subtracting until value becomes zero
        for (int i = n - 1; i >= 0; i--) {
            while (value >= coins[i]) {
                value -= coins[i];
                ans.add(coins[i]); //add the coin to the list
                count++;
            }
        }

        System.out.println("Minimum number of coins needed: " + count);
        System.out.println("Coins used: " + ans);
    }
    
}
