package Recursion;
/*tower of Hanoi
Rules : 1)Only one disk transferred in one step
2)No disk is placed on top of a smaller disk        
*/
public class Recursion5I {
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("Transfer disk "+ n +" from "+ src + " to "+ dest);
                return;
            }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("Transfer disk "+ n +" from "+ src + " to "+ dest);
        towerOfHanoi(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        towerOfHanoi(3,"S","H","D");
    }
}
