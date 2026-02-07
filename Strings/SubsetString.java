public class SubsetString {
    public static void findSubset(String str , String ans,int i){
        //base case
        if( i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }

        //kaam
        findSubset(str,ans+str.charAt(i),i+1);              //for choice : Yes
        findSubset(str, ans, i+1);                          //foc choice : No
    }

    public static void main(String[] args) {
        String str = "abc", ans = "";
        findSubset(str,ans,0);
    }
}
