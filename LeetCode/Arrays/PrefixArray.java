class PrefixArray {

    public static boolean isPrefixString(String s, String[] words) {
        int idx = 0;
          for(String x : words){
            if(s.length() == idx){
                return true;
            }
            if(s.length() - idx < x.length()){
                return false;
            }
            for(int i=0;i<x.length();i++){
              if(s.charAt(idx) != x.charAt(i)){
                return false;
              }
              idx++;
            }
          }

          if(idx < s.length()){
            return false;
          }
  
          return true;
      }
    public static void main(String[] args) {
        String[] words = {"c","cc"};
        String s = "ccccccccc";

        System.out.println(isPrefixString(s, words));
    }
}