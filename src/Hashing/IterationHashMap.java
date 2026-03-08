package Hashing;
import java.util.HashMap;
import java.util.Set;
public class IterationHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 100);
        map.put("China", 150);
        map.put("USA", 50);
        //Iterate through the keys 
        Set<String> keys = map.keySet();
        System.out.println(keys);

        for(String key: map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }
    
}
