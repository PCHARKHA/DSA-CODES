//Count how many times lowercase vowels occurred in a String entered by user
package Strings;
import java.util.*;
public class StringQs{
    public static void main(String[] args) {
        int count = 0;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to count vowels!");
        s = sc.nextLine();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch =='e' || ch =='o' || ch =='i' || ch =='u'){
                count ++;
            }
        }
        System.out.println("Number of lowercase vowels in string is:= " +  count);
        sc.close();
    }

        
    }
   