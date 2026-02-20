// Q1)Push at the bottom of the stack
//Solution : Recursion : O(n)
//In recursion - jo cheez pehle nikalti hai voh baadmei dalti hai aur vice versa
package Stacks;
import java.util.Stack;
public class Stack3{
    public static void pusHAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){ //base case
            s.push(data);
            return;
        }
        int top = s.pop();  //top ko nikalte jao till stack becomes empty
        pusHAtBottom(s,data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
            s.push(1);
            s.push(2);
            s.push(3);

            pusHAtBottom(s,4);
            while(!s.isEmpty()){
                System.out.println(s.pop());
            }
    }
}

    

