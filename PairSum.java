/*Find if any pair in sorted arrayList has a target sum 
list  = [1,2,3,4,5]
Approach: 1)Brute Force     2)Two pointer Approach */
import java.util.*;

public class PairSum {
    public static boolean pairSum1(ArrayList<Integer> list , int target){
        int n = list.size();
        for(int i =0;i<n;i++){
            for (int j =i+1;j<n;j++){
               if(list.get(i) + list.get(j) == target){
                return true;
               }
            }
        }
        return false;
    }
    public static boolean pairSumOpt(ArrayList<Integer> list , int target){
        int Lp =0;
        int Rp = list.size() - 1;
        while( Lp !=Rp){
            if (list.get(Lp) + list.get(Rp) == target){
                return true;
            }
            else if (list.get(Lp) + list.get(Rp) < target){
                Lp ++;
            }
            else{
                Rp --;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(pairSum1(list , 5));
        System.out.println(pairSumOpt(list,5));
        
    }
}



    
