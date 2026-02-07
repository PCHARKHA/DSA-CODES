//Find the second largest number in an array without sorting.
/*  Condition 1 -If elememt> max then value of prev max is alloted to second Max
Condition 2 - secMax<elememt<max then directly update secMax only
*/
import java.util.*;
public class ArrPr1 {
    public static  int Secmax(int[]arr ){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                secMax = max ;
                max = arr[i];
            }
            else if (arr[i] > secMax && arr[i]!= max){
                secMax = arr[i];
            }
            }
            return secMax;
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers in an array:");
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
         int result = (Secmax(arr));
         System.out.println("The second largest element in the array is:-" +result);
         sc.close();
        
    }
}
