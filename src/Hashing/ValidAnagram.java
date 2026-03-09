//QS : Given two strings s and t, return true if t is an anagram of s&  false otherwise.

package Hashing;
import java.util.HashMap;
class ValidAnagram{
    public static boolean isAnagram(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        //storing the frequency of characters of string s in a hashmap
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch)){ //if the character of string t is not present in the map, then it is not an anagram
                return false;
            }
            map.put(ch,map.get(ch)-1); //decreasing the frequency of the character in the map by 1, as we have found a match for that character in string t
            if(map.get(ch) == 0){
                map.remove(ch);
            }
        }
        return map.isEmpty(); //if the map is empty, then it is an anagram, otherwise it is not an anagram

    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean result = isAnagram(s,t);
        System.out.println(result); //true
    }

}