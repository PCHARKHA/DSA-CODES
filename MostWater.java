/*height = [1,8,6,2,5,4,8,3,7]
Use two lines to form such a container that it holds maximum water
Approach: 1)Brute Force     2)Two pointer Approach */
import java.util.*;
class mostWater{
// 1: BruteForce
    public static int storeWater(ArrayList<Integer> height){
        int maxWater= 0;
        int n = height.size();
        for(int i =0;i<n;i++){
            for (int j =i+1;j<n;j++){
                int ht = Math.min(height.get(i),height.get(j));
                int width = j-i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater,currWater);
            }
        }
        return maxWater;
    }
//2 -Two pointer approach
    public static int storeWaterOptimize(ArrayList<Integer> height){
        int Lp=0;
        int Rp=height.size();
        int maximumWater= 0;
        while(Lp <Rp){
            int ht = Math.min(height.get(Lp),height.get(Rp));
            int width = Rp-Lp;
            int currWater = ht*width;
            maximumWater = Math.max(maximumWater,currWater);

            if(height.get(Lp) < height.get(Rp)){
                Lp ++;
            }
            else{
                Rp--;   // Rp < Lp
            }
        }
        return maximumWater;
    }
    public static void main(String[]args){
        ArrayList<Integer> height = new ArrayList<>();
            height.add(1);
            height.add(8);
            height.add(6);
            height.add(2);
            height.add(5);
            height.add(4);
            height.add(8);
            height.add(3);
            height.add(7);
            System.out.println("Container with mostwater can store water:  " + storeWater(height));
            System.out.println("Container with mostwater can store water: " + storeWaterOptimize(height));

    }

}