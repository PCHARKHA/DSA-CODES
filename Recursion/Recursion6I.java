//print a string "abcd" in reverse order
public class Recursion6I {
    public static void printRev(String str,int idx){
        if(str.length() == 0){
            return;
        }
        if(idx ==0 ){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }
    public static void main(String[] args) {
        String str ="abcd" ;
        printRev(str,str.length()-1);
    }

}

/*if(idx ==0  || str.length()==0)
 * above cannot be written using or because of the stmt inside if block,we are printing charAt
 * So 2 base cases are needed and priority of base cases matters!
 * Rule:Always put the base case that protects you from an error first.
 */