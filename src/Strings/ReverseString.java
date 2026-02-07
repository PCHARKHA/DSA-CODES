package Strings;
public class ReverseString{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ravan");
        sb.reverse();
        System.out.println("Reversed string: " + sb);

        //method 2
        String original = "Pranjal";
        String reversed = "";
        StringBuilder sb1 = new StringBuilder(original);
        
        for(int i = sb1.length()-1 ;i>=0; i--){     //original length-1 because index of l is 6
            reversed = reversed + original.charAt(i);
        }
        System.out.println(reversed);
    }
}
