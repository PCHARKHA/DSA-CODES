//To print x^n (stack height = n)
package Recursion;
public class Recursion3 {
    public static int calcPow(int x,int n){
        if (n==0){          //base case 1
            return 1;
        }
        if (x==0){          //base case 2
            return 0;
        }
        int powXnm1 = calcPow(x,n-1);
        int powXn = x * powXnm1;
        return powXn;
    }
    public static void main(String[] args){
        System.out.println(calcPow(2,3));
    }
}
