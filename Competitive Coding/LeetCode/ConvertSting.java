import java.util.Arrays;

class ConvertSting {

    public static String swap(String str,int i,int j){
        char[] ch = str.toCharArray();
        
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        
        String res = new String(ch);
        
        return res;
    }
    public static boolean canBeEqual(String s1, String s2) {
       
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        for(int i=0;i<ch1.length;i++){
            if(ch1[i] != ch2[i]){
                return false;
            }
        }
        
        ch1 = s1.toCharArray();
        ch2 = s1.toCharArray();
        
        String str = s1;
        
          for (int i = 0; i < s1.length() - 1; i++) {
              // if(str.equals(s2)){
              //     return true;
              // }
            if (str.charAt(i) == s2.charAt(i)) {
                continue;
            }
              if(i == 0){
                  if (str.charAt(i) == s2.charAt(i + 2)){
                      str = swap(str,0,2);
                  }
              } else if(i == 1 && str.charAt(i) == s2.charAt(i + 2)){
                       str = swap(str,1,3);
              }else {
                return false; // Cannot make them equal
            }
        }

        return str.equals(s2);
    
    }
    public static void main(String[] args) {
        System.out.println(canBeEqual("igtg", "tigg"));
    }
}