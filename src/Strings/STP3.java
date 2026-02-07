/*Date : 17 Sept
Write a java program to check the given string is palindrome or not 
 * take input of string from user 
*/    
package Strings;                                      
import java.util.*;
public class STP3 {
    public static  String printRev(String s , int idx){
        if(idx == 0){
            return  String.valueOf((s.charAt(0)));
        }
        return s.charAt(idx) + printRev(s,idx-1);
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String original = sc.nextLine();
           
        
        String check =printRev(original,original.length()-1);// variable string is taken to check if it is equal to original

        if(original.equals(check)){
            System.out.println("String is a palindrome");
        }
        else{
            System.out.println("String is not a palindrome");
        }
        sc.close();
    }
}
