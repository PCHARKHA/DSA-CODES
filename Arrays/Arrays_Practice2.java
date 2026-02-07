public class Arrays_Practice2 {
    //I ] Check if array is sorted in ascending order
    public static boolean Ascending_Sort (int[]arr){
        for(int i = 0; i<arr.length -1 ;i++){
            if(arr[i] >= arr[i+1]){
                return false;
            }
        }
        return true;
    }
    // why is return true outside the for loop?
    // Answer:because if it was written inside the loop it will be printed multiple number of times
    public static void main(String[]args){
        int[] numbers = {1,6,9,4,7};
        boolean result = Ascending_Sort(numbers);
        System.out.println("Is the array arranged in ascending order:" + result);
    }
}
