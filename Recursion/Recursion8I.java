//Check if an array is sorted(strictly increasing) "{1,2,3,4,5}",return type boolean
public class Recursion8I {
    public static boolean isSorted(int[] arr,int idx) {
        if(idx ==arr.length-1){  //this checks if we have reached the end of the array
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            //checking if array is sorted till now  
            return isSorted(arr,idx+1); //check for the next 2 adjacent elements
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(isSorted(arr,0)); //returns true
    }
}
