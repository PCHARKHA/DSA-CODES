/*
Question: Given weights and values of n items, 
put these items in a knapsack of capacity W to get the maximum total value in the knapsack. In fractional knapsack, we can break items for maximizing total value of knapsack.
value =[60, 100, 120] , weight =[10, 20, 30] , W = 50
*/
package Greedy;
public class FractionalKnapsack {
    public static void main(String[] args) {
        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;
        int n = value.length;

        double ratio[][] = new double[n][2];
        for (int i = 0; i < n; i++) {
            ratio[i][0] = (double) value[i] / weight[i]; // value to weight ratio
            ratio[i][1] = i; // original index
        }

        // sort by ratio in descending order
        java.util.Arrays.sort(ratio, (a, b) -> Double.compare(b[0], a[0]));

        double totalValue = 0.0;
        for (int i = 0; i < n; i++) {
            int idx = (int) ratio[i][1]; //idx is index of item in original array
            if (weight[idx] <= W) { //includes the whole item
                totalValue += value[idx];
                W -= weight[idx];
            } else {
                totalValue += ratio[i][0] * W; // take fraction of the item
                break;
            }
        }

        System.out.println("Maximum value in Knapsack: " + totalValue);
    }
    
}
