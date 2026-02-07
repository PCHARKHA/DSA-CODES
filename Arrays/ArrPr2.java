//Count how many times each element appears in an array (without HashMap).
import java.util.*;
public class ArrPr2 {
    //boolean array is created to avoid double counting
    public static void Frequency(int[]arr){
        int i,j,count;
        boolean[] visited = new boolean[arr.length];
        
        for( i=0;i<arr.length;i++) {
            if (visited[i]) {
                continue; // already counted this element
            }
            count = 1; //count is inside outer for as it is reset to 1
            for(j = i + 1;j <arr.length; j++){
                if(arr[i]==arr[j]){
                count ++;
                visited[j]= true;
                }
            }
             System.out.println(arr[i] + " occurred " + count +" times.");
        }

    }
    public static void main(String[] args) {
        int arr[] = new int[6];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 6 elements of an array:");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Frequency(arr);
        sc.close();
    }
}
        




