package Recursion;
/*In the string "abaacdaefaah",element ='a';
Check the first and last occurrence of the element*/
public class Recursion7I {
    public static int first = -1;
    public static int last = -1;
    /*Q)Why are first and last declared as static?
    These variables maintain their values across all recursive calls.
    They're declared once for the entire class, not reset every time the function runs*/
    public static void findOccurence(String str,int idx,char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
           if(first == -1){
            first = idx;
           }
            else{
                last = idx;
            }     
        }
        findOccurence(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccurence(str, 0, 'a');
    }
}
