public class isSubsequence {

    public static boolean isSubsequence1(String s, String t) {
        if(s.length() < 1){
            return true;
        }
        int idx = 0;
       for(int i=0;i<t.length();i++){
           if(idx == s.length()){
               return true;
           }
           if(s.charAt(idx) == t.charAt(i)){
               idx++;
           }
       }

       if(idx == s.length()){
        return true;
       }

       return false;
    }
    public static void main(String[] args) {
        System.out.println(isSubsequence1("abc", "ahbgdc")); 
    }
}
