//to calculate power of x^n but stack height should be log n 

public class Recusrion4 {
    public static int calPow(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){     //n is even
            return calPow(x,n/2) * calPow(x,n/2);
        }
        else{           //n is odd
            return calPow(x,n/2) * calPow(x,n/2)*x;
        }
    }
    public static void main(String[] args) {
        System.out.println(calPow(2, 3));
    }
}
