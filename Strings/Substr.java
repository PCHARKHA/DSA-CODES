public class Substr {
    public static String substring(String str, int si,int ei){
        String substr  = "";
        for(int i = si;i < ei ;i ++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String s = "HELLOWORLD";
        System.out.println(substring(s,0,5));
    }
}
