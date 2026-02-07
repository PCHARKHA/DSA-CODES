import java.util.Arrays;

public class Arrays_Practice{
    //Syntax of array : datatype[] variable name = new datatype[size]
        //int[] arr = new int[5] ;
    
    //PROGRAM FOR MAXIMUM VALUE OF AN ARRAY
    public static int max(int[]arr){            //  Maximun value of an Array
        int maxVal = arr[0];
        for(int i = 1;i<arr.length;i++){   //started from i = 1 as arr[0] is assigned to maxVal
            if(arr[i]> maxVal){
                maxVal = arr[i];
            }
        }
    return maxVal ;
    }

    public static int Array_sum(int[]arr){      //Sum of all elements in an integer array
        int sum = 0 ;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    // To count number of even elements in array and odd elements in array
    static int EvenCount = 0, OddCount = 0;   // static variables are class-level variables, not local variables. 
    public static void Even_Odd (int[]arr){
       for(int i = 0; i < arr.length;i++){
            if(arr[i]%2 == 0){
                EvenCount ++ ;
            }
            else{
                OddCount++;
            }
        }
   }
   // PROGRAM TO PRINT ALL THE ELEMENTS AT EVEN INDICES
   public static void EvenPrint(int[]arr){
        for(int i = 0; i<arr.length ; i ++){
            if(arr[i] % 2 ==0){
                System.out.println(arr[i]);
            }
        }
   }
   //REVERSE THE ARRAY IN PLACE
   public static void ReverseFunc(int[]arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start]= arr[end] ;
            arr[end] = temp ;
            
            start ++;
            end --;
        }
    }

    

    public static void main(String[] args){
        
        int[] num = {1,4,7,6,8,9} ; 
        int result = max(num) ;
        System.out.println("Maximum number from array is :" + result);

        int sum_result = Array_sum(num);
        System.out.println("Sum of all the elements in an array is :" + sum_result);

        Even_Odd(num);
        System.out.println("Number of even elements in the array is: "+ EvenCount);
        System.out.println("Number of odd elements in the array:" + OddCount);

        System.out.println("Elements at even indices in the array are: "  );
        EvenPrint(num);

        ReverseFunc(num);
        System.out.println(Arrays.toString(num));
    }
}
