package Recursion;
public class Recursion{
    public static void printNum(int n){
        if(n == 10)      //base case 
            return;
        System.out.println(n);
        printNum(n+1);      //kaam(recusrsive call)
           }
    public static void main(String[]args){
        int n = 5;
        printNum(n);
    }
}