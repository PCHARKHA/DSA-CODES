package Recursion;
public class Recursion2 {
    public static int calcFact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int fact_nm1 = calcFact(n-1); // Recursive call first 
        int fact_n = n * fact_nm1;
        return fact_n;
        /*call first so in the stack memory it will be stored first 
        and then the value of fact_n will be calculated.
        i.e from n=5 to n=1 stack grows,at n==1,stack returns 1 to the 
        recursive call of n==2 ,where we do 2*1=2 and return 2 ahead */
}
    public static void main(String[]args){
        int result = calcFact(5);
        System.out.println(result);
    }
}
