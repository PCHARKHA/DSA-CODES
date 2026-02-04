//Important qs
//Next Greater Element Qs
/*The Next Greater Element for an element x is the first element to the right of x ,
that is strictly greater than x. 
If no such element exists, consider the next greater element as -1.
arr = [6, 3, 8, 2, 7]
*/
import java.util.Stack;
public class Stack6 {
    public static void main(String[] args) {
        int arr[]= {6,3,8,2,7};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];
        for(int i = arr.length-1; i>=0;i--){
            //step 1
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //step 2 
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }
            else{
                nextGreater[i]= arr[s.peek()]; 
                //for RHS :the stack stores the index but we want the element at the index,hence[]
            }
            //step 3
            s.push(i); //we are pushing index of element on stack
        }
        for(int i =0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
        
    }
    
}
