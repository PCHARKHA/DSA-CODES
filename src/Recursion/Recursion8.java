package Recursion;
// Move all 'x' to the end of the string where string is "axbcxxd"
// output needed : abcdxxxx
public class Recursion8 {
    public static void Move(int idx ,int count,String str,String newstr){
        if(idx == str.length()){        //base case
            for(int i = 0;i<count;i++){
                newstr += 'x';
            }                               
            System.out.println(newstr);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            Move(idx+1, count, str, newstr); 
        }
        else{
            newstr = newstr + currChar;
            Move(idx+1, count, str, newstr);
        }
        /*  we have called the function Move in both if and else blocks
        why? --> because we want to continue the process of moving 'x' to the end of the string
        in else block if we do not give recursive call then the function will terminate here and 
         print abcd whole..maybe only "a". */
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        String newstr = "";
        Move(0, 0, str,newstr );

    }
}
