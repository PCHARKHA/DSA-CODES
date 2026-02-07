/* Date : 17 sept STP 3
 * Count the words in the sentence : I am Java trainer!
 */
package Strings;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        int wcount = 0;

        for(int i = 0; i<=s.length()-1;i++){
        
            if (s.charAt(i) == ' '   && s.charAt(i+1)!=' '){ //note the second condition
                wcount ++;
            }
        }
        System.out.println("Word count : " + wcount);
        sc.close();

    }
}
 //Error!! StringOut of Bound exception