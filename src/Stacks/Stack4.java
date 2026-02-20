//Reverse a string using stack data structure\
/*Step 1:Push each character of the string into the stack till the string becomes empty
Step 2:Pop each character from the stack and append it to a new string
 till the stack becomes empty
*/
package Stacks;
import java.util.Stack;
public class Stack4 {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr =s.pop();
            result.append(curr);
        }
        return result.toString(); //converted from StringBuilder to String

    }
    public static void main(String[] args){
        String str = "abc";
        String result = reverseString(str);
        System.out.println(result);
    }
}
