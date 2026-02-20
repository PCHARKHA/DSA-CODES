//Reversing a Stack : main operation is to pushAtBottom and everything else stays the same
/*
Logic:
To reverse a stack using recursion, we first remove all elements from the stack.
While returning from recursion, we insert each removed element at the bottom of the stack.

reverseStack():
- Pops elements one by one until the stack becomes empty.
- Uses recursion to reach the base case.

pushAtBottom():
- Inserts an element at the bottom of the stack by temporarily removing all elements.
- Restores the removed elements after inserting the data.

Recursion uses the call stack as temporary storage, allowing us to reverse
the stack without using any extra data structure.
*/

package Stacks;
import java.util.Stack;

public class Stack5{
    public static void pushAtBottom(Stack<Integer> s , int data){
        if(s.isEmpty()){  //base case
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args){
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        //Stack right now : 1,2,3

        reverseStack(s1);
        printStack(s1);
        // 3,2,1
    }
}
